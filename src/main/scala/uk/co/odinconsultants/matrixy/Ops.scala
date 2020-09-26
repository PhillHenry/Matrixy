package uk.co.odinconsultants.matrixy

import simulacrum._

import simulacrum.typeclass

@typeclass trait Semigroup[A] {
  @op("|+|") def append(x: A, y: A): A
}
