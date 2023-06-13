package collection;
import java.util.*;
public class countFrequency {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,6,4,1,6};
        Map<Integer,Integer> freq = new HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++){
            if(freq.containsKey(arr[i])){
                freq.put(arr[i],freq.get(arr[i])+1);     //get() method is used th get the current value the key holding
                                                        // get(arr[i]) will get the value of map . obtained using the key 
            }
            else{
                freq.put(arr[i],1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            Integer key = entry.getKey();     // Access the key of the entry
            Integer value = entry.getValue(); // Access the value of the entry

            System.out.println("NUM :  " + key + ", FREQ: " + value);
        }
        System.out.println(freq);
    }
}
