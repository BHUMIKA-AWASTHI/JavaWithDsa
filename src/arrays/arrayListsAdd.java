package arrays;

import java.util.ArrayList;

public class arrayListsAdd {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        System.out.println(list +" "+list.size());
        list.add(10);
        System.out.println(list +" "+list.size());
        list.add(30);
        System.out.println(list +" "+list.size());
        list.remove(1);
        System.out.println(list +" "+list.size());

    }
}
