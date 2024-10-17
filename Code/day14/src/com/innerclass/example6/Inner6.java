package com.innerclass.example6;

import com.interface_.example1.Interface;

public class Inner6 {
    public static void main(String[] args) {
        Outer6.Inner6 inner6 = new Outer6.Inner6();
        Outer6.Inner6 inner61 = new Outer6().getInstance();
        inner6.test();
    }
}
class Outer6{
    private int n1=10;
    private static String name="jack";

    static class Inner6{
        private String name="dick";
        public void test(){
            //System.out.println(n1);
            System.out.println(name);
            System.out.println(Outer6.name);
        }
    }
    public Inner6 getInstance(){
        return new Inner6();
    }
}
