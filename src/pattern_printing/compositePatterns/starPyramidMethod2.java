package pattern_printing.compositePatterns;

import java.util.Scanner;

public class starPyramidMethod2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        int nsp=n-1; // no of spaces
        int nst=1;  // no of stars
        for (int i = 1; i <= n; i++) { //rows
            for (int j = 1; j <= nsp; j++) { //spaces
                System.out.print(" "+" ");
            }
            for(int j=1;j<=nst;j++){ //stars
                System.out.print("*"+ " ");
            }
            System.out.println();
            nsp--;
            nst+=2;

        }
    }
}
