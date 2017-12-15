package com.myobject

import scala.collection.mutable.ArrayBuffer


class Session{

}

object SessionFactory {

  var counts = 5
  val sessions =new ArrayBuffer[Session]()
  while(counts > 0){
    sessions += new Session
    counts -=1

  }
  def getSession():Session={
    sessions.remove(0)
  }
}
