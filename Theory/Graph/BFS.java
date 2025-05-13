public static void bfs(ArrayList<ArrayList<Integer>> adjList, int start){
        int[] visited = new int[adjList.size()];
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(start);
        visited[start] = 1;
        while (!queue.isEmpty()){
            int current = queue.poll();
            System.out.print(current + " ");
            for (int neighbor : adjList.get(current)){
                if (visited[neighbor] == 0){
                    queue.add(neighbor);
                    visited[neighbor] = 1;
                }
            }
        }
    }
