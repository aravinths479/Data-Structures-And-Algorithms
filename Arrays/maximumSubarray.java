// input : [1,2,-4,3,1]
// output : 4

// algo tamizha  - explained in attack on typing

import java.util.*;
public class maximumSubarray {
    public static int max(int[] arr) {
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>ans){
                ans = arr[i];
            }
        }
        return ans;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        // finding max num in the array for ans default value
        int ans = max(arr);
        for(int i=0;i<n;i++){
            if((sum+arr[i])<0){
                sum = 0;
            }
            if((sum+arr[i])>0){
                sum = sum+arr[i];
                ans = Math.max(sum,ans);

            }
        }
        System.out.println(ans);
        
    }
}
