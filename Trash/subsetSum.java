package Trash;
import java.util.*;
public class subsetSum {
    public static void print(int index,int[] arr,int sum,List<Integer> lst){
        if(index>=arr.length){
            lst.add(sum);
            return;
        }
        print(index+1,arr,sum+arr[index],lst);
        print(index+1,arr,sum,lst);
    }
    public static void main(String args[]){
        int arr[] = {3,1,2};
        int sum = 0;
        List<Integer> lst = new ArrayList<>();
        int index = 0;
        print(index,arr,sum,lst);
        Collections.sort(lst);
        System.out.println(lst);
    }
}
