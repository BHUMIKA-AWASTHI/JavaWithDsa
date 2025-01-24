package arrays;

public class sumOfArray {
    public static void main(String[] args) {
    int[] arr= {32,75,35,79,85,27};
    int sum = 0;
    for(int i =0; i< arr.length;i++){
        sum += arr[i];
    }
        System.out.println(sum);
    }
}
