package strings;



public class indexOf {
    public static void main(String[] args) {
        //indexOf()
        String s= "bhumika awasthi";
        System.out.println(s.indexOf('a'));
        System.out.println(s.indexOf('z')); //element not present= -1
        System.out.println(s.lastIndexOf('a'));
        //compareTo()
        System.out.println();
        String a = "abc";
        String b= "dbc";
        System.out.println(a.compareTo(b)); // compares the strings lexically
        System.out.println();
        //basic functions
        String c= "Physics wallah";
        System.out.println(c.contains("hy"));
        System.out.println(c.startsWith("Ph"));
        System.out.println(c.endsWith("ah"));
    }
}
