package uk.co.odinconsultants.matrixy

import uk.co.odinconsultants.matrixy.Matrix.ExactInt

abstract class Matrix[ROWS <: ExactInt, COLS  <: ExactInt]

object Matrix {
  import eu.timepit.refined.api.Refined
  import eu.timepit.refined.generic.Equal

  type ExactInt = Int Refined Equal[A] forSome { type A <: Int }
}