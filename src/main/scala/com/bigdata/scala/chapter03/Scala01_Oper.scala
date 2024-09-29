package com.bigdata.scala.chapter03

// javadoc
object Scala01_Oper {

  def main(args: Array[String]): Unit = {


    // TODO 运算符
    // 关系运算符
//    println( 10 < 20 )

    // java中的双等号可以理解为比较值(基本数据类型，就是值，引用数据类型是内存地址)
    // scala中的双等号可以理解为非空equals操作
    // 如果想要比较对象的内存地址,需要采用eq方法
//    println( 11 == 11)
    val name1: String = null
    val name2 = "123"

//    println(name1 == name2)

    val name3 = new String("123")
    val name4 = new String("123")

    println(name3 == name4)
    println(name3.equals(name4))
    println(name3 eq  name4)



  }

}
