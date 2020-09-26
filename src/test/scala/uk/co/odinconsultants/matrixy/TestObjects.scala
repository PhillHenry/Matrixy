package uk.co.odinconsultants.matrixy

import eu.timepit.refined.W
import eu.timepit.refined.api.Refined
import eu.timepit.refined.auto._
import eu.timepit.refined.generic.Equal

object TestObjects {
  type Exactly[T] = Int Refined Equal[T]
  type _3 = Exactly[W.`3`.T]
  type _7 = Exactly[W.`7`.T]
  type _8 = Exactly[W.`8`.T]
  val _3x7: MockMatrix[_3, _7]   = MockMatrix(3: _3, 7: _7)
  val _7x8: MockMatrix[_7, _8]   = MockMatrix(7: _7, 8: _8)
}
