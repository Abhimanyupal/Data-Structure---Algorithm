package linearsearch;

public class Minimum {
    public static void main(String[] args) {
        int[] arr = {1,3,5,67,44,35,6,5,7,76,43,};
        System.out.println(min(arr));
    }
    static int min(int[] arr){
        int ans = arr[0];
        for(int i=1;i<arr.length;i++) {
            if(arr[i]<ans){
                ans=arr[i];
            }
        }
        return ans;
    }
}
