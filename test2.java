import java.util.*;

public class test2 {
    public static List<Integer> find(int arr[]){
        List<Integer> lst = new ArrayList<>();
        int max = arr[arr.length-1];
        lst.add(max);
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>max){
                max = arr[i];
                lst.add(0,max);
            }
        }
        return lst;
    }
    public static void main(String[] args) {
        int arr[] = {16,17,4,3,5,2};
        System.out.println(find(arr));
    }
}

