package arrays.sort0sAnd1s;

public class sort0sAnd1s {
    public static void main(String[] args) {
        int[] arr= {0,1,1,0,0,1,0,1,1,0};
        int n = arr.length;
        // general method
        int noOfZeroes= 0;
        for(int i=0;i<n;i++){
            if(arr[i]==0) noOfZeroes++;

        }
        for(int i=0;i<n;i++){
            if(i < noOfZeroes) arr[i]=0;
            else arr[i]=1;
        }
        for (int ele: arr){
            System.out.print(ele+ " ");
        }

    }
}
