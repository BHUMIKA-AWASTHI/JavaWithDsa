package basicSorting;
//technique: swapping every 2 adjacent elements if arr[i]>arr[i+1]
public class bubbleSort {
    public static void print(int[] arr){
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {3,5,30,10,1};
        int n = arr.length;
        print(arr);

 //BUBBLE SORT -1
       /* for(int x=0;x<=n-1;x++) { //n-1 passes will be the max number of passes for any array
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }

         */
 //BUBBLE SORT -2

        /*for(int x=0;x<=n-1;x++) { //n-1 passES
            for (int i = 0; i < n - 1-x; i++) { //-x will optimize the no of operations because in every pass, the last element gets at its original position
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        */
        // BUBBLE SORT OPTIMISED
        for(int x=0;x<=n-1;x++) { //n-1 passes
            boolean flag = true;
            for (int i = 0; i < n - 1-x; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    flag = false;
                }
            }
            // check if this pass has sorted or not
            if(flag==true) break;
        }
        print(arr);
    }
}
/*
 space complexity= O(n) --> given array of size 'n'
 auxiliary space --> O(1)
 time complexity= O(n-1)² = O(n²)
*/
