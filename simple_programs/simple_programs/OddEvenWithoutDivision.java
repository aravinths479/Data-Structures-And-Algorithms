package simple_programs;

public class OddEvenWithoutDivision {
    public static void main(String[] args) {
        int number = 7; // Change this to any number you want to check

        if ((number & 1) == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }
}
