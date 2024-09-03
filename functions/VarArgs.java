package functions;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {

        fun( 2, 4, 6, 34, 67);
    }
    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}