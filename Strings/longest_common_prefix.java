// Input: {“geeksforgeeks”, “geeks”, “geek”, “geezer”}
// Output: “gee”

package Strings;
import java.util.*;
public class longest_common_prefix{
    public static void main(String args[]){

        String strs[] = {"geeksforgeeks", "geeks", "geek", "geezer"};
        String prefix = strs[0];


        for(int i=1;i<strs.length;i++){
            while(strs[i].indexOf(prefix)!=0){
                System.out.println(strs[i].indexOf(prefix));
                prefix = prefix.substring(0,prefix.length()-1);
            }
        }
        System.out.print(prefix);

    }
}