// input : 10
// output : 10 9 8 7 6 5 4 3 2 1 

package recursion;

public class Nto1 {
    public static void calc(int n){
        if(n == 0){
            return;
        }
        System.out.print(n+" ");
        calc(n-1);
    }
    public static void main(String args[]){
        int n = 10;
        calc(n);
        
    }
}
