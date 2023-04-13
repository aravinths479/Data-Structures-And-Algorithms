// input      [4, 5,  2,  25]
// output     [5, 25, 25, -1] 

import java.util.*;
public class next_greatest_element {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int greatest = 0;
        int k=0;
        int res[] = new int[n];
        int next = -1;
        for(int i=0;i<n;i++){
            res[k] = -1;
            for(int j=i+1;j<n;j++){
                if(arr[i]<arr[j]){
                    res[k] = arr[j];
                    k++;
                    break;
                }
            }
        }
        res[n-1]=-1;
        for(int i:res){
            System.out.print(i+" ");
        }

    }
}
