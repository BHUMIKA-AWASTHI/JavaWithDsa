package arrays.nextGreatestElement;

public class method2 {
    public static void main(String[] args) {
        int[] arr = {23,45,65,29,48,89,76,30,76,70};
        int n = arr.length;
        int[] ans = new int[n];
        ans[n-1]= -1;

        // optimised method ( recommended)
        int nge = arr[n-1];
        for (int i =n-2;i>=0 ; i--){
            ans[i]= nge;
            nge= Math.max(nge,arr[i]);

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
