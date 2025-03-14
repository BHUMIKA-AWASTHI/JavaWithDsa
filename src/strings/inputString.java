package strings;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class inputString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your name: ");
        String str= sc.nextLine();
        System.out.print("hello ");
        System.out.println(str);
    }
}
