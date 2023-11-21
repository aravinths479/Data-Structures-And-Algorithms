package Trash;

import java.util.ArrayList;
import java.util.List;

public class subset1 {
    public static void print(int index,int[] nums,List<List<Integer>> res,List<Integer> lst){
        if(index>=nums.length){

            res.add(new ArrayList<Integer>(lst));
            return;
        }
        lst.add(nums[index]);
        print(index+1,nums,res,lst);
        lst.remove(lst.size()-1);
        print(index+1,nums,res,lst);
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> lst = new ArrayList<Integer>();
        print(0,nums,res,lst);
        return res;
    }

    public static void main(String args[]){
        int[] nums = {3,2,1};
        List<List<Integer>> res = new ArrayList<>();
        res = subsets(nums);
        System.out.println(res);

    }
}
