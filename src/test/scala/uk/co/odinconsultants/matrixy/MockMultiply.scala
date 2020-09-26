package uk.co.odinconsultants.matrixy

import uk.co.odinconsultants.matrixy.Matrix.ExactInt

case class MockMatrix[ROWS <: ExactInt, COLS  <: ExactInt](nRows: ROWS, nCols: COLS)

class MockMultiply extends Multiply[MockMatrix] {
  override def multiply[A <: ExactInt, B <: ExactInt, C <: ExactInt](x: MockMatrix[A, B])(y: MockMatrix[B, C]): MockMatrix[A, C] =
    new MockMatrix[A, C](x.nRows, y.nCols)
}
