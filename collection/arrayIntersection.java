// input : [1,2,3,4,5] , [5,6,7,8,9]
// output : [5,6]


package collection;
import java.util.*;
public class arrayIntersection {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr1[] = {1,2,3,4,5,6};
        int arr2[] = {5,6,7,8,9};
        Set<Integer> set = new HashSet<Integer>(); 
        List<Integer> lst = new ArrayList<Integer>();

        for(int i:arr1){
            set.add(i);
        }
        for(int i:arr2){
            if(set.contains(i)){
                lst.add(i);
            }
        }
        System.out.println(lst);
    }
}
