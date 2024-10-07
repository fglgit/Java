package com.encapsulation;

public class Encap {
    public static void main(String[] args) {
        Person person = new Person("jack",20,33333);
        person.setName("jack");
        person.setAge(99);
        person.setSalary(10000);
        System.out.println(person.name);
//        System.out.println(person.age);
//        System.out.println(person.salary);
        System.out.println(person.getAge());
        System.out.println(person.getName());
        System.out.println(person.getSalary());

    }
}

class Person{
    public String name;
    private int age;
    private double salary;

    public Person(String name, int age, double salary) {
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 1 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("年龄超出1-120范围");
            this.age = 18;
        }
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}