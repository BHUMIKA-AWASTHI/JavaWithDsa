package basicSorting;

public class selectionsort {
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
        // selection sorting
        for (int i = 0; i < n-1; i++) {
            int min = Integer.MAX_VALUE;
            int mindx = -1;
            for (int j = i; j < n; j++) {
                if(arr[j]<min){
                    min= arr[j];
                    mindx= j;
                }
            }
            swap(arr,i,mindx);

        } print(arr);
    }
}
