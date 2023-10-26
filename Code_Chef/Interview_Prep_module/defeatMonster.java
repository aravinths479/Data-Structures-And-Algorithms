// https://www.codechef.com/practice/DSAPREP_01/problems/MONSTER1?tab=statement


// In this question we need to focus on two things x and y.

// Every time x energy lose and y energy gain by monster.

// If y which is gain energy is greater than x which lose energy then we do not defeat monster.

// In the opposite condition we can win against monster.

// So , if x > y then print 1 otherwise print 0.

package Code_Chef.Interview_Prep_module;

import java.util.Scanner;

public class defeatMonster {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i=0;i<t;i++){
		    long h = sc.nextLong();
		    long x = sc.nextLong();
		    long y = sc.nextLong();
		    if(x>y){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
		}
	}
}
