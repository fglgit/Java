package com.final_;

public class final1 {
    public static void main(String[] args) {
        E e = new E();
        //e.sum=10;
        final double num=0.01;
        //num=1;
        System.out.println(H.nums);

    }
}
final class A{}
//class B extends A{}
class C{
    public final void hi(){}
}
//class D extends C{
//    @Override
//    public void hi() {
//        super.hi();
//    }
//}
class E{
    public final double sum=20;
}
class F{
    public final int s1=100;
    public final int s2;
    public final int s3;

    public F() {
        this.s2 = 300;
    }
    {
        this.s3=200;
    }

}
class G{
    public static  final int s1=100;
    public static  final int s2;
    static {s2=200;}
}
class H{
    public final static int nums=1000;
    static{
        System.out.println("类加载后H的静态代码块被执行");
    }
}