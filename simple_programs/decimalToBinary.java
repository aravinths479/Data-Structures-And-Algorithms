//package simple_programs;
import java.util.*;
public class decimalToBinary {
    public static void main(String arsgs[]){
        Scanner sc = new Scanner(System.in);
        int dec = sc.nextInt();
        String str = "";
        while(dec>0){
            str = dec%2 + str;
            dec = dec/2;
        }
        System.out.println(str);
    }
}
