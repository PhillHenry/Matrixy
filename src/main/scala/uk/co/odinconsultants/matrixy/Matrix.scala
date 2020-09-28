package uk.co.odinconsultants.matrixy

object Matrix {
  import eu.timepit.refined.api.Refined
  import eu.timepit.refined.generic.Equal

  type Length = Int Refined Equal[A] forSome { type A <: Int }
}