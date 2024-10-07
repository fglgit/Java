package com.oop._static;

public class StaticMethod {
    public static void main(String[] args) {
        Stu stu1 = new Stu("刘");
        Stu stu2 = new Stu("李");
        Stu stu3 = new Stu("王");
        stu1.payFee(2000);
        stu2.payFee(2000);
        stu3.payFee(2000);
        stu1.showFee();
        Stu.payFee(2000);
        Stu.showFee();
    }
}
class Stu{
    private String name;
    private static double fee=0;

    public Stu(String name) {
        this.name = name;
    }
    public static void payFee(double fee){
        Stu.fee+=fee;
    }
    public static void showFee(){
        System.out.println("Fee="+Stu.fee);
    }
}
