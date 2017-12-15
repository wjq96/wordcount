package com.demo

import scala.collection.mutable

object TestMutSet {

  def main(args: Array[String]): Unit = {
    val set1 = new mutable.HashSet[Int]()
    set1.add(1)
    set1 += 2
    //add等价于+=
    set1.add(4)
    set1 ++= Set(1,3,5)
    println(set1)
    //删除一个元素
    set1 -= 5
    set1.remove(2)
    println(set1)

  }
}
