// An Armstrong number (also known as a narcissistic number, pluperfect digital invariant, or pluperfect digital number) 
// is a number that is equal to the sum of its own digits each raised to the power of the number of digits. 
// In other words, if you take an n-digit number, sum up each digit raised to the nth power, and 
// if the result is the original number itself, then that number is an Armstrong number.

// For example, let's take the number 153:
// 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153

package simple_programs;

public class armstrong {
    
    public static boolean isArmstrong(int num){
            int len = (""+num).length();
            int originalNum = num;
            int sum = 0;
            while(num>0){
                int rem = num%10;
                sum = sum + (int)Math.pow(rem , len);
                num = num/10;
            }
            
            if(sum == originalNum){
                return true;
            }
            return false;
        
        }
    public static void main(String[] args) {
        
        int num = 154;
        System.out.println(isArmstrong(num));
    }
}
