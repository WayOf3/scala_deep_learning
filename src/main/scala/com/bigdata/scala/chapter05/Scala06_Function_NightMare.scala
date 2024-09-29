package com.bigdata.scala.chapter05

object Scala06_Function_NightMare {


  def main(args: Array[String]): Unit = {


    // TODO 函数式编程语言 - 噩梦版

    // TODO Scala语言的作者马丁为了开发人员可以更加便捷地开发程序，所以可以简化很多的代码
    //      如果编译器可以动态识别的语法，那么开发人员时可以不需要编码的，可以省略
    //     这体现了 至简原则 : 能省则省

//    def test() : String = {
//        return "zhangsan"
//    }

//    println(test())
    // TODO 1.如果函数体中的逻辑代码需要返回，可以省略return关键字
    // scala语言中，所有的表达式可以直接将满足条件的最后一行的代码逻辑的结果作为返回值
    //

//    def test1() : String = {
//      "zhangsan"
//    }
//
//    println(test1())

    // TODO 2.如果函数的逻辑代码只有一行，那么可以将大括号省略
//    def test2() : String = "zhangsan"
//
//    println(test2())

    // TODO 3.如果能够通过返回值推断出返回值类型，那么返回值类型可以省略
//    def test3() = "zhangsan"
//    println(test3())

    // TODO 4.如果函数的参数列表中没有声明参数，那么小括号是可以省略
    // 如果省略参数列表的小括号，那么调用时也不能添加
    // 因为省略了很多语法内容，所以变量声明和函数声明很像，所以必须采用关键字区分
//    def test4 = "zhangsan"
//    println(test4)

    // TODO 5.等号可以省略，但是一般和Unit同时省略
    // 如果逻辑代码中有return返回，但是函数声明为Unit,此时return不起作用
    // 此时如果想要省略Unit，那么会发生错误，如果既想省略Unit，又不希望发生错误，可以将等号同时省略
    def test5() {
      return "zhangsan"
    }

//    println(test5())

    // TODO 6.如果函数名称不重要的时候,def和函数名也可以省略，称之为匿名函数
    // 1.def和函数名要省略
    // 2.返回值类型也需要省略，由逻辑代码自动推断
    // 3.等号需要增加大于号表示关联
        ()  => {
            return "zhangsan"
        }



  }




}
