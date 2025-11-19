import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class HashMapOperations {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // ---------------- Insertion ----------------
        // Time: average O(1), worst O(n)
        System.out.println("Inserting key-value pairs:");
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.put(4, "Date");
        // HashMap allows null key/value:
        map.put(null, "NullKeyExample");
        map.put(5, null);

        // Display the HashMap
        // Time: O(n) to format/iterate for printing
        System.out.println("HashMap: " + map);

        // ---------------- Search ----------------
        // containsKey: average O(1), worst O(n)
        // get:         average O(1), worst O(n)
        System.out.println("\nSearching for key 2:");
        if (map.containsKey(2)) {
            System.out.println("Found key 2 with value: " + map.get(2));
        } else {
            System.out.println("Key 2 not found.");
        }

        // ---------------- Update ----------------
        // put (replace): average O(1), worst O(n)
        System.out.println("\nUpdating key 3 to 'Coconut':");
        map.put(3, "Coconut"); // put replaces existing value
        // or use replace if you only want to change when key exists:
        // map.replace(3, "Coconut");
        System.out.println("Updated HashMap: " + map);

        // ---------------- Deletion ----------------
        // remove: average O(1), worst O(n)
        System.out.println("\nDeleting key 4:");
        map.remove(4);
        System.out.println("HashMap after deletion: " + map);

        // ---------------- Traversal (entrySet) ----------------
        // entrySet iteration: O(n)
        System.out.println("\nTraversing the HashMap (entrySet):");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // ---------------- Traversal (keySet) ----------------
        // keySet iteration + get: O(n) but each get is O(1) avg, overall O(n)
        System.out.println("\nTraversing the HashMap (keySet):");
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        // ---------------- Traversal (values) ----------------
        // values(): O(n)
        System.out.println("\nTraversing values only:");
        for (String value : map.values()) {
            System.out.println("Value: " + value);
        }

        // ---------------- Traversal (Iterator on entrySet) ----------------
        // iterator over entrySet: O(n)
        System.out.println("\nTraversing using Iterator:");
        Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, String> e = it.next();
            System.out.println("Key: " + e.getKey() + ", Value: " + e.getValue());
        }

        // ---------------- Java 8 forEach lambda ----------------
        // forEach: O(n)
        System.out.println("\nTraversing using forEach (Java 8+):");
        map.forEach((k, v) -> System.out.println("Key: " + k + ", Value: " + v));

        // ---------------- Check if key exists ----------------
        // containsKey: average O(1), worst O(n)
        System.out.println("\nCheck if key 1 exists:");
        if (map.containsKey(1)) {
            System.out.println("Key 1 exists.");
        } else {
            System.out.println("Key 1 does not exist.");
        }

        // ---------------- Check if value exists ----------------
        // containsValue: O(n) (must scan values)
        System.out.println("\nCheck if value 'Banana' exists:");
        if (map.containsValue("Banana")) {
            System.out.println("Value 'Banana' exists.");
        } else {
            System.out.println("Value 'Banana' does not exist.");
        }

        // ---------------- Size ----------------
        // size(): O(1)
        System.out.println("\nSize of HashMap: " + map.size());
    }
}
