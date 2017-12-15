package com.myobject

import scala.util.Random

object CaseDemo1 {

  def main(args: Array[String]): Unit = {
    val arr = Array("YoshizawaAkiho","YuiHatano","AoiSola")
    val name = arr(Random.nextInt(arr.length))
    name match {
      case "YoshizawaAkiho" =>println("吉泽老师……")
      case "YuiHatano"=>println("波多老师……")
      case _=>println("真不知道在说什么……")
    }
  }

}
