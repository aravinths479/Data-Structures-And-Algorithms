import java.util.Scanner;

/**
 * new
 */
public class new1 {

    public static boolean isPrime(int number){
        for(int i=2;i<number;i++){
            if(number%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean result = isPrime(number);
        System.out.println(result);
    }
}