package uk.co.odinconsultants.matrixy

import uk.co.odinconsultants.matrixy.Matrix.Length

case class MockMatrix[ROWS <: Length, COLS  <: Length](nRows: ROWS, nCols: COLS)

class MockMultiply extends Multiply[MockMatrix] {
  override def multiply[A <: Length, B <: Length, C <: Length](x: MockMatrix[A, B])(y: MockMatrix[B, C]): MockMatrix[A, C] =
    new MockMatrix[A, C](x.nRows, y.nCols)
}
