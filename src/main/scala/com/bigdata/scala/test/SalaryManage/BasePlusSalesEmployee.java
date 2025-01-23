package com.bigdata.scala.test.SalaryManage;

/**
 * 有固定底薪的销售⼈员，⼯资由底薪加上销售提成部分。 提成率5%
 */
public class BasePlusSalesEmployee extends Employee{

    // 底薪
    private double basicSalary;

    // 销售额
    private double salesAmount;

    public BasePlusSalesEmployee(String name, int month, double basicSalary, double salesAmount) {
        super(name, month);
        this.basicSalary = basicSalary;
        this.salesAmount = salesAmount;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public double getSalesAmount() {
        return salesAmount;
    }

    // 计算工资方法
    @Override
    public double getSalary() {
        return this.getBasicSalary() + getSalesAmount() * 0.05 + this.getSalaryByBirth();
    }
}
