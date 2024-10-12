package com.block;

public class block2 {
    public static void main(String[] args) {
        A a1 = new A(20);
        A a2 = new A(20);
        //看到没，实际上刚刚开始是没有加载的
        B b1=new B(10);
        B b2=new B(10);
    }
}
class A{
    private int sum;
    {
        System.out.println("代码块A加载中···");
    }
    public A(int sum){
        this.sum =sum;
    }
}

class B{
    private int sum;
    static {
        System.out.println("代码块B加载中···");
    }
    public B(int sum){
        this.sum =sum;
    }
}