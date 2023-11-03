package searching_Techniques.Binary_Search;

public class sqrtOfaNumber {
    public static int mySqrt(int x) {
        int low = 0;
        int high = x;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if ((long)mid *(long) mid == (long)x) {
                return mid;
            }
            else if((long)mid*(long)mid > x){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return high;
    }
    public static void main(String[] args) {
        System.out.println(mySqrt(25));
    }
}
