import java.util.LinkedList;
import java.util.Queue;

public class QueueOperations {
    public static void main(String[] args) {
        // Create a Queue using LinkedList (Queue is an interface, so we use LinkedList implementation)
        Queue<Integer> queue = new LinkedList<>();

        // ---------------- Enqueue Operation ----------------
        System.out.println("Enqueuing elements into the queue:");
        queue.add(10);  // or queue.offer(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        System.out.println("Queue after enqueuing: " + queue);

        // ---------------- Dequeue Operation ----------------
        System.out.println("\nDequeuing front element:");
        int dequeuedElement = queue.poll();  // Retrieves and removes the head of the queue
        System.out.println("Dequeued element: " + dequeuedElement);
        System.out.println("Queue after dequeuing: " + queue);

        // ---------------- Peek Operation ----------------
        System.out.println("\nPeeking front element:");
        int frontElement = queue.peek();  // Retrieves but does not remove the head of the queue
        System.out.println("Front element: " + frontElement);

        // ---------------- Check if Queue is Empty ----------------
        System.out.println("\nIs queue empty? " + queue.isEmpty());

        // ---------------- Size of Queue ----------------
        System.out.println("\nSize of queue: " + queue.size());

        // ---------------- Traversal (Display elements) ----------------
        System.out.println("\nTraversing queue elements:");
        for (int element : queue) {
            System.out.println(element);
        }
    }
}
