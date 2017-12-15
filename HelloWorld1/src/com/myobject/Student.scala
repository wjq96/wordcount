package com.myobject

class Student {

  private var myName="leo"
  def name="your name is"+myName
  def name_=(newValue:String){
    println("you cannot edit your name!!")
  }


}
