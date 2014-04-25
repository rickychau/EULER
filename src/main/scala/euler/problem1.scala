package euler

object problem1 {

  def main(args: Array[String]) = {
    println(mul35(1000))
  }
  def mul35 (x:BigInt) : BigInt = {     //multiple of 3 and 5
  var sum =0
    var i = 0
    while (i < x)
    {
      if (i %3 ==0 || i%5 ==0)
        sum = sum+i
      i += 1
    }
    sum
  }


}
