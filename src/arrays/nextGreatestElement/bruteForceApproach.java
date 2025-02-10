package arrays.nextGreatestElement;

public class bruteForceApproach {
    public static void main(String[] args) {
        int[] arr = {23,45,65,29,48,89,76,30,76,70};
        int n = arr.length;
        int[] ans = new int[n];
        ans[n-1]= -1;

        // method 1: brute force


        for(int i= 0;i<n-1;i++){
            int mx = Integer.MIN_VALUE;
            for(int j = i+1;j<n;j++){
                mx = Math.max(mx,arr[j]);
            }

            ans[i]=mx;
        }
        for(int ele: arr){
            System.out.print(ele+" ");

        }
        System.out.println();
        for(int ele: ans){
            System.out.print(ele+" ");

        }


    }
}
