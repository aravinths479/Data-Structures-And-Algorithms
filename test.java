import java.util.*;
class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character :");
        char n = sc.next().charAt(0);
        for(int i=0;i<=5;i++){
            for(int j=0;j<=i;j++){
                System.out.print(n+" ");
            }
            System.out.println();
        }
    }
}