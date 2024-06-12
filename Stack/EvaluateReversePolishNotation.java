/*

You are given an array of strings tokens that represents an arithmetic expression in a Reverse Polish Notation.

Evaluate the expression. Return an integer that represents the value of the expression.

Note that:

The valid operators are '+', '-', '*', and '/'.
Each operand may be an integer or another expression.
The division between two integers always truncates toward zero.
There will not be any division by zero.
The input represents a valid arithmetic expression in a reverse polish notation.
The answer and all the intermediate calculations can be represented in a 32-bit integer.
 

Example 1:

Input: tokens = ["2","1","+","3","*"]
Output: 9
Explanation: ((2 + 1) * 3) = 9


Example 2:

Input: tokens = ["4","13","5","/","+"]
Output: 6
Explanation: (4 + (13 / 5)) = 6


Example 3:

Input: tokens = ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]
Output: 22

Explanation: ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
= ((10 * (6 / (12 * -11))) + 17) + 5
= ((10 * (6 / -132)) + 17) + 5
= ((10 * 0) + 17) + 5
= (0 + 17) + 5
= 17 + 5
= 22


 */


package Stack;

import java.util.Stack;

public class EvaluateReversePolishNotation {
    public static int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for (String token : tokens) {
            if (isNumeric(token)) {
                st.push(Integer.parseInt(token));
            } else {
                int operand2 = st.pop();
                int operand1 = st.pop();

                switch (token) {
                    case "+": {
                        st.push(operand1 + operand2);
                        break;
                    }
                    case "-": {
                        st.push(operand1 - operand2);
                        break;
                    }
                    case "*": {
                        st.push(operand1 * operand2);
                        break;
                    }
                    case "/": {
                        st.push(operand1 / operand2);
                        break;
                    }
                    default:
                        throw new IllegalArgumentException("Invalid token: " + token);
                }
            }
        }

        return st.peek();
    }

    public static boolean isNumeric(String token) {
        try {
            Integer.parseInt(token);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static void main(String[] args) {
        //String[] expression = { "10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+" };
        String[] expression = { "5","4","5","*","+","5","/" };
        System.out.println(evalRPN(expression));

    }
}
