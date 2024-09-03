package functions;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
   //   ** Check the  number is prime or not.
        int n = in.nextInt();
        boolean ans=isprime(n);
        System.out.println(ans);
    }
    static boolean isprime(int n) {
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        boolean b = c * c > n;
        return b;


    }
}
