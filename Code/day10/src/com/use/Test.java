package com.use;

import com.xiaoming.Dog;

public class Test {
    public static void main(String[] args) {
        //已经引入包名了
        Dog dog = new Dog();
        System.out.println(dog);
        //两个相同名字的类可以通过包名区分
        com.xiaoqiang.Dog dog1 = new com.xiaoqiang.Dog();
        System.out.println(dog1);
    }
}
