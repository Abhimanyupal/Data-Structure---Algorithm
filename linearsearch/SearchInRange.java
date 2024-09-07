package linearsearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = { 1,45,36,35,33,65,63,53};
        int target = 33;
        System.out.println(search(arr,target,1,4));

    }
    static int search(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        // run a for loop
        for (int index = start; index <=end; index++) {
            // check for element at every index if it is = target
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return -1;
    }
}
