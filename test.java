import java.text.DecimalFormat;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the float value
        System.out.print("Enter a float value: ");
        float floatValue = scanner.nextFloat();

        // Close the scanner
        scanner.close();

        // Create a DecimalFormat object to format the output
        DecimalFormat decimalFormat = new DecimalFormat("###");

        // Round the float value to two decimal places
        String roundedValue = decimalFormat.format(floatValue);

        // Output the rounded value
        System.out.println("Value: " + roundedValue); 
    }
}
