//Adjacent_List
public class Main {
    public static void main(String[] args) {
        int[][] edges = {
            {1, 3, 1}, {1, 5, 1}, {1, 7, 1}, {2, 4, 1}, {2, 6, 1},
            {3, 5, 1}, {7, 2, 1}, {6, 5, 1}, {6, 3, 1}, {6, 1, 1},
            {12, 2, 1}, {12, 4, 1}, {12, 9, 1}, {12, 8, 1}, {11, 7, 1},
            {10, 8, 1}, {9, 11, 1}, {1, 10, 1}, {4, 5, 1}, {7, 6, 1},
            {11, 10, 1}
        };
        int Vertices = 12;
        ArrayList<ArrayList<int[]>> adjList = new ArrayList<ArrayList<int[]>>();


        for (int i = 0; i <= Vertices; i++) {
            adjList.add(new ArrayList<int[]>());
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int weight = edge[2];
            adjList.get(u).add(new int[]{v, weight});
        }
        convertDirectedToUndirected(adjList);
    }
    public static void convertDirectedToUndirected(ArrayList<ArrayList<int[]>> adjList){
        for(int i=1;i<adjList.size();i++){
            ArrayList<int[]> temp = adjList.get(i);
            for(int[] edge:temp){
                int u = i;
                int v = edge[0];
                int weight = edge[1];
                adjList.get(v).add(new int[]{u,weight});
            }
        }
    }
}

//Adjacent_Matrix

public class Main {
    public static void main(String[] args) {
        int[][] edges = {
            {1, 3, 1}, {1, 5, 1}, {1, 7, 1}, {2, 4, 1}, {2, 6, 1},
            {3, 5, 1}, {7, 2, 1}, {6, 5, 1}, {6, 3, 1}, {6, 1, 1},
            {12, 2, 1}, {12, 4, 1}, {12, 9, 1}, {12, 8, 1}, {11, 7, 1},
            {10, 8, 1}, {9, 11, 1}, {1, 10, 1}, {4, 5, 1}, {7, 6, 1},
            {11, 10, 1}
        };
        int Vertices = 12;
        int[][] adjMatrix = new int[Vertices + 1][Vertices + 1];
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int weight = edge[2];
            adjMatrix[u][v] = weight;
        }
        convertDirectedToUndirected(adjMatrix);
    }

    public static void convertDirectedToUndirected(int[][] adjMatrix) {
        int n = adjMatrix.length;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (adjMatrix[i][j] != 0) {
                    adjMatrix[j][i] = adjMatrix[i][j];
                }
            }
        }
    }
}
