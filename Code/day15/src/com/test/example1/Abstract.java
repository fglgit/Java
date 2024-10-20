package com.test.example1;

/**
 * @author LiGuofeng
 * @version 1.0
 */
public class Abstract {
    public static void main(String[] args) {
        Animal animal=new Dog();
        animal.shout();
    }
}
abstract class Animal{
   public abstract void shout();
}
class Dog extends Animal{

    @Override
    public void shout() {
        System.out.println("小狗汪汪叫");
    }
}