package euler

import math._


object problem10 {

  def main(args: Array[String]) = {
    println (PrimeArray(2000000))
  }

  def PrimeArray(upperb: Long): Long = {
    var i: Long = 2
    var ssum: Long = i
    i += 1
    while (i < upperb){
      if (TestPrime(i))
        ssum += i
    i+=1
    }
    ssum
  }

  def TestPrime(x: Long) = {
    var isP: Boolean = true
    var i: Long = 2
    while (isP && i <= sqrt(x)){
      if (x % i == 0)
        isP = false
      else
        i += 1
    }
    isP
  }

}
