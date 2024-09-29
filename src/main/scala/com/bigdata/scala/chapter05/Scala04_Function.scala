package com.bigdata.scala.chapter05

object Scala04_Function {


  def main(args: Array[String]): Unit = {


    // TODO 函数式编程语言
    // 函数的应用，说的简单点就是声明和使用
    // 函数其实就是功能的封装，就意味着功能已经按照特定的规则封装好了，所以重点在如何调用
//    def headerUpper( s: String ) : String = {
//      return s.substring(0,1).toUpperCase() + s.substring(1)
//    }
//
//    val newString : String  = headerUpper("lisi")
//    println(newString)

    // TODO 函数式编程侧重点是: 函数名，输入参数，返回结果
    // TODO 函数声明
    // 1.无参,无返回值
    def fun1() : Unit = {
      println("fun1...")
    }

    // 调用函数的时候，需要指明函数的名称以及传递的参数
    // 如果参数列表中没有声明任何的参数，那么调用时参数列表的小括号可以省略
//    fun1()
//    fun1

    // 2.无参,有返回值
    def fun2() : String = {
        return "zhangsan"
    }
    // 函数如果存在返回值，那么一般会接收返回值
//    val result2 = fun2()
//    println(result2)

    // 3.有参,无返回值
    def fun3( name : String): Unit = {
      println("Name : " + name)
    }

//    fun3("zhangsan")
    // 如果函数的参数只有一个时，也不能省略小括号，方法可以省略作为运算符使用
    // fun3 "zhangsan"

    // 4.有参,有返回值
    def fun4( name : String) : String = {
        return "Name :" + name
    }

//    val  name = fun4("zhangsan")
//    println(name)

    // 5.多参,无返回值
    def fun5( name : String, age : Int) : Unit = {
      println("Name :" + name + ",Age : " + age)
    }

    // 函数调用时，传参的值应该和参数一一匹配。
    // 类型要匹配，个数要匹配，顺序要匹配
//    fun5("zhangsan",20)

    // 6.多参,有返回值
    def fun6( name : String, age : Int) : String = {
      return s"Name : ${name},Age : ${age}"
    }

    val result6: String = fun6("lisi", 20)
    println(result6)

  }




}
