// https://www.codechef.com/practice/DSAPREP_01/problems/KNGATK

package Code_Chef.Interview_Prep_module;

import java.util.Arrays;
import java.util.Scanner;

public class attackOnKingdom {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++){
		    int n = sc.nextInt();
		    int arr[] = new int[n];
            for(int j=0;j<n;j++){
                arr[j] = sc.nextInt();
            }
            Arrays.sort(arr);
		    System.out.println(arr[1]);
		}
	}
}
