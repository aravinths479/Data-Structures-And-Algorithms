import java.util.*;

public class test {

    public static int sqrt(int x) {
        int low = 0;
        int high = x;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mid * mid == x) {
                return mid;
            }
            else if(mid*mid > x){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return high;
    }

    public static void main(String[] args) {
        int target = 37;
        System.out.println(sqrt(target));
    }
}