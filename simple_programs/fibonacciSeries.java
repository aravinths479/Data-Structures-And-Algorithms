package simple_programs;
import java.util.*;
public class fibonacciSeries {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        if(n<=1){
            System.out.println("0 1");
        }
        else{
            System.out.print("0 1 ");
            int first = 0;
            int second = 1;
            for(int i=2;i<n;i++){
                int next = first+second;
                System.out.print(next+" ");
                first = second;
                second = next;
            }
        }
    }
}
