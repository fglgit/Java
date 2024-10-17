package com.interface_.example;

public class Computer {
    public void work(Usb usb){
        //通过接口调用方法
        usb.start();
        usb.stop();
    }
}
