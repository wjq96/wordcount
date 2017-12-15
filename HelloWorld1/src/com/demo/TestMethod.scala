package com.demo

//def定义的是方法，不能定义函数
object TestMethod {


  def m1(a:Int,b:Int)={
    a+b
  }
  def m2(nums:Int*) ={
    var s=0;
    for(i<- nums){
      s +=i
    }
    s
  }
  var f:(Int,Int)=>Int={(x,y)=>x+y}

  var f1 ={(x:Int,y:Int)=>x+y}
  var f2:(Int,Double)=>(Double,Int)={
    (x,y)=>{
      val xx=x*10;
      val yy=y*10;
      (yy,xx)
    }
  }


  def func(f:(Int,Int)=>Int)=f(2,8)
  val fun=(x:Int,y:Int)=>x*y

  def m(x:Int,y:Int)={x+y}
  def main(args: Array[String]): Unit = {
   /* val m=m1(10,15)
    print(m)*/
   /* val m=m2(1,2,3,4)
    print(m)*/
    /*var test=f(10,11)
    print(test)*/
   /*var test=f1(10,11)
    print(test)*/
   /*var test=f2(10,11)
    print(test)*/
   /* val num=func((x:Int,y:Int)=>x*y)
    print(num)  //16*/
   /*val num=func(fun)
    print(num)  //16*/
    /*val num =func(m _)
    print(num) //10*/
   /*val num =func(m)
    print(num) //10*/
  }


}
