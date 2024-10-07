package com.poly3;

public class PloyArray {
    public static void main(String[] args) {
        int[] arr=new int[20];
        Person[] persons=new Person[5];
        persons[0]=new Person("jack1",18);
        persons[1]=new Student("jack2",19,95);
        persons[2]=new Student("jack3",20,100);
        persons[3]=new Teacher("jack4",20,10000);
        persons[4]=new Teacher("jack5",20,20000);
        for(int i=0;i<persons.length;i++){
            persons[i].say();
            //person[i] 编译类型是Person，运行类型根据实际调整
            if(persons[i] instanceof Student){
                Student student=(Student)persons[i];
                student.learn();
            }else if(persons[i] instanceof Teacher){
                Teacher teacher=(Teacher) persons[i];
                teacher.teach();
            }
        }
    }
}
class Person{
    private String name;
    private int age;
    public void say(){
        System.out.println("你好，我是"+name+"，我今年"+age+"岁了。");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class Student extends Person{
    public double score;

    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    @Override
    public void say() {
        super.say();
        System.out.println("我是学生，我考了"+score+"分。");
    }
    public void learn(){
        System.out.println("学生"+getName()+"正在学习。");
    }
}
class Teacher extends Person{
    public double salary;

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    @Override
    public void say() {
        super.say();
        System.out.println("我是老师，我赚了"+salary+"元。");
    }
    public void teach(){
        System.out.println("老师"+getName()+"正在上课。");
    }
}