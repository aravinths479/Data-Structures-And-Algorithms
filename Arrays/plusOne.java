// Input: digits = [1,2,3]
// Output: [1,2,4]
// Explanation: The array represents the integer 123.
// Incrementing by one gives 123 + 1 = 124.
// Thus, the result should be [1,2,4].

import java.math.BigInteger;

public class plusOne {
    public static int[] add(int[] digits) {
        StringBuilder sb = new StringBuilder();
        for(int i:digits){
            sb.append(i);
        }
        BigInteger res = new BigInteger(sb.toString());
        res = res.add(BigInteger.ONE);
        String str = res.toString();
        int arr[] = new int[str.length()];
        for(int i=0;i<str.length();i++){
            arr[i] = str.charAt(i) - '0';
        }
        return arr;
    }
    public static void main(String args[]){
        int digits[] = {1,2,3};
        int res[] = add(digits);
        for(int i:res){
            System.out.print(i);
        }
    }
}
