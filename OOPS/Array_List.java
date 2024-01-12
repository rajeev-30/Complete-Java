package OOPS;

import java.util.*;

public class Array_List {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>(4);
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(1, 44);

        System.out.println(l.get(0));
        System.out.println(l.contains(45));
        System.out.println(l.indexOf(1));

    };

}