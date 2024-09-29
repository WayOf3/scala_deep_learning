package com.bigdata.scala.chapter04

import scala.io.{BufferedSource, Source}
import scala.util.control.Breaks
import scala.util.control.Breaks._

object Scala06_break {

  def main(args: Array[String]): Unit = {



      // TODO 循环控制
      // break(中断，跳出循环) continue 继续下一次循环
      // scala中没有continue和break关键字，因为不是面向对象的，也可以使用其他语法代替
      // continue 采用if else 代替
      // break采用面向对象来代替,底层会抛出异常跳出for循环. 外层应该捕捉异常

//      Breaks.breakable{
//        for ( i <- 1 to 5) {
//          if ( i == 3 ){
//            //        println("i = " + i)
//            //        return
//            Breaks.break()
//          }
//          println( " i = " + i)
//        }
//      }
    // scala可以通过特殊的语法操作，让代码变得简单一点
    // java 静态导入

    breakable {
      for ( i <- 1 to 5 ) {
        if ( i == 3 ){
          break
        }
        println( " i = " + i)
      }
    }


    println("main 方法执行完毕")











  }

}
