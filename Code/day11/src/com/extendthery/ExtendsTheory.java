package com.extendthery;

public class ExtendsTheory {
    public static void main(String[] args) {
        Son son=new Son();
        System.out.println(son.name);
        System.out.println(son.age);
        System.out.println(son.hobby);
    }
}
class GrabdPa{
    String name="爷爷";
    String hobby="旅游";
    int age=80;
}
class Father extends GrabdPa{
    String name="爸爸";
    int age=39;
}
class Son extends Father{
    String name="儿子";
}