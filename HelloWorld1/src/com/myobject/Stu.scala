package com.myobject

class Stu{

  private var myAge=0

  def age_=(newValue : Int) {
    if (newValue > 0) myAge = newValue
    else println("illegal ages")
  }
  def age = myAge
  def older(s:Stu){
    myAge >s.myAge
  }
}
object Stu {


  def main(args: Array[String]): Unit = {
    val s=new Stu
    s.myAge=8
    println(s.myAge)
  }
}
