package com.myobject



class  Person{

  val id = "9527"
  var name="华安"
  private var gender:String="male"
  private[this] var pop:String="_"
  def printPop: Unit ={
    println(pop)
  }
}
object Person {

  def main(args: Array[String]): Unit = {
    val p=new Person
    println(p.id+" "+p.name)
    p.name="唐伯虎"
    println(p.id+" "+p.name)
    p.gender="男"
    println(p.gender)
    p.printPop
  }

}
