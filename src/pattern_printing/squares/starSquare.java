package pattern_printing.squares;

import java.util.Scanner;

public class starSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows and columns");
        int m = sc.nextInt();
        for (int i = 1; i <= m; i++) { //rows
            for (int j = 1; j <= m; j++) { // cols
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
