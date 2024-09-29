package com.bigdata.scala.chapter02

// javadoc
object Scala09_Datatype_2 {

  def main(args: Array[String]): Unit = {

    // TODO

    val  s : String = null
    // Byte和Int两个类型之间没有任何的关系，所以不应该能够转换
    // scala底层对类型进行了转换，所以代码上看不出来的，所以称之为隐式转换(自动转换)
    val b : Byte = 10
    val  i : Int = b
    println(i)



  }


}
