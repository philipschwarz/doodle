package docs

// The "Image" DSL is the easiest way to create images
import doodle.image._
// Colors and other useful stuff
import doodle.core._

object Chessboard {
  val blackSquare = Image.rectangle(30, 30).fillColor(Color.black)
  val redSquare = Image.rectangle(30, 30).fillColor(Color.red)

// A chessboard, broken into steps showing the recursive construction
  val twoByTwo =
    (redSquare
      .beside(blackSquare))
      .above(blackSquare.beside(redSquare))

  val fourByFour =
    (twoByTwo
      .beside(twoByTwo))
      .above(twoByTwo.beside(twoByTwo))

  val chessboard =
    (fourByFour
      .beside(fourByFour))
      .above(fourByFour.beside(fourByFour))

  chessboard.save("chessboard.png")
}
