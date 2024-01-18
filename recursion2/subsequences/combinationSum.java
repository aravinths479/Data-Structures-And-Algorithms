package recursion2.subsequences;

// youtube -- https://www.youtube.com/watch?v=OyZFFqQtu98&list=PLgUwDviBIf0rGlzIn_7rsaR2FQ5e6ZOL9&index=10


// Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order.

// The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the 
// frequency
//  of at least one of the chosen numbers is different.

// The test cases are generated such that the number of unique combinations that sum up to target is less than 150 combinations for the given input.

 

// Example 1:

// Input: candidates = [2,3,6,7], target = 7
// Output: [[2,2,3],[7]]
// Explanation:
// 2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
// 7 is a candidate, and 7 = 7.
// These are the only two combinations.
// Example 2:

// Input: candidates = [2,3,5], target = 8
// Output: [[2,2,2,2],[2,3,3],[3,5]]
// Example 3:

// Input: candidates = [2], target = 1
// Output: []


import java.util.*;
public class combinationSum {

    public static void combinationSums(int index,int compliment,List<Integer> lst,int target,int sum,int[] arr,List<List<Integer>> res){
         if(sum == target){
                System.out.println(lst);
                res.add(new ArrayList<>(lst));     // Create a new ArrayList for each combination  to avoid multiple combinations stored
                return;
            }
        if (arr.length <= index || compliment < 0) {
            return;
        }
       
       lst.add(arr[index]);
       combinationSums(index, compliment-arr[index], lst, target, sum+arr[index], arr,res);
       lst.remove(lst.size()-1);
       combinationSums(index+1, compliment, lst, target, sum, arr,res);
    }
    public static void main(String args[]){
        int arr[] = {2,3,6,7};
        int target = 7;
        List<Integer> lst = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        combinationSums(0,target,lst,target,0,arr,res);
        System.out.println(res);
      
        
    }
}
