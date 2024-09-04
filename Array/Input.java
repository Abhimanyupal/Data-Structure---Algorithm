package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        // ARRAY OF PRIMITIVES:
        //input directly:
//        arr[0] = 23;
//        arr[1] = 23;
//        arr[2] = 25;
//        arr[3] = 24;
//        arr[4] = 34;
//        System.out.println(arr[3]);
        //Input array using for loop:
//        for (int i = 0; i < arr.length ; i++) {
//            arr[i] = in.nextInt();
//        }
//        // For printing array:
////        for (int i = 0; i < arr.length ; i++) {
////            System.out.print(arr[i] +" ");
////        }
////        for (int j : arr) {// for every element in array, print the element.
////            System.out.print(j + " ");// here j represents element of the array
////        }
//        //simple print array:
//        System.out.println(Arrays.toString(arr));// output:[1, 2, 3, 4, 6]
        // ARRAY OF OBJECTS:
        String[] str = new String[4];
        for (int i = 0; i < str.length ; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
