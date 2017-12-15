package com.demo

//import scala.collection.mutable.Map
object TestMap {
  def main(args: Array[String]): Unit = {
    /*val ages = Map("zhangsan"->30,"lisi"->40,"wangwu"->50)
    //ages("zhangsan")=60
    println(ages("zhangsan"))
    val ages1=Map(("Leo",30),("Jen",25),("Jack",23));
    println(ages1("Leo"))
    val ages2 = new scala.collection.mutable.HashMap[String,Int]
    ages2 +=("mike"->25)

    val leoAge=ages1("Leo")
    val Leoage = if(ages.contains("leo")) ages1("leo") else 0
    println(leoAge)
    println(Leoage)
    val leoage1=ages1.getOrElse("leo",0)*/
   // println(leoage1)
   /*修改可变Map
   ages1("Leo")=32
    ages-="zhangsan"*/

    /*val scoreMap = Map("leo"->90,"jack"->60,"tom"->70)
    val names=List("leo","jack","tom")
    println(names.map(scoreMap(_)))
    val scoreMap1=Map("leo"->List(80,90,110),"jack"->List(29,389,99),"tom"->List(67,89,98))
    println(names.map(scoreMap1(_)))
    println(names.flatMap(scoreMap1(_)))
    val a="abc"
    println(a.collect{case 'a'=>1;case 'b'=>2;case 'c'=>3})
    names.foreach(println _)

    println(List(1,2,3,4,5).reduceLeft(_-_))
    println(List(1,2,3,4,5).reduceRight(_-_))
    println(List(1,2,3,4).foldRight(10)(_-_))
    println(List(1,2,3,4).foldLeft(10)(_-_))
    println(List(1,2,3,4).foldRight(10){(m,n)=>println(m+":"+n);m-n})
*/


    //练习题
    val lst0 = List(1,7,9,8,0,3,5,4,6,2)
    val list1 = lst0.map(_*10)
    val list2=lst0.filter(_%2==0)
    val list3=lst0.sorted
    //val list3_1=lst0.sortBy(x=>x)
    val list3_1=lst0.sortBy(_.toString)//将整型转换成String型排序
    val list4=lst0.sorted.reverse
    val list5=lst0.grouped(4).toList
    val list6=list5.flatten
    val lst1=Array("a s d","a e r","e r g")
    val list7=lst1.flatMap(_.split(" ")).toSet
    val list7_1=lst1.flatMap(_.split(" ")).toList
    val list8=lst0.par.fold(100)((x,y)=>x+y)
    println(list1)
    println(list2)
    println(list3)
    println(list3_1)
    println(list4)
    println(list5)
    println(list6)
    println(list7)
    println(list7_1)
    println(lst0.sum)
    println(lst0.par.sum)
    println(list8)



  }
}
