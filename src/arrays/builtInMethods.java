package arrays;

import java.util.Arrays;

public class builtInMethods {
    public static void main(String[] args) {
        int[] arr = {20, 40, 87, 9, 48};
        for (int i =0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        Arrays.sort(arr);
        System.out.println();
        for (int i =0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
    }
}}