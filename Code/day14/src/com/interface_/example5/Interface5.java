package com.interface_.example5;

public class Interface5 {
    public static void main(String[] args) {
        IH ih=new Teacher();
        IG ig=new Teacher();
    }
}
interface IH{}
interface IG extends IH{}
class Teacher implements IG{
}
