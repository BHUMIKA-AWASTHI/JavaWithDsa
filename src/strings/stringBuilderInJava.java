package strings;

public class stringBuilderInJava {
    public static void main(String[] args) {
        String s =""; // by default capacity=16
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        StringBuilder x = new StringBuilder(10);
        System.out.println(x.capacity());

    }
}
