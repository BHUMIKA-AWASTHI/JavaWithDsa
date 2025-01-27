package arrays;

public class maxInArray {
    public static void main(String[] args) {
        int[] arr = {10,4,78,43,67,58,99};
                int mx= arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i]>mx) mx = arr[i];
        }

        int smx= Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            if (arr[i] !=mx)
                smx= Math.max(smx,arr[i]);

        }
        System.out.println(mx);
        System.out.println(smx);
    }
}
