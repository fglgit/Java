package com.poly;

import com.override.Animal;

public class poly {
    public static void main(String[] args) {
        Animal animal=new Dog();
        animal.cry();
        animal=new Cat();
        animal.cry();
    }
}
