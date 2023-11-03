// take you forward - https://www.youtube.com/watch?v=jtSiWTPLwd0&list=PLgUwDviBIf0pMFMWuuvDNMAkoQFi-h0ZF&index=8 

// visit rotated sorted array problems

package searching_Techniques.Binary_Search;

public class howManyTimesArrayRotated {
    public static int findMin(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        int ans = Integer.MAX_VALUE;
        int index = -1;

        while(low<=high){
            int mid = (low+high)/2;
            if(nums[low]<=nums[mid]){  // check for left half sorted or not , if sorted go inside
                if(nums[low]<ans){
                    index = low;
                    ans = nums[low];
                }
                low = mid+1;
            }
            else{
                if(nums[mid]<ans){
                    ans = nums[mid];
                    index = mid;
                }
                high = mid-1;
            }            
        }

        return index;
    }
    public static void main(String[] args) {
        int nums[] = {4,5,6,7,0,1,2};  // output :  4
        System.out.println(findMin(nums)); 
    }
}
