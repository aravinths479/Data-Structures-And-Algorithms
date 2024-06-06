import java.util.*;
public class test {
    public static void reverse(int[] arr,int start,int n){
        if(start >= n){
            return ;
        }
        int temp = arr[start];
        arr[start] = arr[n];
        arr[n] = temp;
        reverse(arr, start+1, n-1);
    }
    public static boolean palindrome(String str, int start, int end){
        if(start>=end){
            return true;
        }
        if(str.charAt(start)==str.charAt(end)){
            return palindrome(str, start+1, end-1);
        }
        return false;
    } 
    public static void fibo(int n,int first,int second){
        if(n==0){
            //System.out.println(second);
            return;
        }
        int third = first+second;
        first = second;
        second = third;
        System.out.println(first);
        //System.out.println(second);
        fibo(n-1,first,second);
    }
    public static void main(String[] args) {
       
        // String str = "malayalyalam";
        // System.out.println(palindrome(str, 0, str.length()-1));
        fibo(10, 0, 1);
    }
}
