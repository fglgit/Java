package com.interface_.example4;

public class Interface4 {
    public static void main(String[] args) {
        Usb[] usb=new Usb[2];
        usb[0]=new Phone();
        usb[1]=new Computer();
        for (int i = 0; i < 2; i++) {
            usb[i].work();
            if(usb[i] instanceof Phone){
                ((Phone) usb[i]).call();
            }
        }
    }
}
interface Usb{
    void work();
}
class Phone implements Usb{
    public void call(){
        System.out.println("手机正在打电话");
    }

    @Override
    public void work() {
        System.out.println("手机工作");
    }
}
class Computer implements Usb{
    @Override
    public void work() {
        System.out.println("电脑工作");
    }
}