package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class List {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);
//        list.add(10);
//        list.add(13);
//        list.add(12);
//        list.add(13);
//        list.add(122);
//        list.add(88);
//        list.add(19);
// can use as following also:
        for (int i = 0; i <5 ; i++) {
            list.add(in.nextInt());
        }
        //get item at any index
        for (int i = 0; i <5 ; i++) {
            System.out.println(list.get(i)); // pass index here. list[ index] syntax not work here.
        }
        System.out.println(list);
    }
}
