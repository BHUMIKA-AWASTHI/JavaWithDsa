package basics;
import java.util.Scanner;
public class inputClass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number");
        int n = sc.nextInt();
        System.out.println(n*n);
    }

}

