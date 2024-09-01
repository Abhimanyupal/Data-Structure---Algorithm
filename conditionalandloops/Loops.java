package conditionalandloops;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        /*
         Syntax for for loops:
         for (initialisation;condition;increment/decrement) {
            body 
            }
         */
        //Q: Print no from 1 to 5
        // for (int num =1;num<=5;num+=1) {
        //     System.out.println(num);
        // }
        //print from 1 to n:
        Scanner in = new Scanner(System.in);
        // int n=in.nextInt();
        // for (int num = 1; num <= n; num++) {
        //     System.out.println(num);
            
        // }
        /*
         Syntax for while loop:
         while(condition){
         //body
         }
         */
        // int num =1;
        // while (num<=5) {
        //     System.out.println(num);
        //     num+=1;
            
        // }
        /*
         Syntax for do while loop:
         do{
         //body
         }while(Condition);
         */
        //Q:print hello atleast once 
        int n =1;
        do{
            System.out.println("Hello");
        }while( n!=1);
    }
    
}
