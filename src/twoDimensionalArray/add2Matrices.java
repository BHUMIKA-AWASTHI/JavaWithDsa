package twoDimensionalArray;

public class add2Matrices {
    public static void main(String[] args) {

        // adding 2 matrices

        int[][] a= {{2,4,5},{5,7,2},{9,4,3}};
        int[][] b = {{3,4,8},{2,7,0},{3,9,7}};
        int m = a.length;
        int n = a[0].length;
        int[][] res = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n ; j++) {
                res[i][j]= a[i][j]+b[i][j];
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n ; j++) {
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}
