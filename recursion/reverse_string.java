// input   :  qwertyuiop
// output  :  poiuytrewq


package recursion;
import java.util.Scanner;
public class reverse_string {

    public static String reversedString(String str){
        if(str.length()<=1){
            return str;
        }

        return str.charAt(str.length()-1) + reversedString(str.substring(0, str.length() - 1));
        
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String res = reversedString(str);
        System.out.println(res);
    }
}
