package com.abstract_;

public class template {
    public static void main(String[] args) {
        new AA().job();
        new BB().caculate();
    }
}
class AA{
    public void job(){
        long start=System.currentTimeMillis();
        long num=0;
        for (long i = 0; i < 100000000; i++) {
            num+=i;
        }
        long end=System.currentTimeMillis();
        System.out.println("执行时间为"+(end-start));
    }
}
//模板设计模式
abstract class Template{    //抽象类
    public abstract void job(); //抽象方法
    public void caculate(){
        long start=System.currentTimeMillis();
        //动态绑定机制，默认调用对应对象的job()函数
        job();
        long end=System.currentTimeMillis();
        System.out.println("执行时间为"+(end-start));
    }
}
class BB extends Template{
    public void job(){
        long num=0;
        for (long i = 0; i < 100000000; i++) {
            num+=i;
        }
    }
}