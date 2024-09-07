package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class List {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Syntax:
        ArrayList<Integer> list = new ArrayList<>(5);
//        list.add(67);
//        list.add(6);
//        list.add(6466);
//        list.add(344);
//        list.add(6347);
//        list.add(45);
//        list.add(678);
//        //System.out.println(list.contains(67));
//        System.out.println(list);
//        list.set(0,99);
//
//        list.remove(2);
//        System.out.println(list);
//        // input:
        for (int i = 0; i <5 ; i++) {
            list.add(in.nextInt());
        }
        // get item at any index
        for (int i = 0; i <5 ; i++) {
            System.out.println(list.get(i)); // pass index here, list[index] syntax not work here.
        }
    }
}
