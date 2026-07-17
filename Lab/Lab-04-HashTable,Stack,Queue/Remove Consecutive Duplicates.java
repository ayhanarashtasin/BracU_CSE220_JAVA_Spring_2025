public class RemoveConsecutiveDuplicates{
	
    // You have to write this method
    // YOU MUST SUBMIT THIS METHOD
    public static String removeConsecDups(String word) {
    LinkedListQueue queue = new LinkedListQueue();


    for (int i = 0; i < word.length(); i++) {
        queue.enqueue(word.charAt(i));
    }

    String result = "";

    while (!queue.isEmpty()) {
        char current = (char) queue.dequeue();
        result += current;

        while (!queue.isEmpty() && (char) queue.peek() == current) {
            queue.dequeue();
        }
    }

    return result;
}
