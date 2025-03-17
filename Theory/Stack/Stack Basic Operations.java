import java.util.Stack;

public class StackOperations {
    public static void main(String[] args) {
        // Create a Stack of integers
        Stack<Integer> stack = new Stack<>();

        // ---------------- Push Operation ----------------
        System.out.println("Pushing elements into the stack:");
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println("Stack after pushing: " + stack);

        // ---------------- Pop Operation ----------------
        System.out.println("\nPopping top element:");
        int poppedElement = stack.pop();  // Removes top element
        System.out.println("Popped element: " + poppedElement);
        System.out.println("Stack after popping: " + stack);

        // ---------------- Peek Operation ----------------
        System.out.println("\nPeeking top element:");
        int topElement = stack.peek();  // Gets top element without removing
        System.out.println("Top element: " + topElement);

        // ---------------- Search Operation ----------------
        System.out.println("\nSearching for element 20:");
        int position = stack.search(20);  // Returns position from top (1-based)
        if (position != -1) {
            System.out.println("Element 20 found at position (from top): " + position);
        } else {
            System.out.println("Element 20 not found.");
        }

        // ---------------- Check if Stack is Empty ----------------
        System.out.println("\nIs stack empty? " + stack.isEmpty());

        // ---------------- Size of Stack ----------------
        System.out.println("\nSize of stack: " + stack.size());

        // ---------------- Traversal (Display elements) ----------------
        System.out.println("\nTraversing stack elements:");
        for (int element : stack) {
            System.out.println(element);
        }
    }
}
