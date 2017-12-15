package com.demo

import scala.collection.mutable.ArrayBuffer

object TestArray {

  def main(args: Array[String]): Unit = {
    /*val arr=Array(1,2,3,4,5);
    arr(arr.length-1)=10
    print(arr(arr.length-1))
    for(i<- arr){
      print(i);
    }*/
    /*val a=new Array[Char](10)
    print(a(0))*/

    /*val b=Array("hello","world")
    b(0)="zzz"  //修改b0的值
    for(i <- b){
      print(i)
    }*/
    /*val b=Array("leo",30)
    print(b(1))*/

    /*val af = ArrayBuffer[String]()
    af.append("zhangsan", "lisi", "wangwu")
    af += "1"
    af += ("2", "3") //直接加入数据
    af ++= Array("4", "5") //加入一个其他集合的所有数据
    val num = af.trimEnd(2)
    print(af.length)
    for (i <- af) {
      print(i)
    }*/

    /*val aff = ArrayBuffer[String]()
    aff.append("zhangsan","lisi","wangwu","zhaoliu","pingqi")
    aff.insert(3,"yisb","jsdh")*/
    /*val num=aff.toArray
    num.toBuffer
    for(i <- aff){
      println(i)
    }*/
    /*for(i <- 0 until (aff.length , 2)){
      println(aff(i))
    }*/
    /*for(i <- (0 until (aff.length , 2)).reverse) {
      println(aff(i))
    }*/


    /*val a= Array(1,5,3,4,0)
    //数组求和
    val sum=a.sum
    //求最大值
    val max = a.max
    //求最小值
    val min= a.min
    println(sum)
    println(max)
    println(min)
    //排序
    scala.util.Sorting.quickSort(a)
    for(i <- a){
      print(i)
    }
    println()
    print(a.mkString(","))*/


    /*//对array进行转换
    val a = Array(1,2,3,4,5)
    val a2 = for(x<- a) yield x*x
    for(i <- a2){
      print(i)
    }
    println()
    print(a2.mkString(","))
    println()
    //对ArrayBuffer进行转换
    val b= ArrayBuffer[Int]()
    b+=(1,2,3,4,5)
    val b2= for(ele <- b) yield ele*ele
    for(i <- b2){
      print(i)
    }
    println()
    print(b2.mkString(","))
    println()
    //结合if守卫，仅转换所需要的元素
    val b3=for(ele <- b2 if ele%2 ==0) yield ele*ele
    print(b3.mkString(","))*/


    /*val arr=Array(1,3,5,8,2,4,0)
    for(i <- (0 until arr.length).reverse){
      print(arr(i))
    } //0428531*/

   /* val arr=Array(1,3,5,8,2,4,0)
    for(i <- arr.reverse){
      print(i)
    } //0428531*/
   /*val arr=Array(1,3,5,8,2,4,0)
    print(arr.reverse.mkString(",")) //0,4,2,8,5,3,1*/

    /*val arr=Array(1,3,5,8,2,4,0)
    print(arr.toString) //[I@35851384*/
    /*val arr=ArrayBuffer(1,3,5,8,2,4,0)
    print(arr.toString) //ArrayBuffer(1, 3, 5, 8, 2, 4, 0)
    val a=arr.remove(1,3)//从第一个开始删除三个元素
    print(arr.toString)//ArrayBuffer(1, 2, 4, 0)*/


    val arr=ArrayBuffer(10,9,278,23,-1,23,4,-5,9,-98)
    var firstNumNegtive = false;
    val indexArr=for(i<- (0 until arr.length) if (!firstNumNegtive||arr(i)>0)) yield{
      if(arr(i)<0){
        firstNumNegtive = true
      }
      i
    }
    for(i <-(0 until indexArr.length)){
      arr(i)=arr(indexArr(i))
    }
    arr.trimEnd(arr.length-indexArr.length)
    print(arr.mkString(","))
  }
}
