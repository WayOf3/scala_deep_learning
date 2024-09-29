package com.bigdata.scala.chapter06

object Scala011_Object_Abstract_1 {

      def main(args: Array[String]): Unit = {


        // TODO 面向对象编程 - 抽象
        // 一个类中如果有抽象方法，那么这个类是抽象方法  部分不完整->整体不完整
        // 一个类是抽象类，那么这个类不一定有抽象方法   整体不完整 x-> 每一部分不完整
        // 如果父类的方法为抽象方法，那么子类的方法如果重写时，只需要补充完整即可，无需其他操作.
        // 如果父类的方法为完整方法，那么子类的方法如果重写时，需要增加特殊的关键字override，明确方法的重写


        val user = new ChildUser()
        println(user.test())


      }

      abstract class  User{

        // TODO 不完整的方法(只有声明，没有实现)，称之为抽象方法
        def test() :Unit = {
            println("User test...")
        }

      }

      class ChildUser extends User {
        override def test(): Unit = {
          println("child User test...")
        }
      }



}



