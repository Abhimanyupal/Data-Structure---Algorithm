package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // array of Primitives:
//        int[] arr = new int[5];
//        arr[0]= 23;
//        arr[1] = 24;
//        arr[2] = 25;
//        arr[3] = 26;
//        arr[4] = 27;
//        System.out.println(arr[3]);
        // input using for loop:
//        for (int i =0; i<arr.length;i++) {
//            arr[i] = in.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));
//        for (int i =0; i<arr.length;i++) {
//            System.out.print( arr[i] + " " );
//        }
//        for (int j : arr) {// for every element of the array print the element.
//            System.out.print(j + " "); // here j represents element of the array.
//        }


        // Array of objects:
        String[] arr = new String[5];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = in.next();
        }
        System.out.println(Arrays.toString(arr));

    }
}
