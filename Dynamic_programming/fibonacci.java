//https://www.youtube.com/watch?v=oBt53YbR9Kk    -- watch fully understandable

//https://www.youtube.com/watch?v=tyB0ztf0DNY&list=PLgUwDviBIf0qUlt5H_kiKYaNSqJ81PMMY&index=2
// https://chat.openai.com/share/4a972a9b-ae70-4e65-ba26-604a979a9f6f


package Dynamic_programming;
import java.util.*;

public class fibonacci {
    private static Map<Integer,Integer> memo = new HashMap<Integer,Integer>();
    public static int fib(int n){
        if (n <= 1)
            return n;     // also a base case returns to previous stack frame and gets added

        if (memo.containsKey(n))
            return memo.get(n);   // also a base case returns to previous stack frame and gets added


        int fib = fib(n - 1) + fib(n - 2);
        memo.put(n, fib);
        return fib;
    }
    public static void main(String args[]){
        System.out.println(fib(20));
    }
}
