package com.poly1;

public class poly1 {
    public static void main(String[] args) {
        Animal animal=new Cat("Emmy");
        Food food=new Fish("huanghuayu");
        Master mike = new Master("Mike");
        mike.feed(animal,food);
    }
}
