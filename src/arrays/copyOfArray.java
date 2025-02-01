package arrays;

import java.util.Arrays;

public class copyOfArray {
    public static void main(String[] args) {
        int[] arr = {20, 40, 87, 9, 48};
        for(int ele : arr){
            System.out.println(ele+" ");
        }
        System.out.println();
//        int[] nums =arr; //shallow copy
//        nums[0]= 70;
//        System.out.println(arr[0]);
        int[] brr= Arrays.copyOf(arr,arr.length); //deep copy
        brr[0]= 70;
        System.out.println(arr[0]);

        int[] crr= new int[arr.length];
        for(int i =0;i< arr.length;i++){
            crr[i]=arr[i];
        }
        crr[0]=100;
        System.out.println(arr[0]);
    }
}
