package com.block;

public class block1 {
    public static void main(String[] args) {
        movie m1=new movie("ttnk");
        movie m2=new movie("ttnk",300);
        movie m3=new movie("ttnk",300,"jack");
    }
}
class movie{
    private String name;
    private double price;
    private String director;

    {
        System.out.println("调用构造器");
        System.out.println("还在调用构造器");
        System.out.println("还在还在调用构造器");
    }
    public movie(String name) {

        this.name = name;
    }

    public movie(String name, double price, String director) {
        this.name = name;
        this.price = price;
        this.director = director;
    }

    public movie(String name, double price) {
        this.name = name;
        this.price = price;
    }
}