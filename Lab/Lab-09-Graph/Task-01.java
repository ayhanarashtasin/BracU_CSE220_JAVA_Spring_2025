import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[][] edges = {
            {1, 3}, {1, 5}, {1, 7}, {2, 4}, {2, 6}, {3, 5}, {7, 2},
            {6, 5}, {6, 3}, {6, 1}, {12, 2}, {12, 4}, {12, 9}, {12, 8},
            {11, 7}, {10, 8}, {9, 11}, {1, 10}, {4, 5}, {7, 6}, {11, 10}
        };
        int Vertices = 12;
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= Vertices; i++) { 
            adjList.add(new ArrayList<Integer>());
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }
        System.out.println(findVertexDegree(adjList, Vertices));
    }
    public static int findVertexDegree(ArrayList<ArrayList<Integer>> adjList, int Vertices){
        int degrees[] = new int[Vertices+1];
        for (int i = 1; i <= Vertices; i++) {
            degrees[i] = adjList.get(i).size();
        }
        int Maxdegree = 0;
        int MaxdegreeVertex = 0;
        for (int i = 1; i <= Vertices; i++){
            if (degrees[i] > Maxdegree){
                Maxdegree = degrees[i];
                MaxdegreeVertex = i;
            }
        }
        return Maxdegree;
    }
}

//Matrix

public class Main {
    public static void main(String[] args) {
        int[][] edges = {
            {1, 3}, {1, 5}, {1, 7}, {2, 4}, {2, 6}, {3, 5}, {7, 2},
            {6, 5}, {6, 3}, {6, 1}, {12, 2}, {12, 4}, {12, 9}, {12, 8},
            {11, 7}, {10, 8}, {9, 11}, {1, 10}, {4, 5}, {7, 6}, {11, 10}
        };
        int Vertices = 12;
        int[][] adjMatrix = new int[Vertices + 1][Vertices + 1];

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adjMatrix[u][v] = 1;
            adjMatrix[v][u] = 1;
        }
        System.out.println(findVertexDegree(adjMatrix, Vertices));
    }

    public static int findVertexDegree(int[][] adjMatrix, int Vertices) {
        int[] degrees = new int[Vertices + 1];

        for (int i = 1; i <= Vertices; i++) {
            for (int j = 1; j <= Vertices; j++) {
                degrees[i] += adjMatrix[i][j];
            }
        }
        int maxdegree = 0;
        int Vertex = 0;
        for (int i = 1; i <= Vertices; i++) {
            if (degrees[i] > maxdegree) {
                maxdegree = degrees[i];
                Vertex = i;
            }
        }

        return maxdegree;
    }
}
