// Input: mat[][] = { {10, 20, 30, 40},
//                     {15, 25, 35, 45},
//                     {27, 29, 37, 48},
//                     {32, 33, 39, 50}};
// Output: 10 20 30 40 45 35 25 15 27 29 37 48 50 39 33 32 

import java.util.*;
public class snakePattern {

    public static List<Integer> print(int[][] arr) {
        int n = arr.length;
        List<Integer> lst = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            if(i%2==0){
                for(int m=0;m<n;m++){
                        lst.add(arr[i][m]);
                }
            }
            else{
                for(int m=n-1;m>=0;m--){
                        lst.add(arr[i][m]);
                }
            }
        }
        return lst;
    }
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
       
        int arr[][] = { {10, 20, 30, 40},
                    {15, 25, 35, 45},
                     {27, 29, 37, 48},
                     {32, 33, 39, 50}};
        
        List<Integer> lst = print(arr);
        System.out.println(lst);
    }
}
