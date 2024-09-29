package com.bigdata.scala.chapter02

// javadoc
object Scala09_Datatype_1 {

  def main(args: Array[String]): Unit = {

    // TODO
    val  i : Int = 10
    val  s : String = "abc"

    val a : AnyVal = i
    val b : AnyRef = s

    val c: Any = b

    println(a)
    println(b)

  }


}
