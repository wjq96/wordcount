package com.akka

import scala.actors.{Actor, Future}
import scala.collection.mutable
import scala.collection.mutable.ListBuffer
import scala.io.Source

case class SubmitTask(fileName:String)
case object StopTask
case class ResultTask(result:Map[String,Int])
class Task extends Actor{
  override def act(): Unit = {
    loop{
      react{
        case SubmitTask(fileName)=>{
          val result=Source.fromFile(fileName).getLines.flatMap(_.split(" ")).map((_,1)).toList.groupBy(_._1).mapValues(_.size)
          sender ! ResultTask(result)
        }
        case StopTask=>{
          exit()
        }
      }
    }
  }
}
object WordCount {

  def main(args: Array[String]){
    val files=Array("E://1.txt","E://2.txt")
    val replaySet = new mutable.HashSet[Future[Any]]
    val resultList = new ListBuffer[ResultTask]
    for(f<- files){
      val t = new Task
      val replay = t.start() !! SubmitTask(f)
      replaySet += replay

    }
    while(replaySet.size>0){
      val toCumpute = replaySet.filter(_.isSet)
      for(r<- toCumpute){
        val result = r.apply()
        resultList += result.asInstanceOf[ResultTask]
        replaySet.remove(r)
      }
      Thread.sleep(100)
    }
    val finalResult=resultList.map(_.result).flatten.groupBy(_._1).mapValues(x=>x.foldLeft(0)(_+_._2))
    println(finalResult)
  }
}
