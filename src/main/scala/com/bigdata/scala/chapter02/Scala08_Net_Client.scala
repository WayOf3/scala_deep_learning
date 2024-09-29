package com.bigdata.scala.chapter02

import java.io.OutputStream
import java.net.Socket


object Scala08_Net_Client {

  def main(args: Array[String]): Unit = {

    // TODO 建立服务器连接
    val server = new Socket("localhost",9999)
    println("连接服务器成功")
    val out: OutputStream = server.getOutputStream
    out.write(300)
    out.close()
    println("向服务器发送数据: 300")
    server.close()


  }

}
