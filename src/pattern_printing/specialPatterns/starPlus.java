package pattern_printing.specialPatterns;

import java.util.Scanner;

public class starPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        int mid = (n + 1) / 2;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == mid || j == mid) {
                    System.out.print("* "); // Print star for the middle row or column
                } else {
                    System.out.print("  "); // Print space elsewhere
                }
            }
            System.out.println(); // Move to the next line
        }
    }
}