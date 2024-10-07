package com.poly2;

public class Poly22 {
    public static void main(String[] args) {
        BB bb = new BB();
        System.out.println(bb instanceof BB);
        System.out.println(bb instanceof AA);

        //aa的编译类型AA，运行类型BB，显然instanceof 看的是运行类型
        AA aa=new BB();
        System.out.println(aa instanceof AA);
        System.out.println(aa instanceof BB);

        Object obj=new Object();
        System.out.println(obj instanceof AA);
        System.out.println(obj instanceof Object);
        String str="jdj";
        //System.out.println(str instanceof AA);
        System.out.println(str instanceof Object);
    }
}
class AA{}
class BB extends AA{}
