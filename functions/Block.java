package functions;

public class Block {
    public static void main(String[] args) {
        int a =10;
        int b=20;
        {
            //int a=10; already initialised outside the block so you cannot initialise it again.
           // but you can change the value.
            a=33;// reassign the original value with some other value.
            int c=45;
            //values initialised in this block, will remain in block
        }
        //System.out.println(c);
        //cannot use outside the block.
        int c=10;
        System.out.println(a);
        System.out.println(c);
    }
}
