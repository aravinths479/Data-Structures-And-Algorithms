
/*
 
Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

Example 1:

Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]
Example 2:

Input: n = 1
Output: ["()"]
 

 */

 package Stack;
import java.util.*;

public class generateParenthesis {

    // Recursive function to generate combinations of parentheses
    // Parameters:
    // - n: Total number of pairs of parentheses
    // - res: Current combination being constructed
    // - close: Count of closing parentheses in the current combination
    // - open: Count of open parentheses in the current combination
    // - lst: List to store the generated combinations
    
    public static void generate(int n, String res, int close, int open, List<String> lst) {
        // Base case: If the length of the current combination is equal to 2n,
        // add it to the list and return
        if (res.length() == 2 * n) {
            lst.add(res);
            return;
        }
        // Recursive calls:

        // If the count of closing parentheses is less than the count of open parentheses,
        // add a closing parenthesis to the current combination
        if (close < open) {
            generate(n, res + ")", close + 1, open, lst);
        }

        // If the count of open parentheses is less than n,
        // add an open parenthesis to the current combination
        if (open < n) {
            generate(n, res + "(", close, open + 1, lst);
        }
    }

    public static void main(String[] args) {
        // Set the total number of pairs of parentheses
        int n = 3;

        // Initialize counts of open and close parentheses to 0
        int open = 0;
        int close = 0;

        // List to store the generated combinations
        List<String> lst = new ArrayList<>();

        // Call the generate function to start generating combinations
        generate(n, "", close, open, lst);

        // Print the generated combinations
        System.out.println(lst);

    }
}
