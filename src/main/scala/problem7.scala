import math._
object problem7 {

  def main(args: Array[String]) = {
    var arr =  new Array[Int](10001)
    arr(0) = 2
    for (i <- 1 until 10001){
      arr(i) = NextPrime(arr(i-1))
    }
    println(arr(10000))
  }

  def NextPrime(startp: Int) = {
    var nextp: Int = startp + 1
    var goon : Boolean = true
    while (goon){
      if (isPrime2(nextp))
        goon = false
      else
        nextp += 1
    }
    nextp
  }

  def isPrime2(x: Int) = {
    var i: Int = 2
    var isP: Boolean = true
    while (isP && (i < x)){
      if (x % i == 0)
        isP = false
      i += 1
    }
    isP
  }
}
