package strings;

public class equals {
    public static void main(String[] args) {
        String s = "abcxyz";
        String a = "abcxyz";
        String b = new String(s);
        String c = "abc";
        c= c+"xyz";
        System.out.println(s==b); //compares address
        System.out.println(s.equals(b)); //compares characters
    }
}
