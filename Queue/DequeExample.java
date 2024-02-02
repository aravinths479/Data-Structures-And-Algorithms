import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
    public static void main(String[] args) {
        // Creating a deque using ArrayDeque
        Deque<String> deque = new ArrayDeque<>();

        deque.offer("1st element");

        // Adding elements to the front
        deque.addFirst("Element 1");
        deque.addFirst("Element 2");

        // Adding elements to the rear
        deque.addLast("Element 3");
        deque.addLast("Element 4");

        deque.offer("last element");

        // Removing and processing elements from the front
        while (!deque.isEmpty()) {
            String frontElement = deque.pollFirst();
            System.out.println( frontElement);
        }

        // Adding elements again
        deque.addLast("Element 5");
        deque.addLast("Element 6");

        // Removing and processing elements from the rear
        while (!deque.isEmpty()) {
            String rearElement = deque.pollLast();
            System.out.println(rearElement);
        }
    }
}
