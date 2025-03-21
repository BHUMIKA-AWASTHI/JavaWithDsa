package strings;
import java.util.Scanner;
public class convertIntToString {
    public static void main(String[] args) {
        System.out.println("enter integer :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //String s = ""+n;
        String s = Integer.toString(n); //built in function
        System.out.println(s);
        System.out.println(s.length());
    }
}
