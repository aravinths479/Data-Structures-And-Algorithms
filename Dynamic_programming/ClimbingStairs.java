// You are climbing a staircase. It takes n steps to reach the top.
// Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

//  https://www.youtube.com/watch?v=Y0lT9Fck7qI

// Input: n = 3
// Output: 3
// Explanation: There are three ways to climb to the top.
// 1. 1 step + 1 step + 1 step
// 2. 1 step + 2 steps
// 3. 2 steps + 1 step




// dp[1] = 1
// dp[2] = 2
// dp[3] = dp[2] + dp[1] = 2 + 1 = 3
// dp[4] = dp[3] + dp[2] = 3 + 2 = 5
// dp[5] = dp[4] + dp[3] = 5 + 3 = 8
// So, there are 8 distinct ways to climb 5 steps. These 8 ways are:

// Take 1 step, then 1 step, then 1 step, then 1 step, then 1 step.
// Take 1 step, then 1 step, then 1 step, then 2 steps.
// Take 1 step, then 1 step, then 2 steps, then 1 step.
// Take 1 step, then 2 steps, then 1 step, then 1 step.
// Take 1 step, then 2 steps, then 2 steps.
// Take 2 steps, then 1 step, then 1 step, then 1 step.
// Take 2 steps, then 1 step, then 2 steps.
// Take 2 steps, then 2 steps, then 1 step.
// So, for n = 5, there are 8 distinct ways to climb the stairs.


package Dynamic_programming;

public class ClimbingStairs {
    public static int climbStairs(int n) {
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        int arr[] = new int[n+1];
        arr[1] = 1;
        arr[2] = 2;

        for(int i=3;i<=n;i++){
            arr[i] = arr[i-1] + arr[i-2]; 
        }

        return arr[n];
    }
    public static void main(String args[]){
        System.out.println(climbStairs(5) );
    }
}
