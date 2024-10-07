package com.oop._static;

public class VisitStatic {
    public static void main(String[] args) {
        System.out.println(A.haha);
        A a=new A();
        System.out.println(a.haha);
    }
}
class A{
    public static String haha="哈哈";
}