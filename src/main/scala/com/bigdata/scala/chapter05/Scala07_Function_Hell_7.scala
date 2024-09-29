package com.bigdata.scala.chapter05

object Scala07_Function_Hell_7 {


  def main(args: Array[String]): Unit = {


    // TODO 函数式编程语言 - 地狱版
    // 1.将函数对象作为变量赋值使用
    // 2.将函数对象作为参数使用



    // TODO 3.scala也可以将函数对象作为返回结果返回
    // 函数的返回值类型一般情况下不声明，使用自动推断
//    def outer()  = {
//      def inner() : Unit = {
//          println("inner...")
//      }
//
//      inner _
//    }


//    val f = outer()
//
//    f()
    // javascript: 函数式编程语言
    //test()()()()
//    outer()()

  def outer(x : Int) = {
    def mid( f : (Int,Int) => Int  ) = {
        def inner ( y : Int) = {

            f(x,y)
        }
      inner _
    }

    mid _
  }


//    val mid = outer(10)
//    val inner = mid(_+_)
//    val result = inner(20)
//    println(result)

    println(outer(10)(_ + _)(20))




  }




}
