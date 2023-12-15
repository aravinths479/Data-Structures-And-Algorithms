import java.util.*;

public class StackExample {
    public static void main(String[] args) {
        // Create a stack of integers
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Iterate using enhanced for loop
        System.out.println("Iterating using enhanced for loop:");
        iterateUsingEnhancedFor(stack);

        // Iterate using iterator
        System.out.println("\nIterating using iterator:");
        iterateUsingIterator(stack);

        // Pop an element
        System.out.println("\nPop an element:");
        popElement(stack);

        // Peek at the top element
        System.out.println("\nPeek at the top element:");
        peekAtTopElement(stack);

        // Check if the stack is empty
        System.out.println("\nCheck if the stack is empty:");
        checkIfEmpty(stack);

        // Search for an element
        System.out.println("\nSearch for an element:");
        searchForElement(stack, 20);

        // Get the size of the stack
        System.out.println("\nGet the size of the stack:");
        getSize(stack);

        // Remove an element
        System.out.println("\nRemove an element:");
        removeElement(stack, 30);

        // Clear the stack
        System.out.println("\nClear the stack:");
        clearStack(stack);
    }

    private static void removeElement(Stack<Integer> stack, int i) {
    }

    c void searchForElement(Stack<Integer> stack, int i) {
    }

    private static void checkIfEmpty(Stack<Integer> stack) {
    }

    // Function to iterate over the elements using an enhanced for loop
    private static void iterateUsingEnhancedFor(Stack<Integer> stack) {
        for (Integer element : stack) {
            System.out.println(element);
        }
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
