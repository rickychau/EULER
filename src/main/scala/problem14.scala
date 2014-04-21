import collection.mutable
object problem14 {

  def main(args: Array[String]) = {
    var k: Int = 0
    var len: Long = 0
    for (i <- 0 to 1000000){
      if (generateColSeq(i) > len){
        k = i
        len = generateColSeq(i)
      }
    }
    println (k)
  }
  def generateColSeq(startp1: Int) = {
    var startp: Int = startp1
    var count: Long = 0
    var goon: Boolean =  true
    while (goon){
      if (startp % 2 == 0)
        startp += startp/2
      else
        startp += 3 * startp + 1

      if (startp == 1)
        goon = false
      else
        count += 1
    }
    count
  }

}
