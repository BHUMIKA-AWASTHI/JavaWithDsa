package twoDimensionalArray;
import java.util.Scanner;

public class outputUsingNestedLoops {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[][] arr = new int[2][3];

        int m = arr.length; //no of rows / lines
        int n = arr[0].length; //no of columns

        //input of 2d array
        for (int i = 0; i < m; i++) { // rows
            for (int j = 0; j < n; j++) { //cols
                arr[i][j] = sc.nextInt();

            }

        }

        //output of 2d array
        for (int i = 0; i < m; i++) { // rows
            for (int j = 0; j < n; j++) { //cols
                System.out.print(arr[i][j]+ " ");

            }
            System.out.println(); // output will be visible in a matrix format in (row X column) order
        }
    }
}