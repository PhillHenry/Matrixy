package uk.co.odinconsultants.matrixy

class MultiplyTest extends munit.FunSuite {

  implicit val multiplier = new MockMultiply

  import TestObjects._
  import Multiply.ops._

  test ("multiply compatible matrices") {
    _3x7 x _7x8
  }

  test("incompatible multiplication does not compile") {
    compileErrors("_3x7 x _8x7")
  }

}
