package conditionals;

import java.sql.SQLOutput;
import java.util.Scanner;

public class greatestOf3num {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("enter 1st num:");
        int a = sc.nextInt();
        System.out.print("enter 2nd num:");
        int b = sc.nextInt();
        System.out.print("enter 3rd num:");
        int c = sc.nextInt();
        if (a>=b && a>=c) System.out.println(a+ "is greatest");
        else if (b>=a && b>=c) System.out.println(b+ "is greatest");
        else System.out.println(c+ "is greatest");
    }
}