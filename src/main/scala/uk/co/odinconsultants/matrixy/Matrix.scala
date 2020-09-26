package uk.co.odinconsultants.matrixy

object Matrix {
  import eu.timepit.refined.api.Refined
  import eu.timepit.refined.generic.Equal

  type ExactInt = Int Refined Equal[A] forSome { type A <: Int }
}