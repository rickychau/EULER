package euler

object problem2 {

  def main(args: Array[String]) = {
    println(sumevenfibonacci(4000000))
  }
  def sumevenfibonacci (x:Int) : Int = {    //sum even , fib < 4000000
  var i = 1
    var j = 0
    var sum = 0
    var k = 0

    while (k < x)
    {
      k = i+j
      j=i
      i=k
      if (k%2 == 0)
        sum = sum + k;
      println(k)
    }
    sum
  }
}
