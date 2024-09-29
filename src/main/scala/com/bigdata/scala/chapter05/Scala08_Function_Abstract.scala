package com.bigdata.scala.chapter05

import scala.util.control.Breaks._

object Scala08_Function_Abstract {


  def main(args: Array[String]): Unit = {


    // TODO 函数式编程语言 - 控制抽象
    // 抽象:  不完整
    // 抽象类: 不完整的类
    // 抽象方法: 不完整的方法
    def  test( f : () => Unit ) : Unit = {
      f()
    }

    // 函数类型只有返回，没有输入的场合，称之为抽象，因为不完整。
    // 调用的时候，不能使用小括号
    // 在传值的时候，就需要进行控制
    def  test1( f : => Unit ) : Unit = {
      f
    }

//    test(
//      () => {
//        println("test....")
//      }
//    )
    // TODO 完整的参数传递，是将函数对象作为参数进行传递
    // TODO 所谓的控制抽象，其实就是将代码作为参数进行传递，也就意味着逻辑是变化的。

    // 自定义
//    test1(
//        println("test1....")
//    )

    // TODO 循环中断的代码就体现了控制抽象
    // 如果参数跨越多行，那么可以将小括号改成大括号

    breakable {
      for ( i <- 1 to 5 ) {
        if ( i == 3) {
          break
        }

        println(" i = " + i)
      }
    }





  }




}
