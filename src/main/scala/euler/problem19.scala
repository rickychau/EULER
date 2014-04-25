package euler

object problem19 {

  def main(args:Array[String]) = {
    println(CountDays(2000,12,31))
  }

  def CountDays(year: Int,month: Int, day: Int) = {
    var arr = Array(1900,1,1)
    var goon: Boolean = true
    var count: Int = 1
    var mon: Int = 0
    while (goon){
      count += 1

      if (arr(2) == 31 && arr(1)==12){
        arr(0) += 1
        arr(1) = 1
        arr(2) = 1
      }
      else if ( arr(2) == 31 && Array(1,3,5,7,8,10).indexOf(arr(1)) != -1){
        arr(1) += 1
        arr(2) = 1
      }
      else if (arr(2) == 30 && Array(4,6,9,11).indexOf(arr(1)) != -1){
        arr(1) += 1
        arr(2) = 1
      }
      else if (arr(2) == 29 && arr(1) == 2 && arr(0)%100 != 0 && arr(0)%4 == 0){
        arr(2) = 1
        arr(1) = 3
      }
      else if (arr(2) == 29 && arr(1) == 2 && arr(0)%100 == 0 && arr(0)%400 == 0){
        arr(2) = 1
        arr(1) = 3
      }
      else if (arr(2) == 28 && arr(1) == 2 && arr(0)%100 == 0){
        arr(2) = 1
        arr(1) = 3
      }
      else if (arr(2) == 28 && arr(1) == 2 && arr(0)%4 != 0){
        arr(2) = 1
        arr(1) = 3
      }
      else
        arr(2) += 1

      if (arr(2) == 1 && count%7 == 0 && arr(0)>= 1901)
        mon += 1
      println(arr(0) +"-"+ arr(1)+"-" +arr(2))
      goon = !(arr(0)== year && arr(1)== month && arr(2)==day)
    }
    mon
  }
}
