package com.bigdata.scala.chapter05

object Scala01_Function {


  def main(args: Array[String]): Unit = {


    // TODO 函数式编程语言
    // 1.scala中的函数并不是数学中函数
    //  这里的函数其实表示的就是功能的封装,java中功能的封装一般称之为方法
    // 2.java中方法其实在scala中就是函数,但是声明在类中的函数称之为方法
    // 函数只在当前作用域有效，但是方法需要受到类的约束的
    // 3.因为函数其实就是功能的封装，那就意味着，功能的名称不能重复，也就没有重写，重载的概念
    // 因为方法属于类，那么就可能存在方法的重载，重写
//    val s = "zhangsan" // Zhangsan
//
//    val newString = s.substring(0,1).toUpperCase + s.substring(1)
//    println(newString)
//
//    val s1 = "lisi";、

    // TODO 函数的声明和使用
    // 声明 => def 函数名(参数列表) : 返回值类型 = { 函数体 }
    // 使用 => 函数名(参数)
    def test() : Unit = {
      println("test...")
    }

    test()


  }

}
