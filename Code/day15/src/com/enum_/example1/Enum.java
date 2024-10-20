package com.enum_.example1;

import javax.swing.*;

/**
 * @author LiGuofeng
 * @version 1.0
 */
public class Enum {
    public static void main(String[] args) {
        System.out.println(Season.Spring);
    }
}
class Season{
    private String name;
    private String desc;

    public final static Season Spring=new Season("春天","温暖");
    public final static Season Summer=new Season("春天","温暖");
    public final Season Aummer=new Season("春天","温暖");
    public final Season Winter=new Season("春天","温暖");

    private Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}