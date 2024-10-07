package com.poly3;

import com.poly1.Master;

public class PloyParameter {
    public static void main(String[] args) {
        Worker worker = new Worker("Tom",5000);
        Manager manager = new Manager("john",8000,2000);
        PloyParameter ployParameter = new PloyParameter();
        System.out.println(ployParameter.showEmpAnnual(worker));
        System.out.println(ployParameter.showEmpAnnual(manager));
        ployParameter.testWork(worker);
        ployParameter.testWork(manager);
    }
    public double showEmpAnnual(Employee e){
        return e.getAnnual();
    }
    public void testWork(Employee e){
        if(e instanceof Worker){
            ((Worker)e).work();
        }else if(e instanceof Manager){
            ((Manager)e).manage();
        }
    }
}
class Employee{
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getAnnual(){
        return salary*12;
    }
}
class Worker extends Employee{
    public Worker(String name, double salary) {
        super(name, salary);
    }
    //特殊方法
    public void work(){
        System.out.println("普通员工"+getName()+"正在工作。");
    }
    //重写
    public double getAnnual(){
        return super.getAnnual();
    }
}
class Manager extends Employee{
    private double bonus;
    public Manager(String name,double salary,double bonus){
        super(name,salary);
        this.bonus=bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void manage(){
        System.out.println("经理"+getName()+"正在管理员工。");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual()+bonus;
    }
}