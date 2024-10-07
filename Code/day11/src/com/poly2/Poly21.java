package com.poly2;

public class Poly21 {
    public static void main(String[] args) {
        Base base=new Sub();
        System.out.println(base.count);
        Sub sub = new Sub();
        System.out.println(sub.count);
    }
}
class Base{
    int count=20;
}
class Sub extends Base{
    int count=10;
}