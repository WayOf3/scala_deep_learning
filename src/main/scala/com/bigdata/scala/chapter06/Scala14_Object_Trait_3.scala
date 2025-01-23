package com.bigdata.scala.chapter06

object Scala14_Object_Trait_3 {

  def main(args: Array[String]): Unit = {

    // TODO 面向对象编程 - 特征的执行顺序
    // 类混入特质时，也存在钻石问题，但是Scala采用了一种特殊的方式来解决。
    // 1.为什么要混入特质
    //    增加约束
    //    功能的补充和叠加
    // 2.如果混入了多个相同的功能，那么就需要一个执行的顺序，否则会出现错误


    // Scala如何解决钻石问题:
    // 将多个功能混入在一起，按照特定的执行顺序进行叠加调用
    // 这里的特定执行顺序其实就是初始化顺序的反向操作




    val mysql = new MySQL
    mysql.operateDate()


  }

  trait Operate{
    def  operateDate(): Unit = {
        // TODO 操作数据
        println("进行数据处理")

    }

  }

  trait Database extends Operate {
     override def  operateDate(): Unit = {
      // TODO 操作数据
      println("向数据库中")
      super[Operate].operateDate()

    }

  }

  trait Log  extends  Operate{
    override def  operateDate(): Unit = {
      // TODO 操作数据
      println("向日志文件中")
      // 这里的super不是表示父特质，而是表示叠加功能后的上一级
      super.operateDate()

    }
  }

  class  MySQL extends Log with Database {


  }


}
