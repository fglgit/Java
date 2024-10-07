package com.tostring;

public class ToString {
    public static void main(String[] args) {
        Object obj=new Object();
        System.out.println(obj.toString());
        System.out.println(obj);
//        public String toString() {
//            return getClass().getName() + "@" + Integer.toHexString(hashCode());
//        }
        Monster m1=new Monster("jack","work",1000);
        System.out.println(m1.toString());

    }
}
class Monster{
    private String name;
    private String job;
    private double salary;

    public Monster(String name, String job, double salary) {
        this.name = name;
        this.job = job;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

//    public String toString(){
//        return name+" "+job+" "+salary;
//    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", salary=" + salary +
                '}';
    }
}