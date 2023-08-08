//  https://www.youtube.com/watch?v=ogjf7ORKfd8&list=PLgUwDviBIf0rGlzIn_7rsaR2FQ5e6ZOL9&index=8  - youtube - take you foaward

// explained in note - AOT


package sorting;
import java.util.*;
public class MergeSortAlgorithm {
    public static void merge(int arr[],int low,int mid,int high){
        int left = low;
        int right = mid+1;
        //int temp[] = new int[low+high];
        List<Integer> temp = new ArrayList<>();

        while(left<=mid && right <= high){
            if(arr[left]<arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }
    
        while(left<=mid){
            temp.add(arr[left]);
                left++;                       // left array remaining value to temp array
        }

                                            // it will execute any one loop because only on left or right contains remaining values
        while(right<=high){
            temp.add(arr[right]);               // right array remaining value to temp array
            right++;
        }
        int i = low;
        for(int val:temp){
            arr[i] = val;                  // assign the new values from temp to original array
            i++;
        }
        System.out.println(temp);   //see changes over time
    }
    public static void mergesort(int arr[],int low,int high){
        if(low>=high){
            return;
        }
        int mid = (low+high)/2;
        mergesort(arr, low, mid);
        mergesort(arr, mid+1, high);
        merge(arr,low,mid,high);
    }
    public static void main(String args[]){
        int arr[] = {3,2,4,1,3};
        mergesort(arr,0,arr.length-1);
        System.out.println("After sorting : "+Arrays.toString(arr));
    }
}
