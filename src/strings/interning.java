package strings;

public class interning {
    public static void main(String[] args) {
        //interning is used to save space
        String s = "bhumika"; // we cannot change the individual character of string
        String t = "bhumika"; // both are pointing to same string
        String u = new String("bhumi"); // also used for declaring string
        //s= "anshika";
        System.out.println(s);
    }
}
