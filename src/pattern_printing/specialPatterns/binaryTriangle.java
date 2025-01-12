package pattern_printing.specialPatterns;

import java.util.Scanner;

public class binaryTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) { //rows
            for (int j = 1; j <= i; j++) { //cols
                if (i % 2 == 1) {
                    if (j % 2 == 1)  System.out.print(1 + " ");
                    else  System.out.print(0 + " ");
                } else { //i%2==0
                    if (j % 2 == 0)  System.out.print(1 + " ");
                    else  System.out.print(0 + " ");


                }
            }
                System.out.println();

            }
        }
    }


