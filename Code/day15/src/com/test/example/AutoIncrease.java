package com.test.example;

/**
 * @author LiGuofeng
 * @version 1.0
 */
public class AutoIncrease {
    public static void main(String[] args) {
        Frock frock1 = new Frock();
        Frock frock2 = new Frock();
        Frock frock3 = new Frock();
        System.out.println(frock1.getSelfnum());
        System.out.println(frock2.getSelfnum());
        System.out.println(frock3.getSelfnum());
    }
}
class Frock{
    private static int currentnum=0;
    private int selfnum;
    private static int getNum(){
        currentnum++;
        return currentnum;
    }

    public Frock() {
        selfnum=getNum();
    }

    public int getSelfnum() {
        return selfnum;
    }
}