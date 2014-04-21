import collection.mutable
object problem4 {

  def main (args: Array[String]) = {
    println(LargestPP(999))
  }

  def LargestPP(bound: Int) = {
    var PPlist = mutable.ArrayBuffer(0)
    for (i <- 1 to bound){
      for (j <- 1 to bound){
        var mul: String = (i * j).toString()
        if (mul == mul.reverse){
          PPlist += (i * j)
        }
      }
    }
    PPlist.max
  }
}
