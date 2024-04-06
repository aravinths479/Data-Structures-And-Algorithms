package evening_class;

public class lessThanK {
    public static void main(String[] args) {
        int arr[] = {10,20,40,44,11,12,89};
        int count = 0;
        int key = 44;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<key){
                System.out.print(arr[i]+" ");
                count++;
            }
        }
        System.out.println();
        System.out.println("count : "+count);
    }
}
