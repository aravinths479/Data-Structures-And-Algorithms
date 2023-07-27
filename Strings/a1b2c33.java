// input : a1b2c10
// output : abbcccccccccc

import java.util.*;
public class a1b2c33 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String nums = "";
        char letter = ' ';
        for(char c: str.toCharArray()){
            if(!(c>='0' && c<='9')){
                if(nums!=""){
                    int n = Integer.parseInt(nums);
                    for(int i=0;i<n;i++){
                        System.out.print(letter);
                    }
               
                }
            nums = "";
            letter = c;    // for last iteration keep track of character
            }
            else{
                nums = nums+c;
            }
        }
        int n = Integer.parseInt(nums);
        for(int i=0;i<n;i++){
            System.out.print(letter);
        }
    }
}
