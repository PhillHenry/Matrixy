package uk.co.odinconsultants.matrixy

import simulacrum.{op, typeclass}
import uk.co.odinconsultants.matrixy.Matrix.Length

@typeclass trait Invert[M[_ <: Length, _ <: Length]] {
  @op("inv") def invert[A <: Length, B <: Length](x: M[A, B])(implicit a: A =:= B): M[A, A]
}