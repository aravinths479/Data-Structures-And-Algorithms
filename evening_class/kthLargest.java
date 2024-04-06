package evening_class;

public class kthLargest {
    public static void find(int arr[], int k) {
        int KthLargest = 0;

        for (int i = 0; i < k; i++) {
            
            int max = Integer.MIN_VALUE;
            int maxIndex = Integer.MIN_VALUE;

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    maxIndex = j;
                }
            }
            if (i == k - 1) {
                KthLargest = max;
                break;
            }
            arr[maxIndex] = 0;

        }
        System.out.println("Max : " + KthLargest);
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 7, 1, 90, 34, 3 };
        find(arr, 4);
    }
}
