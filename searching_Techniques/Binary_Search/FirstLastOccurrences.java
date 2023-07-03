// Input : arr[] = {1, 3, 5, 5, 5, 5, 67, 123, 125}, x = 5
// Output : First Occurrence = 2
//          Last Occurrence = 5


package searching_Techniques.Binary_Search;

public class FirstLastOccurrences {
    public static int findFirstOccurrence(int arr[],int target){
        int beg = 0;
        int end = arr.length-1;
        int first = -1;
        while(beg<=end){
            int mid = (beg + end) /2;
            if(arr[mid] == target){
                first = mid;
                end = mid -1;
            }
            if(arr[mid]>target){
                end = mid-1;
            }
            if(arr[mid]<target){
                beg = mid +1;
            }
            
        } 
        return first;
    }

    public static int findLastOccurrence(int arr[],int target){
        int beg = 0;
        int end = arr.length-1;
        int second = -1;
        while(beg<=end){
            int mid = (beg + end) /2;
            if(arr[mid] == target){
                second = mid;
                beg = mid + 1;
            }
            if(arr[mid]>target){
                end = mid-1;
            }
            if(arr[mid]<target){
                beg = mid +1;
            }
            
        } 
        return second;
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 5, 5, 5, 67, 123, 125};
        int target = 5;

        int firstIndex = findFirstOccurrence(arr, target);
        int lastIndex = findLastOccurrence(arr, target);

        System.out.println("First occurrence index: " + firstIndex);
        System.out.println("Last occurrence index: " + lastIndex);
    }
}
