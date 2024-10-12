package com.simple;
//名字错了，应该是single，不是simple
public class simple1 {
    public static void main(String[] args) {
        singletest1 instance1=singletest1.getInstance();
        System.out.println(instance1);
        singletest1 instance2=singletest1.getInstance();
        System.out.println(instance2);
        System.out.println(instance2==instance1);
        singletest2 instance3=singletest2.getInstance();
        System.out.println(instance3);
        singletest2 instance4=singletest2.getInstance();
        System.out.println(instance4);
        System.out.println(instance3==instance4);
//        Runtime
    }
}
class singletest1{
    private String name;
    private static singletest1 test1 =new singletest1("小红");
    private singletest1(String name){
        this.name=name;
    }
    public static singletest1 getInstance(){
        return test1;
    }
    //重写toString方法
    @Override
    public String toString() {
        return "singletest1{" +
                "name='" + name + '\'' +
                '}';
    }
}
class singletest2{
    private String name;
    private static singletest2 test2;
    private singletest2(String name){
        this.name=name;
    }
    public static singletest2 getInstance(){
        if(test2==null){
            test2=new singletest2(null);
        }
        return test2;
    }
    //重写toString方法
    @Override
    public String toString() {
        return "singletest1{" +
                "name='" + name + '\'' +
                '}';
    }
}