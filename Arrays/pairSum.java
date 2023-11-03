// two sum (or) pair sum sorted array
// input : arr[]={1,2,3,4,5} , x = 5
// output : true

// input : arr[]={1,2,3,4,5} , x = 20
// output : false


public class pairSum {

    public static boolean isPairSum(int arr[],int x){
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            if(arr[i]+arr[j] == x){
                return true;
            }
            else if(arr[i]+arr[j] > x){
                j--;
            }
            else{
                i++;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int x = 8;
        System.out.println(isPairSum(arr,x));
    }
}
