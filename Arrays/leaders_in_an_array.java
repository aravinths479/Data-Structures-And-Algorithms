import java.util.*;
public class leaders_in_an_array {
    public static void leaders(int arr[],int n){
        for(int i=0;i<n;i++){
            int j;
            for(j=i+1;j<n;j++){
                if(arr[i]<=arr[j]){
                    break;
                } 
            }
            if(j==n){
                System.out.println(arr[i]+" ");
            }
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        leaders(arr,n);
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
