package uk.co.odinconsultants.matrixy

import simulacrum.{op, typeclass}
import uk.co.odinconsultants.matrixy.Matrix.ExactInt

@typeclass trait Multiply[M[_ <: ExactInt, _ <: ExactInt]] {
  @op("x") def multiply[A <: ExactInt, B <: ExactInt, C <: ExactInt](x: M[A, B])(y: M[B, C]): M[A, C]
}
