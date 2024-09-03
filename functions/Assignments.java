package functions;

import java.util.Scanner;

public class Assignments {
    // Q:  Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the First no: ");
//        int n1 = in.nextInt();
//        System.out.println("Enter the Second no: ");
//        int n2 = in.nextInt();
//        System.out.println("Enter the Third no: ");
//        int n3 = in.nextInt();
//        int max = big(n1,n2,n3);
//        System.out.println("Biggest no: " +max);
//        int min = small(n1,n2,n3);
//        System.out.println("Smallest no: " +min);
//
//    }
//    static int big(int n1,int n2,int n3){
//        int max = n1;
//        if (n2 > max) {
//            max = n2;
//        }
//        if (n3> max) {
//            max = n3;
//        }
//        return max;
//    }
//    static int small(int n1,int n2,int n3){
//        int min = n1;
//        if (n2 < min) {
//            min = n2;
//        }
//        if (n3< min) {
//            min = n3;
//        }
//        return min;
//    }
    // Q: A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the person's age: ");
//        int age = in.nextInt();
//        String ans = voting(age);
//        System.out.println(ans);
//    }
//    static String voting(int age) {
//        if(age >= 18) {
//           return "Can Vote";
//        } else
//           return "Can't Vote";
//    }
    // Q: Write a program to print the sum of two numbers entered by user by defining your own method.
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the num1: ");
//        int num1 = in.nextInt();
//        System.out.println("Enter the num2: ");
//        int num2 = in.nextInt();
//        int ans = sum(num1,num2);
//        System.out.println("Sum is: " +ans);
//    }
//    static int sum(int a,int b) {
//        return a + b;
//    }
    // Q: Program for sum of two digit of the number by defining your own method.
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the two digit no: ");
//        int num = in.nextInt();
//        int ans1 = sum(num);
//        System.out.println("Sum : " +ans1);
//    }
//    static int sum(int a) {
//        int ans=0;
//        while (a != 0) {
//            int rem = a % 10; // Get the last digit
//            ans += rem; // Add the last digit to the sum
//            a = a / 10;
//        }
//        return ans;
//    }
    // Q: Write a program to print the factorial of a number by defining a method named 'Factorial'.
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the number: ");
//        int num = in.nextInt();
//        int ans = factor(num);
//        System.out.println("Factorial of the number is " +ans);
//    }
//
//     static int factor(int num) {
//         int factorial = 1;
//         for (int i = 1; i <= num; i++) {
//             factorial *= i; // Multiply factorial by the current number
//         }
//         return factorial;
//    }
    // Q: Write a function to find if a number is a palindrome or not. Take number as parameter.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = in.nextInt();
        if(palindrome(num)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }

     static boolean palindrome(int num) {
        int rev = 0;
        int temp = num;
        while (temp != 0) {
            rev = (rev * 10) + (temp % 10);
            temp = temp / 10;
        }
        return (rev == num);
    }

}
