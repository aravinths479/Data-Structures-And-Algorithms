// Suppose you have a sorted array of infinite numbers, how would you search an element in the array?
// Source: Amazon Interview Experience. 
// Since array is sorted, the first thing clicks into mind is binary search, but the problem here is that we don’t know size of array. 
// If the array is infinite, that means we don’t have proper bounds to apply binary search. So in order to find position of key, first we find bounds and then apply binary search algorithm.
// Let low be pointing to 1st element and high pointing to 2nd element of array, Now compare key with high index element, 
// ->if it is greater than high index element then copy high index in low index and double the high index. 
// ->if it is smaller, then apply binary search on high and low indices found. 



public class infiniteArraySearch {
     // Function to perform binary search
    // in an infinite sorted array
    public static int findPosition(int[] arr, int target) {
        int low = 0;
        int high = 1;

        // Finding the range that contains the target element
        while (arr[high] < target) {
            low = high;
            high *= 2;
        }

        // Performing binary search within the range
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        // Element not found
        return -1;
    }

    // Testing the program
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30 }; // Example sorted array
        int target = 18; // Element to search for

        int position = findPosition(arr, target);

        if (position != -1) {
            System.out.println("Element found at position: " + position);
        } else {
            System.out.println("Element not found.");
        }
    }
}
