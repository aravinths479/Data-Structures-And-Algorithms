package recursion;

import java.util.*;
public class decimalToBinary {
    public static String convert(int decimal, String res) {
        if(decimal == 0){
            return res;
        }

        res =  decimal % 2 + res ;
        return convert(decimal/2, res);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String res = "";
        int n = sc.nextInt();
        res = convert(n, res);
        System.out.print(res);

    }
}
