package com.myobject

import scala.util.Random

case class SubmitTask(id:String,name:String)
case class HeartBeat(time:Long)
case object CheckTimeOutTask


object CaseDemo4 extends App{

  val arr=Array(CheckTimeOutTask,HeartBeat(12333),SubmitTask("0001","task-0001"))


  arr(Random.nextInt(arr.length)) match {
    case SubmitTask(id,name)=>{
      println(s"$id,$name")
    }
    case HeartBeat(time)=>{
      println(time)
    }
    case CheckTimeOutTask=>{
      println("check")
    }
  }

}
