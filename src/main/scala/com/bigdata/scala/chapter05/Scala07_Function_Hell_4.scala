package com.bigdata.scala.chapter05

object Scala07_Function_Hell_4 {


  def main(args: Array[String]): Unit = {


    // TODO 函数式编程语言 - 地狱版

    def sum( x : Int, y:Int ) : Int = {
       x + y
    }

    def diff( x : Int, y:Int ) : Int = {
      x - y
    }


    def test( f: (Int,Int) => Int ) : Unit = {
      val result = f(10,20)
      println(result)
    }

//    val i: Int = sum(10, 20)
//    println(i)

    // TODO 下划线的省略
    // 将函数对象作为参数使用，就类似于将逻辑进行传递，意味着逻辑可以不用写死
    // 将函数名称直接作为参数传递给另外一个函数，此时，不需要使用下划线。
    // 使用下划线的目的时不让函数执行，而是将它作为对象使用，那么如果能明确知道函数不执行，那么下划线可以省略
    // TODO 函数的名称真的那么重要吗？
    // 如果将函数对象作为参数使用时，那么参数的名称很重要，因为调用时使用的就是参数名称
    // 传递到函数名称本身不重要
    test(sum)
    test(diff)









  }




}
