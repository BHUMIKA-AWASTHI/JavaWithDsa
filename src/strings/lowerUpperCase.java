package strings;

public class lowerUpperCase {
    public static void main(String[] args) {
        String s = "Bhumika Awasthi IS 20 YEARS Old";
        //s.toLowerCase() -> nothing will happen
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());

        //concatenation
        String a = "abc";
        String b = "xyz";
        System.out.println(a.concat(b));
        System.out.println(a);
        a= a.concat(b);
        System.out.println(a);
    }
}
