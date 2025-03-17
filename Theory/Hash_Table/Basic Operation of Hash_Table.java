import java.util.Hashtable;
import java.util.Enumeration;

public class HashTableOperations {
    public static void main(String[] args) {
        // Create a Hashtable
        Hashtable<Integer, String> table = new Hashtable<>();

        // ---------------- Insertion ----------------
        System.out.println("Inserting key-value pairs:");
        table.put(1, "Apple");
        table.put(2, "Banana");
        table.put(3, "Cherry");
        table.put(4, "Date");

        // Display the Hashtable
        System.out.println("Hashtable: " + table);

        // ---------------- Search ----------------
        System.out.println("\nSearching for key 2:");
        if (table.containsKey(2)) {
            System.out.println("Found key 2 with value: " + table.get(2));
        } else {
            System.out.println("Key 2 not found.");
        }

        // ---------------- Update ----------------
        System.out.println("\nUpdating key 3 to 'Coconut':");
        table.put(3, "Coconut");
        System.out.println("Updated Hashtable: " + table);

        // ---------------- Deletion ----------------
        System.out.println("\nDeleting key 4:");
        table.remove(4);
        System.out.println("Hashtable after deletion: " + table);

        // ---------------- Traversal ----------------
        System.out.println("\nTraversing the Hashtable:");
        Enumeration<Integer> keys = table.keys();
        while (keys.hasMoreElements()) {
            Integer key = keys.nextElement();
            String value = table.get(key);
            System.out.println("Key: " + key + ", Value: " + value);
        }

        // ---------------- Check if key exists ----------------
        System.out.println("\nCheck if key 1 exists:");
        if (table.containsKey(1)) {
            System.out.println("Key 1 exists.");
        } else {
            System.out.println("Key 1 does not exist.");
        }

        // ---------------- Check if value exists ----------------
        System.out.println("\nCheck if value 'Banana' exists:");
        if (table.containsValue("Banana")) {
            System.out.println("Value 'Banana' exists.");
        } else {
            System.out.println("Value 'Banana' does not exist.");
        }

        // ---------------- Size ----------------
        System.out.println("\nSize of Hashtable: " + table.size());
    }
}
