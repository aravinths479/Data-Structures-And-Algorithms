// Input: strs = ["flower","flow","flight"]
// Output: "fl"
package Strings;
import java.util.*;

public class longestCommonPrefix {
    public static String find(String[] str){
        if(str.length==0){
            return "";
        }
        String prefix = str[0];
        for(int i=1;i<str.length;i++){
            while(str[i].indexOf(prefix)!=0){
                prefix = prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str[] = {"Aravinth Kirshna","Aravinth","Aravinth swamy"}; 
        String res = find(str);
        System.out.println(res);
    }
}
