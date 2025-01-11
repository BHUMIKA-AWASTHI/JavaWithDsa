package conditionals;

import java.util.Scanner;

public class greatestOf3Nested {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("enter 1st num:");
        int a = sc.nextInt();
        System.out.print("enter 2nd num:");
        int b = sc.nextInt();
        System.out.print("enter 3rd num:");
        int c = sc.nextInt();

        if (a > b){
            if(a>c) System.out.println(a+"is greatest");
            else  //c>a>b
                System.out.println(c+"is largest");
        }else{ //b>a
            if(b>c) System.out.println(b+"is largest");
            else //c>b>a
                System.out.println(c+"is largest");

        }
    }
}
