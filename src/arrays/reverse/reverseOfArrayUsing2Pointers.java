package arrays.reverse;

public class reverseOfArrayUsing2Pointers {
    public static void main(String[] args) {
        int[] arr= {10,20,30,40,50,60,70};
        int n = arr.length;
        for(int ele: arr){
            System.out.print(ele+" ");

        }
        System.out.println();
        //reverse
        int i=0,j=n-1;
        while(i<=j){
            swap(arr,i,j); // we can also swap a small part of a huge array by initialising the values of i and j from the required index
            i++;
            j--;

        }
        for(int ele: arr){
            System.out.print(ele+" ");

        }
        System.out.println();
    }

    public static void swap(int[] arr, int i, int j) { // swapping function
        int temp= arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
    }
}
