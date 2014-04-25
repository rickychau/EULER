package euler

import math._

object problem3 {

  def main(args: Array[String]) = {
    val bound = BigInt(600851475143L)
    var i = BigInt(600851475143L)
    var gofind: Boolean = true
    while (gofind){
      if (isFactor(i, bound) ) {
        if (isPrime(i)){
          println(i)
          gofind = false
        }
        else
          i -= 1
      }
      else{
        i -= 1
      }
    }
  }

  def isPrime(x: BigInt) = {
    var i = BigInt(2)
    var isP: Boolean = true
    while (isP && i <= x){
      if (x % i == 0)
        isP = false
      i += 1
    }
    isP
  }

  def isFactor(x: BigInt, y: BigInt) = {
    var isF = false
    if (y % x == 0)
      isF = true
    isF
  }
}
