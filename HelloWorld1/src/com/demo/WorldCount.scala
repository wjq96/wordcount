package com.demo

object WorldCount {

  def main(args: Array[String]): Unit = {
    //方法一：
    /*val lines=List("hello world","jerry hello","world jerry","tom hello jerry")
    val words=lines.flatMap(_.split(" "))
    val words_one=words.map((_,1))
    val words_group=words_one.groupBy(_._1)
    val words_count = words_group.mapValues(_.length).toList.sortBy(_._2).reverse
    println(words_count)*/



    //方法二,与方法一相同
    /*val lines=List("hello world","jerry hello","world jerry","tom hello jerry")
    val result=lines.flatMap(_.split(" ")).map((_,1)).groupBy(_._1).mapValues(_.length).toList.sortBy(_._2).reverse
    println(result)*/

    //方法三
    /*val lines=List("hello world","jerry hello","world jerry","tom hello jerry")
    val result=lines.flatMap(_.split(" ")).map((_,1)).groupBy(_._1).mapValues(_.foldLeft(0)(_+_._2)).toList.sortBy(_._2).reverse
    println(result)*/

    //方法四
    val lines=List("hello world","jerry hello","world jerry","tom hello jerry")
    val result=lines.flatMap(_.split(" ")).map((_,1)).groupBy(_._1).map(t=>(t._1,t._2.size)).toList.sortBy(_._2).reverse
    println(result)

  }
}
