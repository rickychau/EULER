package euler

import collection.mutable
object problem16 {
  def main(args: Array[String]) = {
    SumOfDigit(2, 1000)
  }

  def SumOfDigit(base: Int, power: Int){
    var arr = mutable.ArrayBuffer(base)
    for(i <- 1 until power){
      if (arr.length == 1){
        arr(0) *= base
        if (arr(0) > 9){
          arr += arr(0)/10
          arr(0) = (arr(0)%10)
        }
      }
      else{
        for (j <- 0 until arr.length)
          arr(j) *= base
        for (j <- 0 until (arr.length - 1)){
          arr(j + 1) += arr(j)/10
          arr(j) = (arr(j) % 10)
        }
        if (arr(arr.length - 1) > 9){
          arr += arr(arr.length - 1)/10
          arr(arr.length - 2) = (arr(arr.length - 2) % 10)
        }
      }
    }
    println (arr.sum)
  }

}
