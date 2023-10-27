package searching_Techniques.Binary_Search;

public class binary_search {
    public static int search(int arr[],int target,int beg,int end){
        
        if(beg<=end){
            
            int mid = ( beg + end )/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]<target){
                beg = mid + 1;
                return search(arr, target, beg, end);
            }
            if(arr[mid]>target){
                end = mid - 1;
                return search(arr, target, beg, end);
            }
        }

        return -1;

    }
    public static void main(String args[]){
        int arr[] = {2, 5, 8, 12, 23, 16, 38, 56, 72, 91};
        int target = 23;
        int index = search(arr,target,0,arr.length-1);
        System.out.println("Index : "+ index);
    }
}






