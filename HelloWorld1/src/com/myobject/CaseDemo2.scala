package com.myobject

import scala.util.Random

object CaseDemo2 {
  def main(args: Array[String]): Unit = {
    val arr=Array("hello",1,2.0)
    val v=arr(Random.nextInt(3))
    println(v)
    v match {
      case x:Int=>println("Int"+x)
      case y:Double if(y >=0)=>println("Double"+y)
      case z:String=>println("String"+z)
      case _ => throw new Exception("not match exception")
    }
  }

}
