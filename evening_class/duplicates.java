package evening_class;
import java.util.*;
public class duplicates {


    public static void findDuplicates(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(map.get(arr[i]), 0)+1);
        }
        System.out.println("duplicates : ");
        for(Map.Entry<Integer,Integer> i : map.entrySet()){
            if(i.getValue()>1){
                System.out.print(i.getKey()+" ");
            }
        }
        int max = 0;
        System.out.println();
        System.out.println("Greater than 1 :");
        for(Map.Entry<Integer,Integer> i : map.entrySet()){
            if(i.getValue() >1){
                System.out.println(i.getKey()+" -> "+i.getValue());
                max = Math.max(max,i.getValue());
            }
        }
        System.out.println("Largest : "+max);
        
    }
    public static void main(String[] args) {
        int arr[] = {1,2,2,5,5,5,7};
        findDuplicates(arr);
    }
}
