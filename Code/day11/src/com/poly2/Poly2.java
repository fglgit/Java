package com.poly2;

public class Poly2 {
    public static void main(String[] args) {
        Animal animal=new Cat();
        animal.run();;
        animal.sleep();
        animal.show();
        animal.eat();
        //animal.catchMouse();
        Cat cat=(Cat)animal;
        cat.catchMouse();
    }
}
class Animal{
    String name="动物";
    int age=10;
    public void sleep(){
        System.out.println("睡觉");
    }
    public void run(){
        System.out.println("跑跑");
    }
    public void eat(){
        System.out.println("吃");
    }
    public void show(){
        System.out.println("你好");
    }
}
class Cat extends Animal{
    public void eat(){
        System.out.println("小猫吃鱼");
    }
    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}