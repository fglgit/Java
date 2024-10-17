package com.innerclass.example2;

public class Inner2 {
    public static void main(String[] args) {
        Outer1 outer1 = new Outer1();
        System.out.println("outer1 hashcode"+outer1);
        outer1.m1();
    }
}
class Outer1{
    private int n1=100;
    private void f1(){
        System.out.println("f1()");
    }
    public void m1(){
        String name=null;
        final class Inner1{
            private int n1=200;
            public void f(){
                System.out.println(n1);
                //谁调用了m1，即Outer1.this就是哪个对象
                System.out.println(Outer1.this.n1);
                System.out.println("Outer1.this hashcode"+Outer1.this);
                f1();
            }
        }
        Inner1 inner=new Inner1();
        inner.f();
    }
}