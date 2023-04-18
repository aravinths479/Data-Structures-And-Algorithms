// Input: {“geeksforgeeks”, “geeks”, “geek”, “geezer”}
// Output: “gee”


import java.util.*;
public class longest_common_prefix{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String strs[] = new String[n];
        for(int i=0;i<n;i++){
            strs[i] = sc.next();
        }
        String prefix = strs[0];

        for(int i=1;i<n;i++){
            while(strs[i].indexOf(prefix)!=0){
                prefix = prefix.substring(0,prefix.length()-1);
            }
        }
        System.out.print(prefix);

    }
}