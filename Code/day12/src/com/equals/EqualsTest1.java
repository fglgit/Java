package com.equals;

public class EqualsTest1 {
    public static void main(String[] args) {
        Person person1= new Person("jack",20,'男');
        Person person2= new Person("jack",20,'男');
        System.out.println(person1.equals(person2));

    }
}
class Person{
    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    //重写Object的equals方法
    public boolean equals(Object obj){
        if(this==obj){
            return true;
        }
        if(obj instanceof Person){
            //向下转型，获得各种属性
            Person temp=(Person)obj;
            if(temp.age==age&&temp.gender==gender&&name.equals(temp.name)){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
}