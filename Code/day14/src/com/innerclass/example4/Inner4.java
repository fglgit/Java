package com.innerclass.example4;

public class Inner4 {
    public static void main(String[] args) {
        f1(new IG() {
            @Override
            public void show() {
                System.out.println("只是调用一次，方便修改");
            }
        });
    }
    public static void f1(IG ig){
        ig.show();
    }
}
interface IG{
    void show();
}