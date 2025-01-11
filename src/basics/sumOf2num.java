package basics;

import java.util.Scanner;

public class sumOf2num {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("enter 1st num");
        int a = x.nextInt();
        Scanner y = new Scanner(System.in);
        System.out.println("enter 2d num");
        int b = y.nextInt();
        System.out.println(a+b);
    }
}
