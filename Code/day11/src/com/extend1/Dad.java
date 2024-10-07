package com.extend1;

public class Dad {
    public String name;
    public int age;
    public char gender;
    private String secret;

    public Dad(){
        System.out.println("父类构造器Dad()被调用");
    }

    public Dad(String name,int age,char gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
        System.out.println("父类构造器Dad(String name,int age,char gender)被调用");
    }
    public void showInfo(){
        System.out.println("name:"+name+" age:"+age+" gender:"+gender);
    }
    public String getSecret(){
        return this.secret;
    }
}
