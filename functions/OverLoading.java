package functions;

public class OverLoading {
    public static void main(String[] args) {
//        fun(56);
//        fun("Abhimanyu");
       int ans= sum(1,4);
        System.out.println(ans);
        int ans3=sum(2,4,7);
        System.out.println(ans3);
    }
    static int sum(int a,int b){
        return a+b;
    }
    static int sum(int a,int b,int c){
        return a+b+c;
    }
//    static void fun(int a){
//        System.out.println("");
//        System.out.println(a);
//    }
//    static void fun(String name ){
//        System.out.println(name);
//    }
}
