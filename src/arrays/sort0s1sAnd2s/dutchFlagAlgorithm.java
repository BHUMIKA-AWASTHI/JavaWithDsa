package arrays.sort0s1sAnd2s;

public class dutchFlagAlgorithm {
    public static void main(String[] args) {
        int[] arr= {0,1,1,0,2,0,0,2,2,1,2,0,1,0,1,1,0};
        int n = arr.length;
        //3 pointer approach --> low, mid,
        // one pass solution
        int mid =0, high=n-1, low=0;
        while(mid<=high){
            if(arr[mid]==0){
                int temp= arr[mid];
                arr[mid]= arr[low];
                arr[low]= temp;
                low++; mid++;
            }
            else if(arr[mid]==1) mid++;
            else { //arr[mid]==2;
                    int temp= arr[mid];
                    arr[mid]= arr[high];
                    arr[high]= temp;
                    high--;
            }
        }
        for (int ele: arr){
            System.out.print(ele+ " ");
        }

    }
}
