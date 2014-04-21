object problem9 {

  def main(args: Array[String]) = {
    PythaTri(1000)
  }

  def PythaTri(s: Int) = {
    var goon: Boolean = true
    val bound1: Int = s/3
    val bound2: Int = s/2
    for (i <- 1 to bound1){
      for (j <- i to bound2){
        if (i*i + j*j == (s-i-j)*(s-i-j))
          println(i*j*(s-i-j))
      }
    }
  }
}
