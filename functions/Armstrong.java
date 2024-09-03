package functions;

import java.util.Scanner;
//    ** Print all the Armstrong numbers.
public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      //  int n = in.nextInt();
//        boolean ans=isAnstrong(n);
//        System.out.println(ans);
        for (int i = 100; i <1000 ; i++) {
            if (isAnstrong(i)){
                System.out.print(i + " ");
            }
        }
    }
    static boolean isAnstrong(int n) {
        int original = n;
        int sum=0;
        while(n>0) {
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem*rem*rem;
        }
        return sum==original;

    }
}
