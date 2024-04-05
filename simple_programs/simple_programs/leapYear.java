package simple_programs;

public class leapYear {
    public static boolean check(int year) {
        
        return (year % 4 == 0 && year % 400 == 0) || (year % 100 != 0);
    }
    public static void main(String[] args) {
        int year = 2005;
        if (check(year)) {
            System.out.println("It is a leap Year");    
        } else {
            System.out.println("It is not a leap Year");
        }
    }
}
