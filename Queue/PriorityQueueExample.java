import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Creating a priority queue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Enqueue (add elements with priorities)
        priorityQueue.add(30);
        priorityQueue.add(10);
        priorityQueue.add(20);

        // Dequeue (remove and process elements based on priorities)
        while (!priorityQueue.isEmpty()) {
            int element = priorityQueue.poll();
            System.out.println("Processing: " + element);
        }
    }
}
