package com.bigdata.scala.chapter05

object Scala05_Function_Normal_2 {


  def main(args: Array[String]): Unit = {


    // TODO 函数式编程语言 - 普通版

    def test1( password : String  = "000000", name : String) : Unit = {
      println(s"注册用户: ${name},密码: ${password}")
    }

    // 如果想要改变参数的传值顺序，那么可以采用带名参数
    test1(name = "zhangsan");





  }




}
