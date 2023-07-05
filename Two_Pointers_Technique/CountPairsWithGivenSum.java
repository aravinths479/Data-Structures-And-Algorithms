package Two_Pointers_Technique;

public class CountPairsWithGivenSum {
    public static void count(int arr[],int sum){
        int left = 0;
        int right = arr.length - 1;
        int count = 0;

        while (left < right) {
            int currentSum = arr[left] + arr[right];

            if (currentSum == sum) {
                count++;
                left++;
                right--;
            } else if (currentSum < sum) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println(count);

    }
    public static void main(String args[]){
        int arr[] = {10, 12, 10, 15, -1, 7, 6, 5, 4, 2, 1, 1, 1};
        int sum = 11;
        count(arr,sum); 
    }
}
