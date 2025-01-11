package loops;

import java.util.Scanner;

public class compositeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();

        int x =0; //0 means prime
        for(int i =2;i<=n-1;i++){ //i is a factor of 'n'
            if (n%i==0) {
                System.out.println("composite number");
                x = 1; //1 means composite
                break;
            }
        }
        if(n==1) System.out.println("neither prime nor composite");
        if(x==0) System.out.println("prime number");
    }
}
