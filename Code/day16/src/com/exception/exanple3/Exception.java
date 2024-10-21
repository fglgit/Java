package com.exception.exanple3;

/**
 * @author LiGuofeng
 * @version 1.0
 */
public class Exception {
    public static void main(String[] args) {
        try {
            Person p = new Person("lifeng");
            p = null;
            System.out.println(p.getName());
            int n1 = 10;
            int n2 = 0;
            int res = n1 / n2;
        }catch (NullPointerException e){
            System.out.println("空指针异常"+e.getMessage());
        }catch (ArithmeticException e){
            System.out.println("算术异常"+e.getMessage());
        }catch (java.lang.Exception e) {
            System.out.println("发生异常");
        }


    }
}
class Person{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
