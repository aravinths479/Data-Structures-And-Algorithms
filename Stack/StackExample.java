import java.util.*;

public class StackExample {
    public static void main(String[] args) {
        // Create a stack of integers
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

      

        // Iterate using iterator
        System.out.println("\nIterating using iterator:");
        iterateUsingIterator(stack);

        // Pop an element
        System.out.println("\nPop an element:");
        popElement(stack);

        // Peek at the top element
        System.out.println("\nPeek at the top element:");
        peekAtTopElement(stack);

       
        
    }

    

    // Function to iterate over the elements using an iterator
    private static void iterateUsingIterator(Stack<Integer> stack) {
        Iterator<Integer> iterator = stack.iterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            System.out.println(element);
        }
    }

    // Function to pop an element from the stack
    private static void popElement(Stack<Integer> stack) {
        Integer poppedElement = stack.pop();
        System.out.println("Popped Element: " + poppedElement);
    }

    // Function to peek at the top element of the stack
    private static void peekAtTopElement(Stack<Integer> stack) {
        Integer topElement = stack.peek();
        System.out.println("Top Element: " + topElement);
    }
}
