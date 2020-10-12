package uk.co.odinconsultants.matrixy

import eu.timepit.refined.numeric.Interval

object Matrix {
  import eu.timepit.refined._
  import eu.timepit.refined.api.Refined
  import eu.timepit.refined.generic.Equal

  type Length = Int Refined Equal[A] forSome { type A <: Int }
  type ZeroToA[A <: Length] = Int Refined Interval.ClosedOpen[W.`0`.T, A]
}