package uk.co.odinconsultants.matrixy

class InvertTest  extends munit.FunSuite {

  implicit val inversion = new MockInvert

  import TestObjects._
  import Invert.ops._

  test ("multiply compatible matrices") {
    _7x7.inv
  }

  test("incompatible multiplication does not compile") {
    assertNoDiff(
      compileErrors("_3x7.inv"),
      """|error: Cannot prove that uk.co.odinconsultants.matrixy.TestObjects._3 =:= uk.co.odinconsultants.matrixy.TestObjects._7.
         |_3x7.inv
         |     ^
         |""".stripMargin
    )
  }

}
