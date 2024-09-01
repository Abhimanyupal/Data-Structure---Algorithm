package conditionalandloops;

import java.util.Scanner;

public class Fibonaccino {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        // Print the nth Fibonacci no:
        int a=0;
        int b=1;
        int count =2;
        while(count <=n ){
        int temp =b;
        b = b + a;
        a = temp;
        count++;
        }
        System.out.println(b);
    }

    
}
