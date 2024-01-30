// Given an array arr[] of integers. Find a peak element i.e. an element that is not smaller than its neighbors. 

// Input: array[]= {5, 10, 20, 15}
// Output: 20
// Explanation: The element 20 has neighbors 10 and 15, both of them are less than 20.

// Input: array[] = {10, 20, 15, 2, 23, 90, 67}
// Output: 20 or 90
// Explanation: The element 20 has neighbors 10 and 15, both of them are less than 20, 
// similarly 90 has neighbors 23 and 67.

public class peakElement {

    public static void peak(int arr[]) {

        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i - 1] < arr[i] && arr[i + 1] < arr[i]) {
                System.out.print(arr[i] + " ");
            }
        }

    }

    public static void main(String args[]) {
        int arr[] = { 10, 20, 15, 2, 23, 90, 67 };
        peak(arr);
    }
}
