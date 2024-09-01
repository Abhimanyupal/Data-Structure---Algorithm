import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        // float num = input.nextInt();
        //TypeCasting
        int num=(int)(59659.4875f);
        System.out.println(num);

        //Automatic type convertion in expression
        int a =257;
        byte b =(byte)(a); //257 % 256 = 1
    }
    
}
