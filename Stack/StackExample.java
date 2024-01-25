package Stack;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Create a stack of integers
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Print the elements in the stack
        System.out.println("Stack elements:");
        for (Integer element : stack) {
            System.out.println(element);
        }

        // Pop elements from the stack
        System.out.println("\nPopping elements:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        // Create a stack of strings
        Stack<String> stringStack = new Stack<>();

        // Push elements onto the string stack
        stringStack.push("Java");
        stringStack.push("is");
        stringStack.push("fun!");

        // Peek at the top element without removing it
        System.out.println("\nPeek at the top element: " + stringStack.peek());

        // Search for an element in the string stack
        int position = stringStack.search("Java");
        System.out.println("Position of 'Java' in the stack: " + position);

        // Print the elements in the string stack
        System.out.println("\nString Stack elements:");
        for (String element : stringStack) {
            System.out.println(element);
        }
    }
}
