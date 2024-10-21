package com.exception.example4;

/**
 * @author LiGuofeng
 * @version 1.0
 */
import java.util.Scanner;
public class Cin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num=0;
        while (true){
            System.out.println("请输入一个整数");
            try {
                num=Integer.parseInt(scanner.next());
                break;  //没有异常才会执行
            } catch (NumberFormatException e) {
                System.out.println("输入的内容不是整数");
            }
        }
        System.out.println("输入的数为"+num);
    }
}
