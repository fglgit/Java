package com.equals;

public class Equals1 {
    public static void main(String[] args) {
        System.out.println("hello".equals("abc"));

        Object o = new Object();
        Object oo=new Object();
        System.out.println(o.equals(oo));
        oo=o;
        System.out.println(o.equals(oo));

        Integer integer1=new Integer(10);
        Integer integer2=new Integer(10);
        System.out.println(integer1==integer2);
        System.out.println(integer1.equals(integer2));

        String str1=new String("hello");
        String str2=new String("hello");
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));
    }
}
