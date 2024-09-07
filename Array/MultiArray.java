package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MultiArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
        // or
//        int[][] arr = {
//                {1,2,3},
//                { 4, 5, 6 },
//                {7,8,9,}
//        };
        //input:
        for(int i =0; i< arr.length;i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                arr[i][j] = in.nextInt();
            }
        } //output:
//        for(int i =0; i< arr.length;i++) {
//            for (int j = 0; j <arr[i].length ; j++) {
//                System.out.print(arr[i][j]+ " ");
//            }
//            System.out.println();
//        } Other method:
//        for(int i =0; i< arr.length;i++) {
//            System.out.println(Arrays.toString(arr[i]));
//        } Enhanced for loop
        for(int[] a:arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
