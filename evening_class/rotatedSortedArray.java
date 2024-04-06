package evening_class;

public class rotatedSortedArray {
    public static boolean IsRotated(int[] arr){
        int index = 0;
        boolean breakOne = false;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                breakOne = true;
                break;
            }
            else if(arr[i]<arr[i+1]){
                index = i+1;
            }
        }
        boolean breakTwo = true;
        int indextwo = 0;
        for(int i=index+1;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                breakTwo = false;
                break;
            }
            else if(arr[i]<arr[i+1]){
                indextwo = i+1;
            }
        }
        indextwo++;
        System.out.println(indextwo);
        if(breakOne == true && breakTwo == true && indextwo == arr.length){
            return true;
        }

        return false;
    }
    public static void main(String[] args) {
        int arr[] = {10,11,12,13,1,2,3,4,5,6,7,8,9};
        System.out.println(IsRotated(arr));
    }
}
