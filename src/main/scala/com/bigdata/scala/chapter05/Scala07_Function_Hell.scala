package com.bigdata.scala.chapter05

object Scala07_Function_Hell {


  def main(args: Array[String]): Unit = {


    // TODO 函数式编程语言 - 地狱版

    /*
    Scala 是完全面向对象的语言，所以万物皆对象
    Scala是完全面向函数式编程语言，所以万物皆函数

    函数也是对象，对象也是函数
     */

    // TODO  函数也是对象

    /*

    java
    class User {
      private String name;


    }

    User user = new User();

    scala ： 声明了一个函数，等同于声明了一个函数对象
    def test() {

    }
     */
    //  如果一个函数声明时，参数列表中没有参数，那么调用时可以省略小括号
    def test() : Unit = {

    }

    println( test ) // 打印test方法的执行结果
    // 如果不想让函数执行，只是想访问这个函数本身，可以采用特殊符号进行转换
    println( test _ )




  }




}
