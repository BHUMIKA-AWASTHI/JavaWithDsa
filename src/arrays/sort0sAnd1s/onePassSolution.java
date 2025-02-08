package arrays.sort0sAnd1s;

public class onePassSolution {
    public static void main(String[] args) {
        int[] arr= {0,1,1,0,0,1,0,1,1,0};
        int n = arr.length;

        // one pass solution
        // hint: 2 pointer approach and swapping

        int i=0, j=n-1;
        while(i<j){
            if(arr[i]==0) i++;
            if(arr[j]==1) j--;
            if (i>j) break;
            if(arr[i]==1 && arr[j]==0){
                arr[i]=0; // swap
                arr[j]=1; //swap
                i++;
                j--;
            }
        }
        for (int ele: arr){
            System.out.print(ele+ " ");
        }
    }
}
