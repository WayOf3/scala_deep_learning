package com.bigdata.scala.chapter06

import java.lang.reflect.Field

object Scala15_Object_Ext_1 {

  def main(args: Array[String]): Unit = {

    // TODO 面向对象编程 - 比较两个对象
    // java : String.class => 类型信息 => Class => 方法区
    // scala : classof[String] => 类型信息 => Class => 方法区
    // val userClass : Class[User] = classOf[User]
    // userClass.getFields


    // String 类型的字符串表示不可变字符串
    // String 没有提供任何改变其内容的方法,但是可以通过反射修改

    val name : String = " a b "

    val stringClass: Class[String] = classOf[String]
    // 获取字符串底层的数组
    val field: Field = stringClass.getDeclaredField("value")
    field.setAccessible(true)
    val charArray =  field.get(name).asInstanceOf[Array[Char]]
    charArray.update(2,'c')
    println("!" + name + "!")






  }

  class  User {

  }

}
