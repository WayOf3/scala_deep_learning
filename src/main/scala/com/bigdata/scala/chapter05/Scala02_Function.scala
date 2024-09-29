package com.bigdata.scala.chapter05

object Scala02_Function {


  def main(args: Array[String]): Unit = {


    // TODO 函数式编程语言
    // 函数 & 方法

    // 1.函数可以声明在任意的位置，方法只能声明在类中
    def test() : Unit = {
      println("test function...")
    }

    // 如果函数名称和方法名称相同，那么默认情况下会调用函数，如果没有函数，那么会调用方法
    // 方法和对象相关，而函数是独立使用的
    this.test()

  }

  def test() : Unit = {
    println("test method...")
  }

}
