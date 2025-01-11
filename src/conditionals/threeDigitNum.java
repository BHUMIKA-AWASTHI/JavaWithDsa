package conditionals;

import java.util.Scanner;

public class threeDigitNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num");
        int n = sc.nextInt();

        if (n>99 && n<1000) System.out.println("three digit num");
        else System.out.println("not a three digit num");
    }
}
