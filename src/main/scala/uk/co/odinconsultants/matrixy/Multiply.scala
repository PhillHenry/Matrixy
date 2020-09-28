package uk.co.odinconsultants.matrixy

import simulacrum.{op, typeclass}
import uk.co.odinconsultants.matrixy.Matrix.Length

@typeclass trait Multiply[M[_ <: Length, _ <: Length]] {
  @op("x") def multiply[A <: Length, B <: Length, C <: Length](x: M[A, B])(y: M[B, C]): M[A, C]
}
