package evening_class;

public class minMax {
    public static void find(int[] arr){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            max = Math.max(max,arr[i]);
            min = Math.min(min,arr[i]);
        }
        System.out.println("Max : "+max);
        System.out.println("Min : "+min);

       
        int secondMin = Integer.MAX_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i] > min && arr[i] < secondMin){
                secondMin = arr[i];
            }
            if(arr[i] < max && arr[i] > secondMax){
                secondMax = arr[i];
            }
        }
        System.out.println("second min : "+secondMin);
        System.out.println("second max : "+secondMax);
    }
    public static void secondLargestOptimized(int arr[]){
        int secondLargest = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secondLargest = max;
                max = arr[i];
            }
        }
        System.out.println(secondLargest);
    }
    public static void main(String[] args) {
        int[] arr = {10,20,7,1,90,34,3};
        find(arr);  
        secondLargestOptimized(arr);
    }
}
