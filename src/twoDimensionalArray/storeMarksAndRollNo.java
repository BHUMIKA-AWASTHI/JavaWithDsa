package twoDimensionalArray;

import java.util.Scanner;

public class storeMarksAndRollNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // program to store roll no and marks obtained by students in 2d array
        int[][] arr = new int[4][2];
        // taking input
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // taking output
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
