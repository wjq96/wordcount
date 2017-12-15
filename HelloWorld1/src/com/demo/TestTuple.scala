package com.demo

object TestTuple {
  def main(args: Array[String]): Unit = {
    var t=("leo",30,"男")
    println(t._2)
    println(t._1)
    println(t._3)
    val name=Array("leo","zhangsan","lisi","wuliu","liuqi")
    val ages = Array(23,44,55,88)
    val nameAges = name.zip(ages);
    for((name,ages)<-nameAges){
      println(name+"="+ages)
    }
  }

}
