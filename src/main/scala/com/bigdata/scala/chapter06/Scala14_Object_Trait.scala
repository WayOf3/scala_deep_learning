package com.bigdata.scala.chapter06


object Scala14_Object_Trait {

  def main(args: Array[String]): Unit = {


    // TODO 面向对象编程 - 特征
    // scala 中特质语法编译后其实就是interface,但是裂解的似乎不要仅仅局限interface
    // 将特质(trait) 理解为interface和abstract class 的结合体会更好一些。
    // trait 可以继承类
    val user = new User()



  }


  trait Run extends Exception{
    println("trait")
  }

  class User extends Exception with Run {
    println("user")
  }

  class Person{

  }



}


