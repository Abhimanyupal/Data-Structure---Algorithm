package conditionalandloops;

public class Reverseno {
    public static void main(String[] args) {
        
        int num=38779;
        int ans=0;
        while(num>0){
            int rem=num%10;
            num=num/10;
            ans=ans*10+rem; // reversing the no

        }
        System.out.println(ans);
    }
    
}
