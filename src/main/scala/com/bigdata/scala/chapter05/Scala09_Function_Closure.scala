package com.bigdata.scala.chapter05

import scala.util.control.Breaks._

object Scala09_Function_Closure {


  def main(args: Array[String]): Unit = {


    // TODO 函数式编程语言 - 闭包

    // 闭包的实现，不同的scala版本不一致。
    // scala在2.12版本前，闭包使用的是匿名函数类实现。
    // scala在2.12版本后，闭包使用的是改变函数的声明完成的。
//    def outer ( a : Int )   = {
//       def inner ( b : Int ) = {
//            a + b
//       }
//       inner _
//    }
//
//    val inner  =  outer(10)
//    val result: Int = inner(20)
//    println(result)

//    val  name = "zhangsan"
//
//    def test() : Unit = {
//      println(name)
//    }
//
//    val f = test _
//
//    f()

    // 总结 : 闭包的场景
    // 1. 内部函数使用了外部的数据，改变数据的声明周期
    // 2. 将函数作为对象使用，改变函数本身的生命周期
    // 3.所有匿名函数都有闭包
    // 4.内部函数返回到外部使用也会有闭包







  }




}
