package com.interface_.example1;

public interface Interface {
    public int n1=20;
    public void hi();

    default public void ok(){
        System.out.println("ok");
    }
    public static void cry(){
        System.out.println("cry");
    }
}
