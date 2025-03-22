package strings;

public class updateEvenPositions {
    public static void main(String[] args) {
        //poor performance due to immutability
        String s = "Physics wallah skills";
        String str= "";
        for (int i = 0; i < s.length(); i++) {
            if(i%2==0) str +='a';
            else str+= s.charAt(i);
        }
        System.out.println(str);
    }
}
