import java.util.*;
public class binaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        double val = 0;
        int power_val = 0;
        for(int i=n.length()-1;i>=0;i--){
            int current = n.charAt(i) - '0'; 
            val = val + (current * (int)Math.pow(2,power_val));
            power_val++;
        }
        int res = (int)val;
        System.out.println(res);
    }
}
