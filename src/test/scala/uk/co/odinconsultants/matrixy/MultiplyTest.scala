package uk.co.odinconsultants.matrixy

import uk.co.odinconsultants.matrixy.mocks.MockMultiply

class MultiplyTest extends munit.FunSuite {

  implicit val multiplier = new MockMultiply

  import uk.co.odinconsultants.matrixy.mocks.TestObjects._
  import Multiply.ops._

  test ("multiply compatible matrices") {
    _3x7 x _7x8
  }

  test("incompatible multiplication does not compile") {
    assertNoDiff(
      compileErrors("_3x7 x _8x7"),
      """|error:
         |type mismatch;
         | found   : uk.co.odinconsultants.matrixy.mocks.MockMatrix[uk.co.odinconsultants.matrixy.mocks.TestObjects._8,uk.co.odinconsultants.matrixy.mocks.TestObjects._7]
         |    (which expands to)  uk.co.odinconsultants.matrixy.mocks.MockMatrix[eu.timepit.refined.api.Refined[Int,eu.timepit.refined.generic.Equal[Int(8)]],eu.timepit.refined.api.Refined[Int,eu.timepit.refined.generic.Equal[Int(7)]]]
         | required: uk.co.odinconsultants.matrixy.mocks.MockMatrix[uk.co.odinconsultants.matrixy.mocks.TestObjects._7,?]
         |    (which expands to)  uk.co.odinconsultants.matrixy.mocks.MockMatrix[eu.timepit.refined.api.Refined[Int,eu.timepit.refined.generic.Equal[Int(7)]],?]
         |_3x7 x _8x7
         |       ^
         |""".stripMargin
    )
  }

}
