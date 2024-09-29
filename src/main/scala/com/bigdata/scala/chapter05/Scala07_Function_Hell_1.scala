package com.bigdata.scala.chapter05

object Scala07_Function_Hell_1 {


  def main(args: Array[String]): Unit = {


    // TODO 函数式编程语言 - 地狱版

    // 函数其实就是对象
    // 1.对象应该有类型
    // 2.对象应该可以赋值给其他人使用
    def test() : Unit = {

    }

    def test1(age: Int): String = {
      age.toString
    }

    def test2(
               age1: Int,
               age2: Int,
               age3: Int,
               age4: Int,
               age5: Int,
               age7: Int,
               age8: Int,
               age9: Int,
               age10: Int,
               age51: Int,
               age11: Int,
               age21: Int,
               age31: Int,
               age41: Int,
               age52: Int,
               age12: Int,
               age22: Int,
               age33: Int,
               age44: Int,
               age55: Int,
               age15: Int,
               age25: Int,
               age35: Int,
               age45: Int,
               age56: Int,
               age18: Int,
               age28: Int,
               age38: Int,
               age48: Int,
               age58: Int

             ): Unit = {
//      age1.toString

      println("test...")
    }
    // 将函数对象test赋值给f
    // 此时,f可以通过编译器自动推断类型，函数对象的类型称之为函数类型
    // Function0[Unit]
    // 这里类型中的0表示函数参数列表中参数的个数
    // 中括号中的Unit表示函数没有返回值
    // val f : Function0[Unit] = test _
    // Function1[Int,String]
    // 这里类型中的1表示函数参数列表中参数的个数
    // 中括号中的Int表示函数参数的类型
    // 中括号中的String表示函数返回值的类型

    // TODO 【函数对象】的参数最多只能有22个
    // 【函数】的参数没有限制
//     val f : Function1[Int,String] = test1 _
    test2(1,2,3,4,5,6,7,8,9,11,21,31,41,51,612,72,81,92,12,42,532,52,523,2352,5235,523,523532,235,52,5235)

//    val f = test2 _ // 报错

    // TODO 为了使用方便，函数类型可以使用另外一种声明方式
    // TODO 这里的函数类型为: Int(参数列表的参数类型) => String(返回值类型)
    val f = test1 _
    def test3 ( name: String,age: Int ) : Unit = {

    }
    // ( String , Int ) => Unit
    val f3 = test3 _



  }




}
