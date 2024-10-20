package com.annotation.example1;

/**
 * @author LiGuofeng
 * @version 1.0
 */
public class Annotation {
    public static void main(String[] args) {

    }
}
class Father{
    public void fly(){
        System.out.println("老登飞起来");
    }
}
class Son extends Father{
    @Override
    public void fly() {
        System.out.println("小登飞起来");
    }
    //@Override
    public void swim() {
        System.out.println("小登在游泳");
    }
}