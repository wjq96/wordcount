package com.demo

object HelloWorld {
    def sayHello(name: String, age: Int) {
      if (age > 18) {
        printf("hi %s, you are a big boy\n", name); age
      }
      else {
        printf("hi %s, you are a little boy\n", name);
        age
      }
    }
  def main(args: Array[String]): Unit = {
    println("hello world")
       for (i <- 1 to 9; j <- 1 to i) {
         if (j == i) {
           println(j + "*" + i + "=" + j * i)
         } else {
           print(j + "*" + i + "=" + j * i + " ")
         }
       }

       sayHello("leo", 30)
     }

}
