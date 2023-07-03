// first refer FirstLastOccurrences program









//  Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 2
//   Output: 4 // x (or 2) occurs 4 times in arr[]


package searching_Techniques.Binary_Search;

public class CountOccurrences {
    public static int countOccurrences(int arr[], int target) {
        int firstIndex = findFirstOccurrence(arr, target);

        if (firstIndex == -1) {
            // Element not found in the array
            return 0;
        }

        int lastIndex = findLastOccurrence(arr, target);

        return lastIndex - firstIndex + 1;  // calculate total by indice position 
    }

    public static int findFirstOccurrence(int arr[], int target) {
        int left = 0;
        int right = arr.length - 1;
        int firstOccurrence = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                firstOccurrence = mid;
                right = mid - 1; // Look for earlier occurrences on the left side
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return firstOccurrence;
    }

    public static int findLastOccurrence(int arr[], int target) {
        int left = 0;
        int right = arr.length - 1;
        int lastOccurrence = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                lastOccurrence = mid;
                left = mid + 1; // Look for later occurrences on the right side
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return lastOccurrence;
    }

    public static void main(String[] args) {
        int arr[] = {2, 5, 8, 8, 12, 16, 23, 23, 23, 38, 56, 72, 91};
        int target = 23;

        int occurrenceCount = countOccurrences(arr, target);

        System.out.println("Number of occurrences: " + occurrenceCount);
    }
}
