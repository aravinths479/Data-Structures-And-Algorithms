public class test2 {
    // Function to find the lower bound of a target element in a sorted array
    public static int lowerBound(int[] arr, int target) {
        int left = 0, right = arr.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    // Function to find the upper bound of a target element in a sorted array
    public static int upperBound(int[] arr, int target) {
        int left = 0, right = arr.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 4, 4, 6, 7};
        int target = 2;

        int lowerIndex = lowerBound(arr, target);
        int upperIndex = upperBound(arr, target);

        System.out.println("Lower Bound of " + target + " is at index: " + lowerIndex);
        System.out.println("Upper Bound of " + target + " is at index: " + upperIndex);
    }
}
