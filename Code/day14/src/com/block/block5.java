package com.block;

public class block5 {
    public static void main(String[] args) {
        DD dd = new DD();
        System.out.println("========================");
        EE ee = new EE();
    }
}
class DD{
    {
        System.out.println("DD的普通代码块正在执行");
    }
    public DD(){
        //super();
        //调用本类的普通代码块
        System.out.println("执行DD的构造器");
    }
}
class EE extends DD{
    {
        System.out.println("EE的普通代码块正在执行");
    }
    public EE() {
        //super();
        //调用本类的普通代码块
        System.out.println("执行EE的构造器");
    }
}