package strings;

public class builtInStringMethods {
    public static void main(String[] args) {
        String s = "bhumika awasthi";
        System.out.println((s.charAt(4))); // each character is treated as an element of array
        //System.out.println(s.charAt(15)); //array index out of the bound
        int n = s.length();
        System.out.println(n);
    }
}
