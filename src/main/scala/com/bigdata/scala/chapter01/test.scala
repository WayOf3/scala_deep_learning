package com.bigdata.scala.chapter01

/*
  package: 包类似于java中的包
  object : 声明对象(单例)
            scala语言是一个完全面向对象的语言，但是java中的静态语法不是面向对象的
             scala没有静态语法，java语言的静态操作在scala中该如何使用
             scala采用新的关键字object来模拟静态语法，可以通过对象名称来实现静态操作
             如果使用object关键字声明一个对象，那么在编译时同时也会编译出对应class文件
             object关键字声明的对象的类型和当前编译后的class文件的类型不一样，多一个$符
             test.class
             test$.class

             test: 单例对象名称，同时也是类名
             def: scala语言中声明方法的关键字
             main: scala语言程序入口方法

             main(...) :小括号表示方法参数列表,可以有参数，也可以没有参数，如果有多个参数，使用逗号隔开

              java => String[] arg
                      java语言是一个强类型语言，在编译时就需要明确类型.所以类型很重要
                      开发时，类型并不是那么的重要
             args: Array[String]
                      scala语言是基于java语言开发的，所以也是强类型语言
                      作者认为参数名称更重要，开发程序用的多，为了方便记忆，所以将名称放在前面
                      为了使用方便，将参数名称和参数类型使用冒号分隔开

             Array[String]： 表示参数类型
                      scala语言是一个完全面向对象的语言，所以数组也是对象.也有自己的类型 : Array
                      sclaa语言中中括号中的String表示泛型

              def main : Unit
              scala语言中方法的声明也符合scala的规则
              方法名 (参数列表) :方法类型
              scala语言是基于java开发，是一个完全面向对象语言.
              方法的返回值也是对象，也应该有相应的类型
              java中有一个void关键字，表示没有返回值。
              但是没有返回值本身也是一个返回，也需要有类型，Unit

              = : 赋值、
              将代码块逻辑赋值给一个方法名

              {} ： 方法体

              System.out.println("Hello World")

              scala语言是基于java语言开发的，那么java的代码可以在scala代码中直接使用
              scala语言也提供了简化的代码操作

              代码没有加分号结尾：
                      scala语言中认为一行代码最好完成一段逻辑，不要多个逻辑操作一行完成，会比较乱，
                      如果一行代码就是一段逻辑，那么就不需要靠分号来区分不同代码逻辑，所以分号可以省略，但是在编译时，会自动添加

              如果就得在同一行中写多个逻辑代码,那么分号不能省略的，
 */

object test {
  def main(args: Array[String]): Unit = {
      println("Hello World") ; println("Hello World")

  }

}
