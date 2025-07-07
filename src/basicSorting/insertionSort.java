package basicSorting;
// insertion sort is a stable sort
public class insertionSort {
    public static void print(int[] arr){
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void swap(int[] arr, int i, int j){
        //swap arr[i] and arr[mindx]
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]= temp;
    }
    public static void main(String[] args) {
        int[] arr = {10,-4,-6,90,20};
        int n = arr.length;
        print(arr);
        // insertion sorting
        for (int i = 0; i < n-1; i++) { //n-1 passes

            for (int j = i; j >=1; j--) {
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);

                } else break;;
            }
        } print(arr);
    }
}

