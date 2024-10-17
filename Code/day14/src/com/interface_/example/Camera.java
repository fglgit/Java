package com.interface_.example;

public class Camera implements Usb{//实现接口
    @Override
    public void start() {
        System.out.println("相机开始工作了...");
    }

    @Override
    public void stop() {
        System.out.println("相机停止工作了...");
    }
}
