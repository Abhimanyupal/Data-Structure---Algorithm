package conditionalandloops;

import java.util.Scanner;

public class Largestno {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a =in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();

        // int max =a;
        // if(b>max){
        //     max=b;
        // }
        // if(c>max){
        //     max=c;
        
        // }


        // another method ;
        int max = Math.max(a, Math.max(b, c));
        System.out.println(max);
    
    }
    
}
