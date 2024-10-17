package com.interface_.example1;

public class Interface1 {
    public static void main(String[] args) {
        //new Interface();
        System.out.println(IB.a);
        //IB.a=20;
    }
}
class learn implements Interface{
    public void hi(){
        System.out.println("hi..");
    }
}
abstract class tiger implements Interface{
}
interface IB{
    int a=10;
    void say();
}
interface IC{
    void hi();
}
class twoimp implements IB,IC{

    @Override
    public void say() {

    }

    @Override
    public void hi() {

    }
}
interface ID extends IB,IC{

}