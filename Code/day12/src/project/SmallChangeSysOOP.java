package project;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSysOOP {
    Scanner scanner = new Scanner(System.in);
    boolean loop =true;
    String detial="---------明 细---------";
    //采用传统的拼接方法
    double money=0;
    double balance=0;
    Date date=null;
    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm");
    String note="";
    public void mianMenu(){
        while(loop){

            System.out.println("=========零钱通=========");
            System.out.println("\t 1、零钱通明细");
            System.out.println("\t 2、收益入账");
            System.out.println("\t 3、消费入账");
            System.out.println("\t 4、退出");
            System.out.println("=======================");
            System.out.print("请选择(1-4):");
            int i=scanner.nextInt();

            switch (i){
                case 1:
                    showDetial();
                    break;
                case 2:
                    moneyIn();
                    break;
                case 3:
                    moneyOut();
                    break;
                case 4:
                    exit();
                    break;
                default:{
                    System.out.println("输入错误，请重新输入");
                }
            }


        }
    }
    public void showDetial(){
        System.out.println(detial);
    }
    public void moneyIn(){
        System.out.print("收益入账金额：");
        money=scanner.nextDouble();
        balance+=money;
        date=new Date();
        //System.out.println(date);
        //System.out.println(sdf.format(date));
        detial=detial+'\n'+"收益入账\t+"+money+'\t'+sdf.format(date)+'\t'+balance;
    }
    public void moneyOut(){
        System.out.print("消费原因：");
        note=scanner.next();
        System.out.print("消费金额：");
        money=scanner.nextDouble();
        balance-=money;
        date=new Date();
        detial=detial+'\n'+note+"\t-"+money+'\t'+sdf.format(date)+'\t'+balance;
    }
    public void exit(){
        String choice="";
        //循环内操作太过复杂
        while(true){
            System.out.println("你确定要退出吗？y/n");
            choice=scanner.next();
            if("y".equals(choice)){
                loop=false;
                break;
            }else if("n".equals(choice)){
                loop=true;
                break;
            }
        }
    }
}
