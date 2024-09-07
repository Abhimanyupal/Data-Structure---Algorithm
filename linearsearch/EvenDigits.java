package linearsearch;

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums ={12,35,2,6,7857};
        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[] nums){
        int count =0;
        for(int num:nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    private static boolean even(int num) {
        int numberOfDigits = digits(num);
        return numberOfDigits % 2 ==0;
    }

    private static int digits(int num) {
        if(num<0){
            num=num*-1;
        }
        if(num==0){
            return 1;
        }
        int count =0;
        while(num>0){
            count++;
            num=num/10;//num/=10;
        }
        return count;
        // shortcut to find no fo digits :
        // noOfDigits = (int)(Math.log10(nums)) + 1;

    }
}
