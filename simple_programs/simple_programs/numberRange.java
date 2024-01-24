package simple_programs;

import java.util.Scanner;

public class numberRange {
    public static void main(String[] args) {
	    Scanner s =new Scanner(System.in);
	    int n=s.nextInt();
         //for(int i=0;i<n;i+=2)
	    for(int i=0;i<n;i+=4)
            {
               System.out.print(i+" ");
            }

	}
}
