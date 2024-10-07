package com.super1;

public class A extends Base {
    public int n1=100;
    protected int n2=200;
    int n3=300;
    private int n4=400;
    public A(){
        System.out.println("A的无参构造器");
    }
    public A(int n){
        System.out.println("A的A(int n)构造器");
    }
    public void test100(){

    }
    protected void test200(){

    }
    void test300(){

    }
    private void test400(){

    }
}
