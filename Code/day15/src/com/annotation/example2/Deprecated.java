package com.annotation.example2;

/**
 * @author LiGuofeng
 * @version 1.0
 */
public class Deprecated {
    public static void main(String[] args) {
        AA aa = new AA();
    }
}
@java.lang.Deprecated
class AA{
    public int n=20;
    public void say(){
        System.out.println(n);
    }
}