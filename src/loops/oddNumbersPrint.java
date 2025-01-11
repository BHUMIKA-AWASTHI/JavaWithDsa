package loops;

public class oddNumbersPrint {
    public static void main(String[] args) {
//        // 100 iterations
//        for(int i =1;i<=100;i++){
//            if (i%2!=0) System.out.println(i+" ");
//
//            //50 iterations
//            for(int i =1;i<=100;i+=2){
//                System.out.println(i+" ");

                // 100 iterations (continue)
                for(int i =1;i<=100;i++){
                    if (i%2!=0) {
                        continue;

                    }
                        System.out.println(i+" ");


        }
    }
}
