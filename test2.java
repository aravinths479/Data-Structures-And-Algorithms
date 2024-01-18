import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * test2
 */
public class test2 {

    public static List<List<Integer>> threeSumFind(int[] nums) {
        
        List<List<Integer>> lst = new ArrayList<>();
        
        Set<List<Integer>> set = new HashSet<>();
        
        Arrays.sort(nums);
        
        int target = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == target) {
                    if (set.add(Arrays.asList(nums[i], nums[j], nums[k]))) {
                        lst.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    }
                    j++;
                    k--;
                } else if (sum < target) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return lst;
    }
    

     

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = threeSumFind(nums);
    
        System.out.println("Unique triplets that add up to 0:");
        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }
    }
    
}