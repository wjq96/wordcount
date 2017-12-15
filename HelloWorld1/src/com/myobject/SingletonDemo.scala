package com.myobject

object SingletonDemo {

  def main(args: Array[String]): Unit = {
    //单例对象
    val session1 = SessionFactory.getSession
    println(session1)
    val session2 = SessionFactory.getSession
    println(session2)
    val session3 = SessionFactory.getSession
    println(session3)
    val session4 = SessionFactory.getSession
    println(session4)
    val session5 = SessionFactory.getSession
    println(session5)

  }
}
