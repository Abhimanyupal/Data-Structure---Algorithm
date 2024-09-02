package switchandnested;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int empID = in.nextInt();
        String Dep = in.next();

        switch (empID) {
            case 1 -> System.out.println("Abhi");
            case 2 -> System.out.println("Rahul");
            case 3 -> {
                System.out.println("empID is " + empID);
                switch (Dep) {
                    case "IT" -> System.out.println("IT DEp");
                    case "Manager" -> System.out.println("Management Dep ");
                    default -> System.out.println("invalid Dep");
                }
            }
            default -> System.out.println("invalid empId");
        }
    }
}
