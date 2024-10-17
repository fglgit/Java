package com.interface_.example3;

public class ExtendsImplements {
    public static void main(String[] args) {
        LittleMonkey wukong = new LittleMonkey("wukong");
        wukong.climb();
        wukong.swimming();
    }
}
class Monkey{
    private String name;
    public void climb(){
        System.out.println(name+"正在爬树");
    }
    public Monkey(String name){
        this.name=name;
    }
}
class LittleMonkey extends Monkey implements fish{
    public LittleMonkey(String name){
        super(name);
    }

    @Override
    public void swimming() {
        System.out.println("小猴子学会了游泳");
    }
}
interface fish{
    void swimming();
}