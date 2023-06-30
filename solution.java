public class solution {
    public static int max(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=max){
                max = arr[i];
            }
        }
        return max;
    }
    public static int maxProduct(int[] nums) {
        if(nums.length ==0 ){
            return 0;
        }
        int ans = max(nums);
        int sum = 1;

        for(int i=0;i<nums.length;i++){
            if((sum*nums[i])<0){
                sum = 0;
            }
            if((sum*nums[i]) > 0){
                ans =  Math.max(sum,ans);
                sum = sum*nums[i];
            }
        }


        return ans;
        
    }
    public static void main(String args[]){
       int  nums[] = {2,3,0,4};
       System.out.println(maxProduct(nums));
    }
}
