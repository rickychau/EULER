object problem18 {

  def main(args: Array[String]) = {
    val arr0 = Array(75)
    val arr1 = Array(95, 64)
    val arr2 = Array(17, 47, 82)
    val arr3 = Array(18, 35, 87, 10)
    val arr4 = Array(20, 4, 82, 47, 65)
    val arr5 = Array(19, 1, 23, 75, 3, 34)
    val arr6 = Array(88, 2, 77, 73, 7, 63, 67)
    val arr7 = Array(99, 65, 4, 28, 6, 16, 70, 92)
    val arr8 = Array(41, 41, 26, 56, 83, 40, 80, 70, 33)
    val arr9 = Array(41, 48, 72, 33, 47, 32, 37, 16, 94, 29)
    val arr10 = Array(53, 71, 44, 65, 25, 43, 91, 52, 97, 51, 14)
    val arr11 = Array(70, 11, 33, 28, 77, 73, 17, 78, 39, 68, 17, 57)
    val arr12 = Array(91, 71, 52, 38, 17, 14, 91, 43, 58, 50, 27, 29, 48)
    val arr13 = Array(63, 66, 4, 68, 89, 53, 67, 30, 73, 16, 69, 87, 40, 31)
    val arr14 = Array(4, 62, 98, 27, 23, 9, 70, 98, 73, 93, 38, 53, 60, 4, 23)
    val Arr = Array(arr0, arr1,arr2, arr3, arr4, arr5, arr6, arr7, arr8, arr9, arr10, arr11, arr12, arr13, arr14)

    println (BestRoute(Arr))
  }

  def BestRoute(Tri: Array[Array[Int]]) = {
    for (i <-  (0 until (Tri.length-1)).reverse){
      for (j <- 0 to i){
        Tri(i)(j) += Tri(i+1)(j).max(Tri(i+1)(j+1))
      }
    }
    Tri(0)(0)
  }
}
