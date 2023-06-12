package simple_programs;

import java.util.*;
public class stringReverse {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = "";
        for(int i=str.length()-1;i>=0;i--){
            str1 = str1 + str.charAt(i);
        }
        System.out.println(str1);
    }
}
