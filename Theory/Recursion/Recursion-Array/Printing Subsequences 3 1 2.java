import java.util.*;

public class PrintSubsequences {

    // Recursive function to print all subsequences
    public static void printSubsequences(int[] arr, int index, List<Integer> current) {
        // Base case: reached the end of array
        if (index == arr.length) {
            // print the current subsequence
            if (current.isEmpty()) {
                System.out.println("{}");  // represent empty subsequence
            } else {
                System.out.println(current);
            }
            return;
        }

        // ---- PICK the current element ----
        current.add(arr[index]);
        printSubsequences(arr, index + 1, current);

        // ---- NOT PICK the current element ----
        current.remove(current.size() - 1); // backtrack
        printSubsequences(arr, index + 1, current);
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2};

        List<Integer> current = new ArrayList<>();
        printSubsequences(arr, 0, current);
    }
}
