import java.util.*;

public class GraphTraversal {
    public static void dfs(ArrayList<ArrayList<Integer>> adjList, int start){
        boolean[] visited = new boolean[adjList.size()];
        dfsHelper(adjList, start, visited);
    }
    private static void dfsHelper(ArrayList<ArrayList<Integer>> adjList, int start, boolean[] visited){
        visited[start] = true;
        System.out.println(start);
        for (int neighbor : adjList.get(start)){
            if (!visited[neighbor]){
                dfsHelper(adjList, neighbor, visited);
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        int n = 5;  // Number of vertices
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<Integer>());
        }

        // Sample edges
        adjList.get(0).add(1);
        adjList.get(0).add(2);
        adjList.get(1).add(4);
        adjList.get(1).add(2);
        adjList.get(2).add(3);

        dfs(adjList, 0);  // Expected output: 0 1 2 3
    }
}
