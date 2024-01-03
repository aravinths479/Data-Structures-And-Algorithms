package simple_programs.simple_programs;

/**
 * secondLargestNumber
 */
public class secondLargestNumber {

    public static int secondLargest(int arr[]) {
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] < firstLargest) {
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        int arr[] = { 8, 1, 2, 3, 4, 5, 6, 7, 9, 0 };
        System.out.println(secondLargest(arr));

    }
}