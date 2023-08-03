// https://www.youtube.com/watch?v=AxNNVECce8c&list=PLgUwDviBIf0rGlzIn_7rsaR2FQ5e6ZOL9&index=6

// Given an array. The task is to generate and print all of the possible subsequences of the given array using recursion.

// Examples: 

// Input : [3, 1, 2]
// Output : [3, 1, 2] [3, 1] [3, 2] [3] [1, 2] [1] [2] []

// Input : [1, 2]
// Output : [2], [1], [1, 2], []


// explained in note


import java.util.*;

public class subsequences {
    public static void print(int index, List<Integer> lst, int[] arr) {
        // Base case: If the index is equal to or greater than the array length,
        // we have processed all elements, so print the current subsequence and return.
        if (index >= arr.length) {
            System.out.println(lst);
            return;
        }
        // Include the current element at the given index in the subsequence.
        lst.add(arr[index]);
        // Recursively call the print function with the next index to consider the next element.
        print(index + 1, lst, arr);

        // Exclude the current element at the given index from the subsequence.
        lst.remove(lst.size() - 1);
        // Recursively call the print function with the next index without the current element.
        print(index + 1, lst, arr);
    }

    public static void main(String args[]) {
        int arr[] = {3,1,4};
        List<Integer> lst = new ArrayList<>();
        print(0, lst, arr);
    }
}



// public class subsequences{
//     public static void print(int index,List<Integer> lst,int[] arr){
//         if(index>=arr.length){
//             System.out.println(lst);
//             return;
//         }
//         lst.add(arr[index]);
//         print(index+1,lst,arr);
//         lst.remove(lst.size()-1);
//         print(index+1,lst,arr);
//     }
//     public static void main(String[] args){
//         int arr[] = {3,1,2};
//         int index = 0;
//         List<Integer> lst = new ArrayList<>();
//         print(index,lst,arr);
//     }
// }