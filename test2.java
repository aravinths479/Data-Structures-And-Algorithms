
import java.util.*;

public class test2 {

    public static String generate(String str){
        String res = "";
        int first = 0;
        int second = 0;
        int count = 0;
        while(second<str.length()){
            if(str.charAt(first)==str.charAt(second)){
                count++;
                second++;
            }
            else{
                res = res + count + str.charAt(first) ;
                first = second;
                count = 0;
            }
        }
        res = res + count + str.charAt(first) ;

        return res;
    }

    public static String sequence(int n){
        String res = "1";
        for(int i=1;i<n;i++){
            res = generate(res);
        }
        return res;
    } 

    public static void main(String args[]){
        // String str = "1211";
        // System.out.println(str + " -> " + generate(str));
        
        // int n = 5;
        // System.out.println(n + " -> " +sequence(n));

        int[] arr1 = {1,3,4,7,9};
        int[] arr2 = {2,5,8,10,11};

        int i=0;
        int j=0;
        int k=0;
        int res[] = new int[arr1.length+arr2.length];

        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                res[k++] = arr1[i++];
            }
            else{
                res[k++] = arr2[j++];
            }
        }
        while(i<arr1.length){
            res[k++] = arr1[i++];
        }
        while(j<arr2.length){
            res[k++] = arr2[j++];
        }

        System.out.println(Arrays.toString(res));

    }
}

