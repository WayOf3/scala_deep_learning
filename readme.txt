下划线的作用


1. import
    import xxx.yyy._

2.可以声明变量

    val _ = "zhangsan"


3.可以将函数作为对象使用
    val obj = fun _


4.如果匿名函数的参数按照顺序只使用一次，那么采用下划线代替
     _ + _

5.Import类时，使用下划线代替java中的星号
    import java.util._

6.Import 类时，用于屏蔽类
    import java.util.{Date=>_}

7. 属性默认初始化

    var name : String = _


