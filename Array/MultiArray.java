package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MultiArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
  //      int[][] arr = new int[3][];//need not specify the no of columns.
// directly 2D array:
//        int [][] arr2D={
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };
        int[][] arr = new int[3][3];
        System.out.println(arr.length); // no of rows
        // Input
        for (int row = 0; row <arr.length ; row++) {
            //for each col in every row
            for ( int col = 0; col < arr[row].length; col++){
                arr[row][col]=in.nextInt();
            }
        }
        //Output
//        for (int row = 0; row < arr.length ; row++) {
////            for (int col = 0; col <arr[row].length ; col++) {
////                System.out.print(arr[row][col] + " ");
////            }
////            System.out.println();
//            System.out.println(Arrays.toString(arr[row]));
//        }
        //Enhanced for loop
        for(int[] a:arr) {
            System.out.println(Arrays.toString(a));
        }
    }
}
