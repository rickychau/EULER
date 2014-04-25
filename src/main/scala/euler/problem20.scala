package euler

import collection.mutable
object problem20 {
  def main(args: Array[String]) = {
    println(Factorial(100))
  }

  def Factorial(x: Int) = {
    var arr = mutable.ArrayBuffer(1)
    for (i <- 1 to x){
      if (arr.length == 1 && arr(0) < 10){
        arr(0) *= i
      }
      else{
        for (j <- 0 until arr.length)
          arr(j) *= i

        for (j <- 0 until (arr.length)-1){
          arr(j + 1) += arr(j)/10
          arr(j) = arr(j) % 10
        }
      }
      while (arr(arr.length -1) > 10){
        arr += arr(arr.length -1)/10
        arr(arr.length -2) =  arr(arr.length -2)%10
      }
    }
    arr.sum
  }
}
