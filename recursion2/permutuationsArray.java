// tap acadamy - https://www.youtube.com/watch?v=vKQ6oUH02gw 

// Given an array nums of distinct integers, return all the possible permutations. 
// You can return the answer in any order.

// Example 1:

// Input: nums = [1,2,3]
// Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
// Example 2:

// Input: nums = [0,1]
// Output: [[0,1],[1,0]]
// Example 3:

// Input: nums = [1]
// Output: [[1]]

package recursion2;
import java.util.*;
public class permutuationsArray {
    public static void permutuate(int[] arr,int firstIndex,List<List<Integer>> ans){
        if(firstIndex==arr.length-1){
            System.out.println(Arrays.toString(arr));
            ans.add(asList(arr));
            return;
        }

        for(int i=firstIndex;i<arr.length;i++){
            swap(arr,firstIndex,i);
            permutuate(arr, firstIndex+1, ans);
            swap(arr,firstIndex,i);
        }
    }
    public static int[] swap(int[] arr,int firstIndex,int i){
        int temp = arr[i];
        arr[i] = arr[firstIndex];
        arr[firstIndex] = temp;
        return arr;
    }
    public static List<Integer> asList(int[] arr){
        List<Integer> lst = new ArrayList<>();
        for(int i:arr){
            lst.add(i);
        }
        return lst;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int firstIndex = 0;
        List<List<Integer>> ans = new ArrayList<>();
        permutuate(arr,firstIndex,ans);
        System.out.println(ans);
    }
}
