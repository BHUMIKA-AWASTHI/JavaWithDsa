package twoDimensionalArray;

public class rowWiseAndColumnWisePrinting {
    public static void main(String[] args) {
        //1 2
        //3 4
        //5 6
        int[][] arr = {{1, 2}, {3, 4}, {5, 6}};
        int m = arr.length;
        int n = arr[0].length;
//        for (int i = 0; i < m; i++) { //rows
//            for (int j = 0; j < n; j++) { //cols
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }

        //transpose of matrix (column wise printing)
        for (int j = 0; j < n; j++) { //cols
            for (int i = 0; i < m; i++) { //rows
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        //storing in a new matrix
        int[][] transpose = new int[n][m];
        for (int i = 0; i < n; i++) { //cols
            for (int j = 0; j < m; j++) { //rows
                transpose[i][j]= arr[j][i];
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();

        }
    }
}

