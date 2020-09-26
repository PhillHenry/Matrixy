package uk.co.odinconsultants.matrixy

import eu.timepit.refined.W
import eu.timepit.refined.api.Refined
import eu.timepit.refined.generic.Equal
import eu.timepit.refined._
import eu.timepit.refined.api.Refined
import eu.timepit.refined.auto._

class MultiplyTest extends munit.FunSuite {

  implicit val multiplier = new MockMultiply

  type Exactly[T] = Int Refined Equal[T]
  type _3 = Exactly[W.`3`.T]
  type _7 = Exactly[W.`7`.T]
  type _8 = Exactly[W.`8`.T]
  val _3x7: MockMatrix[Exactly[W.`3`.T], Exactly[W.`7`.T]]   = MockMatrix(3: Exactly[W.`3`.T], 7: Exactly[W.`7`.T])
  val _7x8: MockMatrix[Exactly[W.`7`.T], Exactly[W.`8`.T]]   = MockMatrix(7: Exactly[W.`7`.T], 8: Exactly[W.`8`.T])

  test ("multiply") {
    multiplier.multiply(_3x7)(_7x8)
  }
}
