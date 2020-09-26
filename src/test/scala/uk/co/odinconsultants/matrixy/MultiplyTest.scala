package uk.co.odinconsultants.matrixy

class MultiplyTest extends munit.FunSuite {

  implicit val multiplier = new MockMultiply

  import TestObjects._

  test ("multiply compatible matrices") {
    multiplier.multiply(_3x7)(_7x8)
  }
}
