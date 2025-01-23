package com.bigdata.scala.test.SalaryManage;

/**
 * 销售⼈员，⼯资由⽉销售额和提成率决定。3万以下，提成率5%，3万以上提成率8%
 */
public class SalesEmployee extends Employee{

    // 销售额
    private double salesAmount;


    public SalesEmployee(String name, int month ,double salesAmount) {

        super(name, month); // 调用父类构造方法
        this.salesAmount = salesAmount;

    }

    public double getSalesAmount() {
        return salesAmount;
    }

    @Override
    public double getSalary() {
        return (this.getSalesAmount()>30000) ? this.getSalesAmount() * 0.08 + this.getSalaryByBirth() : this.getSalesAmount() * 0.05  + this.getSalaryByBirth();
    }
}
