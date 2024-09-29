package com.bigdata.scala.chapter03

// javadoc
object Scala04_Oper {

  def main(args: Array[String]): Unit = {


    // TODO 运算符的本质 其实就是对象的方法，只不过是进行了简化
    // scala语言是万物皆对象，所以运算符其实就是对象的方法(功能)
    // 数字其实也是对象
    // 为了方便使用和理解，如果方法调用时，可以进行简化
    // 1.点可以省略
    // 2.如果方法的参数只有一个，可以省略小括号
//    val r: Int = 1.+(1)
//    val r: Int = 1 + (1)
//    val r: Int = 1 + 1
//    println(r)

    val s1 = new String("123")
    val s2 = new String("123")

    println(s1.eq(s2))
    println(s1 eq s2)
    println(s1 equals s2)

    val i = 10
    println(i toString)

  }

}
