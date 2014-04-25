package euler

object problem5 {

  def main(args: Array[String]) = {
    println (smallestm(20))
  }

  def Divisible(x: Int, y: Int) = {
    var Indicator: Int = 0
    if (y % x == 0)
      Indicator = 1
    Indicator
  }

  def smallestm(bound: Int) = {
    var small: Int = bound
    var goon: Boolean = true
    while (goon){
      var arr = new Array[Int](bound)
      for (i <- 1 to bound){
        arr(i-1) = Divisible(i, small)
      }
      if (arr.sum == bound){
        goon = false
      }
      else
        small += 1
    }
    small
  }
}
