package twoDimensionalArray;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ArrayList2D {
    public static void main(String[] args) {
        List<Integer> a= new ArrayList<>();
        a.add(10); a.add(20); a.add(30);
        List<Integer> b= new ArrayList<>();
        b.add(40); b.add(50);
        List<Integer> c= new ArrayList<>();
        List<Integer> d = new ArrayList<>();
        d.add(60);
        List<List<Integer>> l = new ArrayList<>();
        l.add(a); l.add(b); l.add(c); l.add(d);

        System.out.println(l.get(1).get(1)); // getting the second element from the second row
        
        for (int i = 0; i <l.size() ; i++) { // printing with brackets
            System.out.println(l.get(i));

        }
        System.out.println();

        for (int i = 0; i < l.size(); i++) { // printing elements individually
            List<Integer> x = l.get(i);
            for (int j = 0; j < x.size(); j++) {
                System.out.print(x.get(j)+" ");
                
            }
            System.out.println();
            
        }
    }
}
