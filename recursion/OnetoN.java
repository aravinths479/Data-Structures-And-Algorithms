// input : 10
// output : 1 2 3 4 5 6 7 8 9 10

package recursion;

public class OnetoN {
    private static int count = 1;
    public static void calc(int n){
        if(n==0){
            return;
        }
        System.out.print(count+" ");
        count++;

        calc(n-1);
    }
    public static void main(String args[]){
        int n = 10;
        calc(n);
    }
}
