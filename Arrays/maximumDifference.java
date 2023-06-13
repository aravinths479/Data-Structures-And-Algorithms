import java.util.*;
public class maximumDifference {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Maximum difference is between "+arr[0]+" and "+ arr[arr.length-1] + " is "+ (arr[arr.length-1]-arr[0]) );
    }
}
