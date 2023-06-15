// Input: nums = [13,25,83,77]
// Output: [1,3,2,5,8,3,7,7]
// Explanation: 
// - The separation of 13 is [1,3].
// - The separation of 25 is [2,5].
// - The separation of 83 is [8,3].
// - The separation of 77 is [7,7].
// answer = [1,3,2,5,8,3,7,7]. Note that answer contains the separations in the same order.

public class SeparateDigitsInArray {
    public static int[] separateDigits(int[] nums) {
        String res = "";
        for(int i=0;i<nums.length;i++){
            res = res + nums[i];
        }
        int arr[] = new int[res.length()];
        for(int i=0;i<res.length();i++)
        {
            arr[i] = res.charAt(i) - '0';
        }
        return arr;
    }
    public static void main(String args[]){
        int nums[] = {13,25,83,77};
        int res[] = separateDigits(nums);
        for(int i:res){
            System.out.print(i+" ");
        }
    } 
}
