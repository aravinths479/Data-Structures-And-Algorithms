package searching_Techniques.Binary_Search;

public class sqrtOfaNumber {
    public static int mySqrt(int x) {
        if(x==0){
            return 0;
        }
         int low = 1;
         int high = x;
         int ans = 1;
         while(low<=high){
            int mid = low + (high-low) /2;   // to avoid integer overflow   example if you add two numbers that is beyond 
                                           // integer memeory it results in overflow . so we use this 

            if((long)mid*(long)mid<(long)x){
                ans = mid; 
                low = mid+1;
            }
            else if(mid*mid==x){
                return mid;
            }
            else{
                high = mid - 1;
            }
           
         }

         return high;
    }
    public static void main(String[] args) {
        System.out.println(mySqrt(25));
    }
}
