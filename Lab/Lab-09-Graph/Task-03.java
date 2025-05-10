//Task-01_Undirected
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

//Task-02_Undirected

import java.util.*;
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
        System.out.println(maximumedgeweight(adjList, Vertices));
    }
    public static int maximumedgeweight(ArrayList<ArrayList<int[]>> adjList, int Vertices){
        int maxsum = Integer.MIN_VALUE;
        int maxvertex = -1;
        for (int i = 1; i <= Vertices; i++) {
            int sum = 0;
            for (int[] j : adjList.get(i)) {
                sum += j[1];
            }
            if (sum > maxsum) {
                maxsum = sum;
                maxvertex = i;
            }
        }
        return maxvertex;
    }
}
