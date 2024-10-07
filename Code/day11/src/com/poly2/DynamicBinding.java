package com.poly2;

public class DynamicBinding {
    public static void main(String[] args) {
        A a=new B();            //向上转型
        System.out.println(a.sum());
        System.out.println(a.sum1());
        //如果不把子类B的sum注销，则结果显然是40，30
        //如果把子类B的sum注销了会发生什么，则首先运行父类的sum()方法，接着又运行子类的getl()方法
        //即结果是30，30
        //如果把子类B的sum1却不会发生动态绑定，结果是30，20
    }
}
class A{
    public int i=10;
    public int sum(){
        return getl()+10;
    }
    public int sum1(){
        return i+10;
    }
    public int getl(){
        return i;
    }
}
class B extends A{
    public int i=20;
//    public int sum(){
//        return i+20;
//    }
    public int getl(){
        return i;
    }
//    public int sum1(){
//        return i+10;
//    }
}
