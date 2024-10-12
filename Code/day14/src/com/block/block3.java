package com.block;

public class block3 {
    public static void main(String[] args) {
        AA.sum=20;
        BB.sum=10;
    }
}
//普通的代码块，在创建对象时会被隐式调用，创建一次则调用一次。
//如果只是使用类的静态成员时，普通代码块并不会执行，但是静态代码块会执行
class AA{
    public static int sum=0;
    {
        System.out.println("AA的代码块被加载");
    }
}
class BB{
    public static int sum=0;
    static {
        System.out.println("BB的代码块被加载");
    }
}