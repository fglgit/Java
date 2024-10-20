package com.test.example2;

/**
 * @author LiGuofeng
 * @version 1.0
 */
public class Inner {
    public static void main(String[] args) {
        phone phone = new phone();
        phone.testWork(new IC(){

            @Override
            public double work(double n1, double n2) {
                return n1+n2;
            }
        },10,20);
    }
}
interface IC{
    public double work(double n1,double n2);
}
class phone{
    public void testWork(IC ic,double n1,double n2){
        double result=ic.work(n1,n2);
        System.out.println("result="+result);
    }
}