package com.block;

public class block4 {
    public static void main(String[] args) {
        CC cc = new CC();
    }
}
class CC{
    public CC() {
        System.out.println("最后调用构造器");
    }
    {
        System.out.println("代码块一被调用");
    }
    //静态变量初始化
    private static int n1=getN();
    private  int n2=getN();
    public static int sum;
    //静态代码块
    static {
        System.out.println("代码块二被调用");
    }
    {
        System.out.println("代码块三被调用");
    }
    public static int getN(){
        System.out.println("getN()被调用");
        return 100;
    }


}