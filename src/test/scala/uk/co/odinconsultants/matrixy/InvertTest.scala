package uk.co.odinconsultants.matrixy

class InvertTest  extends munit.FunSuite {

  implicit val inversion = new MockInvert

  import TestObjects._
  import Invert.ops._

  test ("invert square matrix") {
    _7x7.inv
  }

  test("cannot invert non-square matrix") {
    assertNoDiff(
      compileErrors("_3x7.inv"),
      """|error: Cannot prove that uk.co.odinconsultants.matrixy.TestObjects._3 =:= uk.co.odinconsultants.matrixy.TestObjects._7.
         |_3x7.inv
         |     ^
         |""".stripMargin
    )
  }

}
