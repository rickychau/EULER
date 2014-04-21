object problem6 {
  def main(args: Array[String]) = {
    var dif: Int = 0
    dif = sumsquare(1,100) - squaresum(1,100)
    println (dif)
  }

  def squaresum(startp: Int, endp: Int)={
    var squares: Int = 0
    for (i <- startp to endp)
      squares += i*i

    squares
  }

  def sumsquare(startp1: Int, endp1: Int) = {
    var sum: Int = 0
    for (i <- startp1 to endp1)
      sum += i

    sum * sum
  }
}
