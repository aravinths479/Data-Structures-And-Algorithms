import java.util.*;
public class test{
    public static boolean check(String str){
        if(str.length()<=1){
            return true;
        }
        if(str.charAt(0)!=str.charAt(str.length()-1)){
            return false;
        }
        return check(str.substring(1, str.length()-1));

        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = "malayalam";
        boolean res =  check(str);
        System.out.println(res);
    }
}