package binarysearch;
public class OrderAgnosticBinarySearch {

    public static int orderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // Check if the array is sorted in ascending or descending order
        boolean isAscending = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // If target is found at mid
            if (arr[mid] == target) {
                return mid;
            }

            if (isAscending) {
                // For ascending order
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                // For descending order
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        // Target not found
        return -1;
    }

    public static void main(String[] args) {
        int[] ascendingArray = {2, 4, 6, 8, 10, 12, 14};
        int[] descendingArray = {14, 12, 10, 8, 6, 4, 2};

        int target = 10;

        int result1 = orderAgnosticBinarySearch(ascendingArray, target);
        int result2 = orderAgnosticBinarySearch(descendingArray, target);

        System.out.println("Index of target in ascending array: " + result1);
        System.out.println("Index of target in descending array: " + result2);
    }
}
