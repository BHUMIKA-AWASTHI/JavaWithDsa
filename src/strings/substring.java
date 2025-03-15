package strings;

public class substring {
    public static void main(String[] args) {
        String s = "abcde";
        System.out.println(s.substring(3));// prints 3 and forward indexes
        System.out.println(s.substring(1,4)); //gets that part of the string from i to j-1
        System.out.println(s.substring(2,2)); //nothing will print
        System.out.println(s.substring(0,5)); //complete string will print
    }
}
