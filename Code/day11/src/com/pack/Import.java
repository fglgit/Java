package com.pack;

import java.util.Arrays;

public class Import {
    public static void main(String[] args) {
        int[] arr={-1,42,2,43,25,-7};
        Arrays.sort(arr);
        //自带排序方法
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
