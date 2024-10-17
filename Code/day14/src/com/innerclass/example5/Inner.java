package com.innerclass.example5;

public class Inner {
    public static void main(String[] args) {
        Outer5 outer5 = new Outer5();
        outer5.f1();
        //1、系统定义
        Outer5.Inner5 inner51=outer5.new Inner5();
        inner51.say();
        //2、外部类中，定义方法，返回Inner5对象
        Outer5.Inner5 inner52=outer5.getInstance();
    }
}
class Outer5{
    private int n1=10;
    public class Inner5{
        public void say(){
            System.out.println("hello");
            System.out.println(n1);
        }
    }
    public void f1(){
        new Inner5().say();
    }
    public Inner5 getInstance(){
        return new Inner5();
    }
}