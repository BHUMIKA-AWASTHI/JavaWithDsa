package arrays;

import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter target element: ");
        int x = sc.nextInt();
        System.out.print("enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("enter array elements: ");
        for(int i =0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        //solution

        boolean flag = false; // false means not found
        for(int i =0;i<n;i++){
            if(arr[i]==x) {
                flag= true; // true means element found
                break;
            }
        }
        if (flag==true) System.out.println("element found");
        else System.out.println("element not found");

    }
}
