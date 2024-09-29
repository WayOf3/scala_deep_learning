package com.bigdata.scala.chapter03

// javadoc
object Scala03_Oper {

  def main(args: Array[String]): Unit = {


    // TODO 运算符
    // 位运算符
    // 二进制运算符
    // byte => 8位 => 0000 0001
    //             => 0000 0101
    // HashMap 的数据如何存放底层结构
    // 存储容量必须为2的n次方，所以扩容时必须为2倍
    // key => key.hashcode => hash => index
    // index = hash(key.hashCode()) & (length - 1)
    // Kafka 中的数据如何放置在topic的partition中
    // key =>取余 => partition
  }

}
