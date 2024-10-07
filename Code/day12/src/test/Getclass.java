package test;

public class Getclass {
    public static void main(String[] args) {
        Object b=new B();
        System.out.println(b.getClass());
        b=new A();
        System.out.println(b.getClass());
        b=new Object();
        System.out.println(b.getClass());
    }
}
class A{

}
class B extends A{

}