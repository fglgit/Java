package com.super1;

public class B extends A{
    public void hi(){
        System.out.println(super.n1+" "+super.n2+" "+super.n3);
        //System.out.println(super.n4);error
        super.test100();
        super.test200();
        super.test300();
        //super.test400();

    }
    public B(){
        super();
    }
    public B(int n){
        super(n);
        System.out.println(super.n1);
        System.out.println(super.age);
    }
}
