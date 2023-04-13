import java.util.*;
public class Array_rotation{

    public static void calc(int arr[] , int d){
        int temp[] = new int[arr.length];
        int j=0;
        for(int i=d;i<arr.length;i++){
            temp[j] = arr[i];
            j++;
        }
        int k=0;
        for(int i=arr.length-d;i<temp.length;i++){
            temp[i]=arr[k];
            k++;
        }
        for(int i=0;i<temp.length;i++){
            System.out.println(temp[i]);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = {3, 4, 5, 6, 7, 1, 2};
        int d = 2;
        calc(arr,d);
    }
}
