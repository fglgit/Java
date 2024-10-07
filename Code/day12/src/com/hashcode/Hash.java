package com.hashcode;

public class Hash {
    public static void main(String[] args) {
        A a1=new A();
        A a2=new A();
        A a3=a1;
        System.out.println(a1.hashCode());
        System.out.println(a2.hashCode());
        System.out.println(a3.hashCode());
    }
}
class A{}