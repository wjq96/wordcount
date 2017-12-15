package com.akka

import scala.actors.Actor


case class SyncMsg(i: Int, str: String)
case class AsyncMsg(i: Int, str: String)
case class ReplyMsy(i: Int, str: String)
class AppleActor extends Actor{

  def act(): Unit ={
    while (true){

      receive{
        case "start"=>println("starting")
        case SyncMsg(id,msg)=>{
          println(id+",sync"+msg)
          Thread.sleep(5000)
          sender ! ReplyMsy(3,"finished")//！无回执异步
        }
        case AsyncMsg(id,msg)=>{
          println(id+",async"+msg)
          Thread.sleep(5000)
        }
      }
    }
  }
}

object AppleActor{

  def main(args: Array[String]): Unit = {
    val a=new AppleActor
    a.start()
    a!AsyncMsg(1,"hello actor")
    println("异步消息发送完成")
    val content = a!? SyncMsg(2,"hello actor")//!? 同步，会不断等待
    println(content)

    val reply=a!!SyncMsg(2,"hello actor") //!! 有回值异步
    println(reply.isSet)
    val c=reply.apply()
    println(reply.isSet)//reply.isSet  获取回值
    println(c)

  }
}
