package com.myobject

object Dog {

  private val CONSTANT="汪汪汪"

  def main(args: Array[String]): Unit = {
    val p = new Dog
    p.name="123"
    p.printName()
    val d=Dog()
  }

  def apply(): Unit ={
    println("apply invoked")
  }

}
class Dog{
  val id= 1
  private var name="qst"
  def printName(): Unit ={
    println(Dog.CONSTANT+name)
  }
}
