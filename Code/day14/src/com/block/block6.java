package com.block;

public class block6 {
    public static void main(String[] args) {
        CCC ccc = new CCC();
    }
}
class AAA{
    static {
        System.out.println("AAA的静态代码块正在执行");
    }
    {
        System.out.println("AAA的普通代码块正在执行");
    }
    public static int An1=getan1();
    public int An2=getan2();
    public AAA() {
        System.out.println("AAA的构造器正在执行");
    }
    public static int getan1(){
        System.out.println("AAA的An1参数初始化");
        return 100;
    }
    public int getan2(){
        System.out.println("AAA的An2参数初始化");
        return 100;
    }
}
class BBB extends AAA{
    static {
        System.out.println("BBB的静态代码块正在执行");
    }
    {
        System.out.println("BBB的普通代码块正在执行");
    }
    public static int Bn1=getbn1();
    public int Bn2=getbn2();
    public BBB() {
        System.out.println("BBB的构造器正在执行");
    }
    public static int getbn1(){
        System.out.println("BBB的An1参数初始化");
        return 100;
    }
    public int getbn2(){
        System.out.println("BBB的An2参数初始化");
        return 100;
    }
}
class CCC extends BBB{
    static {
        System.out.println("CCC的静态代码块正在执行");
    }
    {
        System.out.println("CCC的普通代码块正在执行");
    }
    public static int Cn1=getcn1();
    public int Cn2=getcn2();
    public CCC() {
        System.out.println("CCC的构造器正在执行");
    }
    public static int getcn1(){
        System.out.println("CCC的An1参数初始化");
        return 100;
    }
    public int getcn2(){
        System.out.println("CCC的An2参数初始化");
        return 100;
    }
}

//很是奇怪，在父类中，如果调用与子类同名的方法，貌似会被覆盖，即父类也会去调用子类的方法