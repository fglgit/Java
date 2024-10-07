package com.override;

public class Overrideexercise {
    public static void main(String[] args) {
        Person jack = new Person("jack", 10);
        System.out.println(jack.say());
        Student bob = new Student("bob", 12, 8222, 99.5);
        System.out.println(bob.say());

    }
}
