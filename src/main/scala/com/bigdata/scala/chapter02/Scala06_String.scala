package com.bigdata.scala.chapter02

// javadoc
object Scala06_String {

  def main(args: Array[String]): Unit = {

    // TODO 字符串
    // Scala中没有字符串,使用的就是java的字符串
    // 字符串的方法都可以在scala中使用
    // val name : String = "abc"
    // TODO字符串的拼接
    val name = "zhangsan"
    val age = "30"
    println("Name : " + name + ", Age :" + age)
    // JSON字符串
    // 符合 JSON格式的字符串
    // {"name" : "zhangsan","age":30}
//    println("{\"name\" : "+ name +",\"age\": "+ age + "}")

      // 传值字符串拼接
      printf("name = %s\n" ,name)

      // 插值字符串拼接 ,不能拼接JSON格式字符串
//      println(s"name = ${name}")
//      println(s"name = $name.substring(0,1)")
//      println(s"name = ${name.substring(0,1)}")
//      println("name = ${name}")
//      println(s"{\"name\" : ${name} ,\"age\": ${age}")

    // 多行字符串,主要用于SQL和JSon格式字符串
    // 这里的竖线表示顶格符
//    println(
//      """
//        | hello
//        | scala
//        |""".stripMargin)
//
//
//    println(
//      """
//        # hello
//        # scala
//        #""".stripMargin('#'))

    println(
          s"""
            | {"name" : ${name},"age":${age}}
            |""".stripMargin)

    println(
      """
        |select
        | *
        | from user
        | join (
        |  select *
        |  from student
        | )
        | where id = 1
        |""".stripMargin)

  }

}
