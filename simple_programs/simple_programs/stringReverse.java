package simple_programs;

// input = sanjeev

// output = result = veejnas

import java.util.*;
public class stringReverse {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = "";
        
        for(int i=str.length()-1;i>=0;i--){
            result = result + str.charAt(i);
        }
        System.out.println(result);
    }
}
