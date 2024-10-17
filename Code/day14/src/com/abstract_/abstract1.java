package com.abstract_;

public class abstract1 {
    public static void main(String[] args) {
        //new Animal("dog");
    }
}
abstract class Animal{
    private String name;

    public Animal(String name) {
        this.name = name;
    }
    public abstract void eat();
}
abstract class A{
    public void print(){
        System.out.println("hello world");
    }
}