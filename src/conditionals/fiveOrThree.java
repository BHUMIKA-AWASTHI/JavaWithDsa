package conditionals;
import java.util.Scanner;

public class fiveOrThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num");
        int n = sc.nextInt();

        if (n%5 == 0 || n%3 ==0) System.out.println("divisible by 5 or 3");
        else System.out.println("not divisible");
    }
}