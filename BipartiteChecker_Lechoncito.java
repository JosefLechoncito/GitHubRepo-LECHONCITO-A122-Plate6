import java.util.*;

public class BipartiteChecker_Lechoncito {
    
    public static boolean isBipartite(int[][] edges_Lechoncito, int numVertices_Lechoncito) {
        
        List<List<Integer>> adjacencyList_Lechoncito = new ArrayList<>();
        for (int i_Lechoncito = 0; i_Lechoncito < numVertices_Lechoncito; i_Lechoncito++) {
            adjacencyList_Lechoncito.add(new ArrayList<>());
        }
        for (int[] edge_Lechoncito : edges_Lechoncito) {
            adjacencyList_Lechoncito.get(edge_Lechoncito[0]).add(edge_Lechoncito[1]);
            adjacencyList_Lechoncito.get(edge_Lechoncito[1]).add(edge_Lechoncito[0]);
        }


        int[] colors_Lechoncito = new int[numVertices_Lechoncito];
        Arrays.fill(colors_Lechoncito, -1);

        
        Queue<Integer> queue_Lechoncito = new LinkedList<>();

      
        for (int i_Lechoncito = 0; i_Lechoncito < numVertices_Lechoncito; i_Lechoncito++) {
            if (colors_Lechoncito[i_Lechoncito] == -1) { 
                queue_Lechoncito.offer(i_Lechoncito);
                colors_Lechoncito[i_Lechoncito] = 0; 

                while (!queue_Lechoncito.isEmpty()) {
                    int node_Lechoncito = queue_Lechoncito.poll();
                    for (int neighbor_Lechoncito : adjacencyList_Lechoncito.get(node_Lechoncito)) {
                        if (colors_Lechoncito[neighbor_Lechoncito] == -1) { 
                            colors_Lechoncito[neighbor_Lechoncito] = 1 - colors_Lechoncito[node_Lechoncito];
                            queue_Lechoncito.offer(neighbor_Lechoncito);
                        } else if (colors_Lechoncito[neighbor_Lechoncito] == colors_Lechoncito[node_Lechoncito]) { 
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args_Lechoncito) {
        Scanner scanner_Lechoncito = new Scanner(System.in);

       
        System.out.print("Enter the number of vertices: ");
        int numVertices_Lechoncito = scanner_Lechoncito.nextInt();

        
        System.out.print("Enter the number of edges: ");
        int numEdges_Lechoncito = scanner_Lechoncito.nextInt();

        
        int[][] edges_Lechoncito = new int[numEdges_Lechoncito][2];
        System.out.println("Enter the edges (each as two space-separated integers):");
        for (int i_Lechoncito = 0; i_Lechoncito < numEdges_Lechoncito; i_Lechoncito++) {
            edges_Lechoncito[i_Lechoncito][0] = scanner_Lechoncito.nextInt();
            edges_Lechoncito[i_Lechoncito][1] = scanner_Lechoncito.nextInt();
        }

       
        boolean result_Lechoncito = isBipartite(edges_Lechoncito, numVertices_Lechoncito);
        System.out.println("Is the graph bipartite? " + result_Lechoncito);
    }
}

