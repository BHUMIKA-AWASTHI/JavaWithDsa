package conditionals;

import java.util.Scanner;

public class absoluteNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();

        if(n<0) {
            System.out.println(-n);
        } else System.out.println(n);
    }
}
