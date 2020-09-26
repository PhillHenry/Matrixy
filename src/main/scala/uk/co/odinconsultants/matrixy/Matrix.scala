package uk.co.odinconsultants.matrixy

import uk.co.odinconsultants.matrixy.Matrix.ExactInt

abstract class Matrix[ROWS <: ExactInt, COLS  <: ExactInt] {

  def multiply[T <: ExactInt](x: Matrix[COLS, T]): Matrix[ROWS, T]

}

object Matrix {
  import eu.timepit.refined.api.Refined
  import eu.timepit.refined.generic.Equal
  type ExactInt = Int Refined Equal[A] forSome { type A <: Int }
}