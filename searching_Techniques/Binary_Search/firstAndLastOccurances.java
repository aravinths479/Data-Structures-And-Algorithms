// First Occurance Index :3
// Last Occurance Index:10
// Duplicates : 8



package searching_Techniques.Binary_Search;

public class firstAndLastOccurances {
    public static int firstOccurances(int nums[], int target) {
        int low = 0;
        int high = nums.length - 1;
        boolean found = false;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                found = true;
                high = mid - 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if(found){

            return low;
        }
        return -1;
    }

    public static int lastOccurances(int nums[], int target) {
        int low = 0;
        int high = nums.length - 1;
        boolean found = false;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                found = true;
                low = mid + 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        if (found) {

            return high;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 10 };
        int target = 8;
        System.out.println("First Occurance Index :" + firstOccurances(arr, target));
        System.out.println("Last Occurance Index:" + lastOccurances(arr, target));
        int duplicates = (lastOccurances(arr, target) - firstOccurances(arr, target)) + 1;
        System.out.println("Duplicates : " + duplicates);
    }
}
