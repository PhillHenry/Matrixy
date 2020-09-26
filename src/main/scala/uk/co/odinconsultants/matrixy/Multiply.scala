package uk.co.odinconsultants.matrixy

import uk.co.odinconsultants.matrixy.Matrix.ExactInt

trait Multiply {
  def multiply[A <: ExactInt, B <: ExactInt, C <: ExactInt](x: Matrix[A, B], y: Matrix[B, C]): Matrix[A, C]
}
