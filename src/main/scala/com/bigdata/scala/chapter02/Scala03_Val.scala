package com.bigdata.scala.chapter02

// javadoc
object Scala03_Val {

  def main(args: Array[String]): Unit = {

    // TODO 变量

    // TODO 声明变量

    var name : String = "zhangsan";
    val email : String = "zhangsan";

    // var 关键字修饰的变量，值可以被改变,称之为可变变量
    name = "lisi"
    // val 关键字修饰的变量，值不可以被改变,称之为不可变变量
    // var和val关键字声明的变量，在编译后没有本质上的区别,会在编译时进行约束
    // email = "lisi@111.com"

    // TODO 使用(访问) 变量
    println(name)
    println(email)



  }

}
