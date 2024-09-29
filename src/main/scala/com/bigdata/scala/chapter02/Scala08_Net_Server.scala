package com.bigdata.scala.chapter02

import java.io.{InputStream, PrintWriter}
import java.net.{ServerSocket, Socket}

// javadoc
object Scala08_Net_Server {

  def main(args: Array[String]): Unit = {

    // TODO 创建服务器
    // 网络通信中没有办法传输对象，数字这样的内容
    // 可以在网络中传递字节码，那么可以将对象转换为字节码，这个过程称之为序列化
    // 将字节码转换为对象，就称之为反序列化
    val server = new ServerSocket(9999)
    println("服务器启动成功，等待客户端的连接")
    val client: Socket = server.accept()
    val in: InputStream = client.getInputStream
    val result: Int = in.read()
    println("获取客户端发送数据" + result)
    in.close()
    client.close()
    server.close()
  }

}
