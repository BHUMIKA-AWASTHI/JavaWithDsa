package conditionals;

import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter marks");
        int n = sc.nextInt();

        if (n>=81) System.out.println("very good");
        else if (n>=61) System.out.println("good");
        else if (n>=41) System.out.println("average");
        else System.out.println("fail");


    }
}
