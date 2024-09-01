import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Temp in C:");
        float TempC = input.nextFloat();
        float TempF = (TempC*9/5)+32;
        System.out.println(TempF);
    }
    
}
