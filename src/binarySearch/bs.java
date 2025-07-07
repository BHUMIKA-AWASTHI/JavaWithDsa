package binarySearch;
public class bs {
    public static void main(String[] args) {
        int[] arr = {10, 23, 45, 47, 61, 67, 70, 80, 92};
        int target = 61;
        int n = arr.length;
        int lo = 0, hi = n - 1;
        boolean flag = false; // false means not present
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (arr[mid] == target) {
                flag = true;
                break;
            } else if(arr[ mid]>target) hi= mid-1;
            else if(arr[mid]<target) lo = mid+1;
            }
        if(flag==true) System.out.println("target present");
        else System.out.println("target not found");
        }
}
