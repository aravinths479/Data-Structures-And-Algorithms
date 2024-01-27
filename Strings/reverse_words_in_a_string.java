

// input  - this is a test data
// output - data test a is this

package Strings;
import java.util.*;

public class reverse_words_in_a_string {
    static String[] reverse(String str[]){
        int start = 0;
        int end = str.length-1;
        while(start<=end){
            String temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
        return str;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str_arr[] = str1.split(" ");
        String res[] = reverse(str_arr);
        for(String i:res){
            System.out.print(i+" ");
        }
    }
}
