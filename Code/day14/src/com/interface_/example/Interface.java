package com.interface_.example;

public class Interface {
    public static void main(String[] args) {
        Camera camera = new Camera();
        Computer computer = new Computer();
        computer.work(camera);
    }
}
