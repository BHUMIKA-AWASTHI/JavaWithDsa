package pattern_printing.squares;

import java.util.Scanner;

public class starRectangle {
    public static void main(String[] args) {
//        System.out.println("****");
//        System.out.println("****");
//        System.out.println("****");
//        System.out.println("****");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows and columns");
        int m = sc.nextInt();
        int n = sc.nextInt();
        for (int i = 1; i <= m; i++) { //rows
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
