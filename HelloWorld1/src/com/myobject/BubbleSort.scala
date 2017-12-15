package com.myobject

object BubbleSort {
  /*def main(args: Array[String]): Unit = {
    val arr=Array(1,5,3,6,7,9,34,47,8,-11,0)
    val len=arr.length;
    for(i <- 1 until len){
      for(j <- i until len){
        if(arr(len-i)>arr(len-1-j)){
          var a=arr(len-1-j)
          arr(len-1-j)=arr(len-i)
          arr(len-i)=a
        }
      }

    }
    println(arr.mkString(","))

  }*/

  def sort(list: List[Int]): List[Int] = list match {
    case List() => List()
    case head :: tail => compute(head, sort(tail))
  }

  def compute(data: Int, dataSet: List[Int]): List[Int] = dataSet match {
    case List() => List(data)
    case head :: tail => if (data <= head) data :: dataSet else head :: compute(data, tail)
  }

  def main(args: Array[String]) {
    val list = List(3, 12, 43, 23, 7, 1, 2, 0)
    println(sort(list))
  }


}
