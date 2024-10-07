package com.finalize;

public class Finalize {
    public static void main(String[] args) {
        car c1=new car("兰博基尼");
        c1=null;
        //当某个对象没有任何引用时，则jvm就会认为其是垃圾对象，就会使用垃圾回收机制来销毁对象，销毁该对象前，会先调用finalize方法。
        System.gc();
        System.out.println("程序结束");
    }
}
class car{
    private String name;

    public car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("您的"+name+"已经销毁，请致电共荣保险！");
    }
}