package com.innerclass.example3;

public class Inner3 {
    public static void main(String[] args) {
        Outer3 outer3 = new Outer3();
        outer3.method();
    }
}
class Outer3{
    private int n1=10;
    public void method(){
        Tiger tiger = new Tiger();
        tiger.cry();
        //使用匿名内部类简化开发，有些类只是使用一次，后面不再使用
        //tig的编译类型为IA
        //tig的运行类型为匿名内部类
        /*底层实现  XXX即外部类名称加$1，系统自动分配
        * class XXX implements IA{
        *  @Override
            public void cry() {
                System.out.println("老虎叫唤");
            }
        *}
        * */
        //jdk底层在创建内部类Outer3$1，立马就创建了Outer3$1的实例
        //并且把地址返回
        //匿名内部类使用一次就不能再使用了
        IA tig=new IA(){
            @Override
            public void cry() {
                System.out.println("老虎叫唤");
            }
        };
        tig.cry();
        System.out.println(tig.getClass());
        //1、father编译类型是Father
        //2、father运行类型不是Father，而是匿名内部类
        //3、底层会创建匿名内部类
        /*相当于一个类继承了Father类，并且重写了方法
        * */
        //4、直接返回了匿名内部类的对象
        //5、参数列表传递给原先类的构造器
        //如果是基于抽象类的匿名内部类，则必须实现方法，即重写
        Father father =new Father("jack"){
            @Override
            public void test() {
                System.out.println("匿名内部类重写test方法");
                System.out.println(n1);
            }
        };
        System.out.println(father.getClass());
        //class com.innerclass.example3.Outer3$2
        father.test();
    }
}
interface IA{
    void cry();
}
class Tiger implements IA{

    @Override
    public void cry() {
        System.out.println("老虎叫唤...");
    }
}
class Father{
    private String name;

    public Father(String name) {
        this.name = name;
    }

    public void test(){

    }

}