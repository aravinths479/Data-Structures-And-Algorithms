import java.util.*;
public class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = sc.nextLine();
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.length());
        System.out.println(str.substring(0, str.length()-2));
        System.out.println(str.charAt(0));
        System.out.println(str.trim());
    }
}