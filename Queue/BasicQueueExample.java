import java.util.LinkedList;
import java.util.Queue;

public class BasicQueueExample {
    public static void main(String[] args) {
        // Creating a basic queue using LinkedList
        Queue<String> queue = new LinkedList<>();

        // Enqueue (add elements to the back)
        queue.add("Element 1");
        queue.add("Element 2");
        queue.add("Element 3");

        // Dequeue (remove and process elements from the front)
        while (!queue.isEmpty()) {
            String element = queue.poll();
            System.out.println("Processing: " + element);
        }
    }
}

