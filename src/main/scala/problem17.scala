object problem17 {

  def main(args: Array[String]) = {
    var ssum: Int = 0
    for (i <- 1 to 999){
      ssum += CountH(i) + CountT(i) + CountO(i)
      println("i = " + i)
      println(CountH(i) + CountT(i) + CountO(i))
    }
    println(ssum + 11)
  }

  def CountH(x: Int) = {
    var num1 = 0
    if (x/100 == 0)
      num1 = 0
    else if (x - 100*(x/100) == 0)
      num1 = CountO(x/100) + 7
    else
      num1 += CountO(x/100) + 10 // for "hundred and"
    num1
  }

  def CountT(x: Int) = {
    val k: Int = x - (x/100)*100
    val k1 = k/10
    def num33(k1: Int): Int = k1 match {
      case 2 => ("twenty".length)
      case 3 => ("thirty".length)
      case 4 => ("forty".length)
      case 5 => ("fifty".length)
      case 6 => ("sixty".length)
      case 7 => ("seventy".length)
      case 8 => ("eighty".length)
      case 9 => ("ninety".length)
      case _ => 0
    }
    val num3 =
      if (k == 10)  3
      else if (k > 10 && k < 20) (CountT1(k)- CountO(k))
      else if (k < 10)  0
      else num33(k1)

    num3
  }

  def CountT1(x: Int) = {
    def num4(x: Int): Int = (x%10) match{
      case 1 => ("eleven".length)
      case 2 => ("twelve".length)
      case 3 => ("thirteen".length)
      case 4 => ("fourteen".length)
      case 5 => ("fifteen".length)
      case 6 => ("sixteen".length)
      case 7 => ("seventeen".length)
      case 8 => ("eighteen".length)
      case 9 => ("nineteen".length)
    }
    num4(x)
  }

  def CountO(x: Int) = {
    def num2(x: Int): Int = (x%10) match {
      case 0 => 0
      case 1 => ("one".length)
      case 2 => ("two".length)
      case 3 => ("three".length)
      case 4 => ("four".length)
      case 5 => ("five".length)
      case 6 => ("six".length)
      case 7 => ("seven".length)
      case 8 => ("eight".length)
      case 9 => ("nine".length)
    }
    num2(x)
  }

}
