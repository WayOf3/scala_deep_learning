package com.bigdata.scala.chapter05

object Scala03_Function {


  def main(args: Array[String]): Unit = {


    // TODO 函数式编程语言
    // 函数 的本质就是java中的方法
    // scala源码中，方法就是函数，编译后的字节码中，函数就是方法
    // 函数编译成方法时，增加了修饰符： private static final
    // 函数编译成方法时，函数名会自动发生变化，为了避免和方法名冲突
    def test() : Unit = {
        println("test....")
    }



    this.test()
  }

  def test() : Unit = {
    println("test method....")
  }



}
