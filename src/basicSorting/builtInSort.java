package basicSorting;
import java.util.Arrays;
public class builtInSort {
    public static void main(String[] args) {
        int[] arr = {12,-10,6,4,5};
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        Arrays.sort(arr); // built in sort
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
