package com.bigdata.scala.test.SalaryManage;


/**
    SalariedEmployee 是Employee的子类 ，拿固定工资，拥有独立的属性月薪
 */

/**
 * Java中的继承会使得子类获得以下内容：
 *
 * 父类中的公有（public）和受保护（protected）成员变量。
 *
 * 父类中的公有（public）和受保护（protected）方法。
 *
 * 父类中的公有（public）静态成员变量和静态方法。
 *
 * 不会被继承的有：
 *
 * 父类中的私有（private）成员变量和方法。
 *
 * 构造方法只能被调用来创建对象，不能被继承。
 */
public class SalariedEmployee extends Employee{

    public double monthSalary; // 固定月薪

    public SalariedEmployee(String name, int month, double monthSalary) {
        super(name, month);// 调用父类构造方法
        this.monthSalary = monthSalary;
    }

    // 计算工资方法
    @Override
    public double getSalary() {

        // 继承了 getSalaryByBirth
        // 当月薪资加是否为生日月份
        return this.monthSalary + this.getSalaryByBirth();
    }
}
