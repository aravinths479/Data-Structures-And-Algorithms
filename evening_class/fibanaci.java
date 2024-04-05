package evening_class;
import java.util.Scanner;
public class fibanaci {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int first=0;
        int second=1;
        System.out.print("0 1 ");
        for(int i=2;i<=n;i++){
            int next=first+second;
            System.out.print(next+ " ");
            first=second;
            second=next;
        }
    }
    
}
