package com.bigdata.scala.chapter05

object Scala12_Function {


  def main(args: Array[String]): Unit = {


    // TODO 函数式编程语言 - 惰性函数
    // 函数是否在调用时马上执行

    def test() : String = {
      println("function...")
      "zhangsan"
    }

    lazy val a = test()

    // val a = test() // 10000 User
    println("---------") // 1hour
    println(a)

    // 正常
    // function...
    // ------
    // zhangsan

    // lazy
//    ---------
//    function...
//    zhangsan








  }




}
