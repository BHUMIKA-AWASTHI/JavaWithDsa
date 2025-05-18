package basicSorting;

public class checkIfArrayIsSorted {
    public static void main(String[] args) {
        int[] arr ={1,2,7,5,10};
        int n = arr.length;
        boolean flag = true; // true means sorted
        for (int i = 0; i < n-1; i++) {
            if(arr[i]>arr[i+1]){
                flag = false; //false means unsorted
                break;
            }
        }
        if(flag== true) System.out.println("sorted");
        else System.out.println("unsorted");
    }
}
