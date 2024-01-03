import java.util.HashMap;

public class removeDuplicates2 {

    public static void  removeDuplicates(int arr[]) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i :arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        System.out.print(map);
        System.out.println();
        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i])==1){
                System.out.print(arr[i]+" ");
            }
        }
        
    
    }
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,2,4,5,1,8,9,9};
        removeDuplicates(arr);
    }
}
