package com.bigdata.scala.chapter05

object Scala07_Function_Hell_2 {


  def main(args: Array[String]): Unit = {


    // TODO 函数式编程语言 - 地狱版

    def test(): Unit = {

      println("test...")
    }
    // 将函数对象赋值给一个变量,那么这个变量其实就是函数
    // 既然这个变量就是函数，所以这个变量可以传参后执行的.
    val f = test _

    println(f)// 打印函数对象

    f() // 执行函数

  }




}
