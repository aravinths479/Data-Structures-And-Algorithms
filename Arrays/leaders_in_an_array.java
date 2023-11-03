// Write a program to print all the LEADERS in the array. An element is a leader if it is greater than all the 
// elements to its right side. And the rightmost element is always a leader. 

// For example:

// Input: arr[] = {16, 17, 4, 3, 5, 2}, 
// Output: 17, 5, 2

// Input: arr[] = {1, 2, 3, 4, 5, 2}, 
// Output: 5, 2

import java.util.*;
public class leaders_in_an_array {
    public static void leaders(int arr[]){
        for(int i=0;i<arr.length;i++){
            int j;
            for(j=i+1;j<arr.length;j++){
                if(arr[i]<=arr[j]){
                    break;
                } 
            }
            if(j==arr.length){
                System.out.print(arr[i]+" ");
            }
        }
    }
// another approach
     public static void printLeaders(int arr[])
    {
        int max_from_right =  arr[arr.length-1];
        System.out.print(max_from_right+" ");
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i] > max_from_right ){
                System.out.print(arr[i]+" ");
                max_from_right = arr[i];
            }
        }
    }

    public static List<Integer> find(int arr[]){
        List<Integer> lst = new ArrayList<>();
        int max = arr[arr.length-1];
        lst.add(max);
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>max){
                max = arr[i];
                lst.add(0,max);    // also have function reverse. so no need index accesing
            }
        }
        return lst;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = {16, 17, 4, 3, 5, 2};
        
       // leaders(arr);
        System.out.println("Another Approach");
        printLeaders(arr);
    }
}




// import java.io.*;
// public class LeadersInArray
// {
// 	/* Java Function to print leaders in an array */
// 	void printLeaders(int arr[], int size)
// 	{
// 		int max_from_right = arr[size-1];

// 		/* Rightmost element is always leader */
// 		System.out.print(max_from_right + " ");
	
// 		for (int i = size-2; i >= 0; i--)
// 		{
// 			if (max_from_right < arr[i])
// 			{		
// 			max_from_right = arr[i];
// 			System.out.print(max_from_right + " ");
// 			}
// 		}	
// 	}

// 	/* Driver program to test above functions */
// 	public static void main(String[] args)
// 	{
// 		LeadersInArray lead = new LeadersInArray();
// 		int arr[] = new int[]{16, 17, 4, 3, 5, 2};
// 		int n = arr.length;
// 		lead.printLeaders(arr, n);
// 	}
// }
