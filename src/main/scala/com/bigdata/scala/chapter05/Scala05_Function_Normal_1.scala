package com.bigdata.scala.chapter05

object Scala05_Function_Normal_1 {


  def main(args: Array[String]): Unit = {


    // TODO 函数式编程语言 - 普通版
    // 下面的代码存在两个问题:

    // 希望参数有默认值: 如果不传递，那么参数自动取默认值、
    // Scala实现不了这个操作: 函数的参数默认使用val声明
    // 1.参数传值为null，并不是没有传值，只是传递了一个特殊值而已
    // 2.在一个函数中，有相同含义的多个变量，容易出现歧义
    // TODO scala  语法中可以给参数设定默认值，调用时，参数就可以不需要传递。

    def test( name : String,password : String ) : Unit = {
        var newpassword = password
      if ( password == null ) {
        newpassword = "000000"
      }

      println(s"注册用户: ${name},密码: ${newpassword}")
    }

    //        在参数声明时，同时进行初始化
    // 参数默认值如果不传递，那么会自动使用，如果传递，会覆盖默认值
    def test1( name : String,password : String  = "000000" ) : Unit = {
      println(s"注册用户: ${name},密码: ${password}")
    }

//    test("zhangsan","000000")
    // test("zhangsan",null)
    // test("zhangsan","123123")

    test1("wangwu","123123")
    test1("wangwu")





  }




}
