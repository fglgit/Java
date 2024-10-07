package com.debug;
import java.sql.Array;
import java.util.Arrays;
public class DeBug1 {
    public static void main(String[] args) {
        int[] arr={5,6,2,7,1,0,-2};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
