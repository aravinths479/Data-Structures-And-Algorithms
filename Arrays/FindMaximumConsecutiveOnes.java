public class FindMaximumConsecutiveOnes {
    public static int check(int[] nums) {
        int count=0;
        int max = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }
            if(nums[i]==0){
                count = 0;
            }
            max = Math.max(max,count);
        }

        return max;
    }
    public static void main(String args[]){
        int nums[] = {1,1,0,1,1,1};
        System.out.println( check(nums) );
    }
}
