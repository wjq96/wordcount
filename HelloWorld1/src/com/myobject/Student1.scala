package com.myobject

class Student1 (var name:String,var age:Int) {

  println("执行主构造器")
  private var gender = "male"
  def this(name:String,age:Int,gender:String){
    this(name,age)
    println("执行辅助构造器")
    this.gender=gender
  }

}
object Student1{

  def main(args: Array[String]): Unit = {
    val s=new Student1("abc",111)
    s.name="zlkdcdk"
    println(s.name)
    println(s.age)
  }
}


