package com.exception.example1;

/**
 * @author LiGuofeng
 * @version 1.0
 */
public class exception {
    public static void main(String[] args) {
        int res = 0;
        try {
            res = 100/0;
        } catch (Exception e) {
            //throw new RuntimeException(e);
            System.out.println("程序错误"+e.getMessage());
        }
        System.out.println(res);
    }
}
