package arrays;

public class rollNo {
    public static void main(String[] args) {
        int[] arr = {81,38,78,45,67,30,19,69};
                int n = arr.length;
        for (int i=0;i<n;i++){
            if(arr[i]<35) System.out.println(i+" ");
        }
    }
}
