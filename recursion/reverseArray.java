package recursion;

public class reverseArray {
    public static int[] reverse(int arr[],int start,int end){
        if(start>=end){
            return null;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverse(arr, start+1, end-1);
        return arr;
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int res[] = reverse(arr,0,arr.length-1);
        for(int i:res){
            System.out.print(i+" ");
        }
    }    
}
