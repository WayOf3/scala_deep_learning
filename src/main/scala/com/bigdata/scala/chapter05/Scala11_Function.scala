package com.bigdata.scala.chapter05

object Scala11_Function {


  def main(args: Array[String]): Unit = {


    // TODO 函数式编程语言 - 递归

    // 阶乘

    // TODO 递归的基本原则: 函数自己调用自己
    // StackOverflowError : 栈溢出
    // Java在执行方法调用时，会将方法进行压栈处理，方法执行完毕后，会有弹栈处理
    // 如果方法没有执行完，又调用了其他的方法，那么方法栈空间就会下压
    // 如果越压越多，那么栈空间不够了，所以会发生溢出操作
    // TODO 递归函数应该有跳出递归的逻辑
    // TODO 递归函数在传递参数时需要有规律
//    def test() : Unit = {
//      test()
//      println("test...")
//    }

    // 阶乘
    // TODO Scala中的泛型的返回值类型不能省略
//    def test(num: Int): Int = {
//      if (num <= 1) {
//        1
//      } else {
//        num * test(num - 1)
//      }
//
//    }
//
//
//    println(test(5))

    // TODO Java的栈内存有大小限制的。
    // 方法执行时，压栈的内存也是有大小的，那么栈内存不可能无线压栈
    // 如果压栈的次数超过阈值，就会出现错误，即使有跳出的逻辑也会出错
    // Scala采用了一种特殊的语法优化递归操作：尾（伪）递归
    // Scala采用while循环实现尾递归
    // Java中的尾递归没有优化
      def test() : Unit = {

        println("test...")
        test()

      }

    test()

    // TODO 栈内存溢出 ： 没有足够的内存分配栈空间(内存)
    // Java中的内存，堆内存，方法区内存只有一个，但是栈内存可以是多个
    // 一个线程就是一个独立栈内存





  }




}
