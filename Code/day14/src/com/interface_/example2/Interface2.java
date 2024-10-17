package com.interface_.example2;

public class Interface2 {
    public static void main(String[] args) {
        B b = new B();
        b.test();
    }
}
interface A{
    int a=10;
}
class B implements A{
    public void test(){
        B b = new B();
        System.out.println(b.a);
        System.out.println(A.a);
        System.out.println(B.a);
    }
}
