import java.util.*;

public class mergeTwoArrays {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {6,7,8,9,10};

        int res[] = new int[arr1.length+arr2.length];
        int count = 0;
        for(int i=0;i<arr1.length;i++){
            res[count++] = arr1[i];
        }

        for(int i=0;i<arr2.length;i++){
            res[count++] = arr2[i];
        }

        System.out.println("Merged Array : "+Arrays.toString(res));
    }
}
