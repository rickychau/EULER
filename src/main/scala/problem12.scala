object problem12 {

  def main(args: Array[String]) = {
    var goon: Boolean = true
    var k: Int = 2
    while (goon){
      if (NoOfF(TriangleNum(k)) >= 500){
        println(TriangleNum(k))
        goon = false
      }
      else
        k += 1
    }
  }

  def TriangleNum(m: Int) = {
    var TriNo: Int = 0
    for (i <- 1 to m){
      TriNo += i
    }
    TriNo
  }

  def NoOfF(x: Int) = {
    var num: Int = 0
    for (i <- 1 to x){
      if (x % i == 0)
        num += 1
    }
    num
  }


}
