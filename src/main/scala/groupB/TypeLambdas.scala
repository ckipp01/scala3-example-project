package groupB

/**
  * Type Lambdas: https://dotty.epfl.ch/docs/reference/new-types/type-lambdas.html
  */
object TypeLambdas:

  type M = [X, Y] =>> Map[Y, X]

  type Tuple = [X] =>> (X, X)

  def test(): Unit =
    val m: M[String, Int] = Map(1 -> "1")
    println(m)

    val tuple: Tuple[String] = ("a", "b")
    println(tuple)

