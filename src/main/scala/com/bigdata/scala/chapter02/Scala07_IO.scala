package com.bigdata.scala.chapter02

import java.io.PrintWriter
import scala.io.{BufferedSource, Source}

// javadoc
object Scala07_IO {

  def main(args: Array[String]): Unit = {

    // TODO IO
    // TODO 输入
//    val age : Int = scala.io.StdIn.readInt()
//    println(age)

    // 从文件中获取数据
    // scala获取文件中的数据，需要采用特殊的对象
//    val source: BufferedSource = Source.fromFile("E:\\computer\\javacode\\scala_deep_learning\\data\\word.txt")
//    val iter: Iterator[String] = source.getLines()
//
//    while ( iter.hasNext ){
//      println(iter.next())
//    }
//
//    source.close()

    // TODO 输出
    // scala中输出采用的就是java中的输出操作
    val out = new PrintWriter("E:\\computer\\javacode\\scala_deep_learning\\data\\test.txt")
    out.println("test")
    out.println("scala")
    out.flush()

    out.close()


  }

}
