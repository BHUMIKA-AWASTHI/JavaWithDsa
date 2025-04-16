package strings;

public class maxValue {
    public static void main(String[] args) {
        String arr[]  = {"10166454756342234246354767867856434278","436","0099","8439"};
        String maxS = arr[0];
        for (int i = 1; i < arr.length; i++) {
           maxS = max(maxS,arr[i]);
        }
        System.out.println(maxS);
    }
    public static String max(String a,String b){
        String s= purify(a),t = purify(b);
        if(s.length()>t.length()) return s;
        if(s.length()<t.length()) return t;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)!=t.charAt(i)) {
                if (s.charAt(i) > t.charAt(i)) return a;
                else return b;
            }
        }
        if(a.length()>=b.length()) return a;
        else return b;
    }
    public static String purify(String s){
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)!= '0') return s.substring(i);

        } return s;
    }
}
