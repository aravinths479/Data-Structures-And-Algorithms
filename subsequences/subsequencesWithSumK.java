// https://www.youtube.com/watch?v=eQCS_v3bw0Q&list=PLgUwDviBIf0rGlzIn_7rsaR2FQ5e6ZOL9&index=7

// must watch video

// output : [1, 1] [2]

package subsequences;
import java.util.*;


// public class subsequencesWithSumK {
//     public static void print(int index,List<Integer> lst,int sum, int k, int arr[]){
//         if(index==arr.length){
//             if(k == sum){
//                 System.out.println(lst);
//             }
//             return;
//         }
//         lst.add(arr[index]);
//         sum = sum+arr[index];
//         print(index+1,lst,sum,k,arr);
//         sum = sum-arr[index];  // removing the last element which is added
//         lst.remove(lst.size()-1);  // removing the last element
//         print(index+1,lst,sum,k,arr);
//     }
//     public static void main(String args[]){
//         int index = 0;
//         int sum = 0;
//         int arr[] = {1,2,1};
//         int k = 2;
//         List<Integer> lst = new ArrayList<>();
//         print(index,lst,sum,k,arr);  
//     }
// }


// if i want to only print one subsequence

public class subsequencesWithSumK {
    public static boolean print(int index,List<Integer> lst,int sum, int k, int arr[]){
        if(index==arr.length){
            if(k == sum){
                System.out.println(lst);
                return true;
            }
            else return false;
        }
        lst.add(arr[index]);
        sum = sum+arr[index];

        if(print(index+1,lst,sum,k,arr)==true){
            return true;                           // if it finds it returns true and true and true until the last_call
        }

        sum = sum-arr[index];  // removing the last element which is added
        lst.remove(lst.size()-1);  // removing the last element

        if(print(index+1,lst,sum,k,arr)==true){   // same goes here, if it finds it returns true and true and true until the last_call
            return true;
        }


        return false;
    }
    public static void main(String args[]){
        int index = 0;
        int sum = 0;
        int arr[] = {1,2,1};
        int k = 2;
        List<Integer> lst = new ArrayList<>();
        print(index,lst,sum,k,arr);  
    }
}
