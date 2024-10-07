package test;

import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

public class Emp {
    public static void main(String[] args) {
        Manager liubei = new Manager("刘备", 200, 30, 5000);
        System.out.println(liubei.printsalary());
    }
}
class Employee{
    private String name;
    private double salary;
    private int days;
    private double rate;

    public Employee(String name, double salary, int days, double rate) {
        this.name = name;
        this.salary = salary;
        this.days = days;
        this.rate = rate;
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

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
    public double printsalary(){
        return salary*days*rate;
    }
}
class Worker extends Employee{
    public Worker(String name, double salary, int days){
        super(name,salary,days,1);
    }
}
class Manager extends Employee{
    private double bonus;
    public Manager(String name, double salary, int days,double bonus){
        super(name,salary,days,1.2);
        this.bonus=bonus;
    }
    public double printsalary(){
        return super.printsalary()+bonus;
    }
}