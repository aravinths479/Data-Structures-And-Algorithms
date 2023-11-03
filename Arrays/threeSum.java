import java.util.*;


public class threeSum {

    public static boolean find(int arr[], int x) {
        for (int i = 0; i < arr.length; i++) {
            int left = i + 1;
            int right = arr.length - 1;
            while (left <= right) {
                if (arr[i] + arr[left] + arr[right] == x) {
                    System.out.println(arr[i]+" "+arr[left]+" "+arr[right]);
                    return true;
                } else if (arr[i] + arr[left] + arr[right] > x) {
                    right--;
                } else if (arr[i] + arr[left] + arr[right] < x) {
                    left++;
                }
            }
        }
        return false;
    }

     

    public static void main(String[] args) {
        int arr[] = { -1,0,1,2,-1,-4 };
        Arrays.sort(arr);
        int x = 56;
        System.out.println(find(arr, x));

    }
}
