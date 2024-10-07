package com.extend1;

public class Son extends Dad{
    public Son(){
        super(null,0,(char)0);
        System.out.println("子类的Son()构造器被调用");
    }
    public Son(String name,int age,char gender){
        super(name,age,gender);
        this.name=name;
        this.age=age;
        this.gender=gender;
        System.out.println("子类的Son(String name,int age,char gender)构造器被调用");
    }
    public Son(String name){
        super();
        this.name=name;
        System.out.println("子类的Son(String name)构造器被调用");
    }
}
