package recursion;

public class functionCalls {
    public static void mango(){
        System.out.println("hi i am in mango"); //7
    }
    public static void banana() {
        System.out.println("hi i am in banana"); //5
        mango(); //6
    }
    public static void apple(){
        System.out.println("hi i am in apple"); //3
        banana(); //4
    }
    public static void main(String[] args) {
        System.out.println("hi i am in main method"); //1
        apple(); //2
    }
}
