package com.equals;

public class Equals {
    public static void main(String[] args) {
        //浮点类型运算后才会导致无限小数
        int i=10;
        double d=10.0;
        System.out.println(i==d);
        //==判断值是否相等

        A a = new A();
        A a1 = new A();
        A a2= a;
        //引用赋值
        System.out.println(a==a1);
        System.out.println(a==a2);
        System.out.println(a1==a2);
        //==判断地址是否相等

        B b=a;
        //向上转型
        System.out.println(b==a);
        //二者地址都是指向A()对象所在空间
    }
}
class B{

}
class A extends B{

}