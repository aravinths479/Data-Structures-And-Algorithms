import java.util.*;
public class test
{
	public static void main(String[] args) {
	    int n=5;

        int arr[][]=new int[n][n];
        int rowLower=0,colLower=0,rowUpper=n-1,colUpper=n-1,count=1;

        while(rowLower<=rowUpper && colLower<=colUpper)
        {
            for(int i=colLower;i<=colUpper;i++)
            {
                arr[rowLower][i] = count;
                count++;
            }
            rowLower++;

            for(int i=rowLower;i<=rowUpper;i++)
            {
                arr[i][colUpper] = count;
                count++;
            }
            colUpper--;

            for(int i=colUpper;i>=colLower;i--)
            {
                arr[rowUpper][i] = count;
                count++;
            }
            rowUpper--;

            for(int i=rowUpper;i>=rowLower;i--)
            {
                arr[i][colLower] = count;
                count++;
            }
            colLower++;

        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
                System.out.print(arr[i][j]+"\t");
            System.err.println();
        }
		
	}
    
}
