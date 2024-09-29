package com.bigdata.scala.chapter05

object Scala07_Function_Hell_5_Test {


  def main(args: Array[String]): Unit = {


    // TODO 函数式编程语言 - 地狱版
    def calc(x : Int,f : (Int,Int) => Int ,y:Int): Int = {
        f( x,y )
    }

    def +(x : Int,y : Int) :Int = {
        x + y
    }

    def -(x : Int,y : Int) :Int = {
      x - y
    }

    val result: Int = calc(5, _ * _, 3)

    println(result)







  }




}
