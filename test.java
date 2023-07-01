import java.util.*;
class test {
   public static int maxCircularSubarraySum(int[] arr) {
        int n = arr.length;

        // Kadane's algorithm to find maximum subarray sum
        int maxSum = arr[0];
        int currentSum = arr[0];
        for (int i = 1; i < n; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        // Kadane's algorithm to find minimum subarray sum
        int minSum = arr[0];
        currentSum = arr[0];
        for (int i = 1; i < n; i++) {
            currentSum = Math.min(arr[i], currentSum + arr[i]);
            minSum = Math.min(minSum, currentSum);
        }

        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        int circularSum = Math.max(maxSum, totalSum - minSum);

        return circularSum;
    }

    public static void main(String[] args) {
        int[] arr = { 10, -3, -4, 7, 6, 5, -4, -1};
        int maxCircularSum = maxCircularSubarraySum(arr);
        System.out.println("Maximum circular subarray sum: " + maxCircularSum);
    }
}