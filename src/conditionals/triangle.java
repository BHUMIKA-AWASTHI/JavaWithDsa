package conditionals;

import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter 1st side:");
        int a = sc.nextInt();
        System.out.print("enter 2nd side:");
        int b = sc.nextInt();
        System.out.print("enter 3rd side:");
        int c = sc.nextInt();

        if (a+b >c && b+c>a && c+a>b) System.out.println("valid triangle");
        else System.out.println("invalid triangle");
    }
}
