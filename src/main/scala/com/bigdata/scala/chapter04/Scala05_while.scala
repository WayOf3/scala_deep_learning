package com.bigdata.scala.chapter04

import scala.io.{BufferedSource, Source}

object Scala05_while {

  def main(args: Array[String]): Unit = {



      // TODO 循环控制
      /*
      while(条件表达式) {
          循环体
      }

      do {
        循环体
      } while(条件表达式)

       */


//    while (true) {
//      println("xxxx")
//    }

//    do {
//      println("xxx")
//    } while (false)

    val source: BufferedSource = Source
      .fromFile("E:\\computer\\javacode\\scala_deep_learning\\data\\word.txt")

    val iter: Iterator[String] = source.getLines()

    while ( iter.hasNext ) {
        println( iter.next() )
    }

    source.close()










  }

}
