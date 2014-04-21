object problem15 {

  def main(args: Array[String]) = {
    println (Routes(20))
  }
  def Routes(x: Int) = {
    var rr: Long = 1
    for (i <- 0 until x){
      if ((2*x - i) % 2 == 0)
        rr *= 2L
      else
        rr *= (2*x - i).toLong
    }
    rr/factorial(x/2)
  }

  def factorial(x: Int) = {
    var prod: Long = 1
    for (i <- 1 to x){
      prod *= i
    }
    prod
  }

}
