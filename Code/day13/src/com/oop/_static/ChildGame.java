package com.oop._static;

public class ChildGame {
    public static void main(String[] args) {
        Child c1 = new Child("c1");
        c1.join();
        c1.count++;
        Child c2 = new Child("c2");
        c2.join();
        c2.count++;
        Child c3 = new Child("c3");
        c3.join();
        c3.count++;
        System.out.println(Child.count);
        System.out.println(c1.count);
        System.out.println(c2.count);
        System.out.println(c3.count);
    }
}
class Child{
    private String name;
    public static int count=0;
    public Child(String name){
        this.name=name;
    }
    public void join(){
        System.out.println(name+"加入了游戏");
    }
}
