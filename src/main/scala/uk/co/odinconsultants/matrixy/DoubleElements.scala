package uk.co.odinconsultants.matrixy

import simulacrum.{op, typeclass}
import uk.co.odinconsultants.matrixy.Matrix.{Length, ZeroToA}

@typeclass trait DoubleElements[M[_ <: Length, _ <: Length]] {
  @op("_") def element[A <: Length, B <: Length, X <: ZeroToA[A], Y <: ZeroToA[B]](m: M[A, B])(x: X, y: Y): Double
}