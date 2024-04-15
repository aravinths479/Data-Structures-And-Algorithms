package evening_class;

public class binarysearch {
    public static int search(int arr[],int target){
        int left = 0;
        int right = arr.length - 1;
        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(target<arr[mid]){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {10,20,24,26,28,30,32};
        System.out.println(search(arr, 24));

    }
}
