package switchandnested;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch (fruit){
            case "Mango":
                System.out.println("King of Fruit");
                break;
            case "Apple":
                System.out.println("Red fruit");
                break;
            default:
                System.out.println("invalid fruit");
        }
        /*
        Enhanced  Switch statement.
         switch (fruit) {
            case "Mango" -> System.out.println("King of Fruit");
            case "Apple" -> System.out.println("Red fruit");
            default -> System.out.println("invalid fruit");
        }
         */
    }
}
