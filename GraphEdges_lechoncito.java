import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GraphEdges_lechoncito {
    public static void main(String[] args_lechoncito) {
        Scanner scanner_lechoncito = new Scanner(System.in);

        System.out.print("Enter the number of vertices: ");
        int vertices_lechoncito = scanner_lechoncito.nextInt();

     
        int[][] adjacencyMatrix_lechoncito = new int[vertices_lechoncito][vertices_lechoncito];
        System.out.println("Enter the adjacency matrix:");
        for (int i_lechoncito = 0; i_lechoncito < vertices_lechoncito; i_lechoncito++) {
            for (int j_lechoncito = 0; j_lechoncito < vertices_lechoncito; j_lechoncito++) {
                adjacencyMatrix_lechoncito[i_lechoncito][j_lechoncito] = scanner_lechoncito.nextInt();
            }
        }

        Map<String, Integer> edgeCountMap_lechoncito = new HashMap<>();

        for (int i_lechoncito = 0; i_lechoncito < vertices_lechoncito; i_lechoncito++) {
            for (int j_lechoncito = 0; j_lechoncito < vertices_lechoncito; j_lechoncito++) {
                if (adjacencyMatrix_lechoncito[i_lechoncito][j_lechoncito] > 0) { 
                    String edge_lechoncito = i_lechoncito + " - " + j_lechoncito;
                    edgeCountMap_lechoncito.put(edge_lechoncito, edgeCountMap_lechoncito.getOrDefault(edge_lechoncito, 0) + adjacencyMatrix_lechoncito[i_lechoncito][j_lechoncito]);
                }
            }
        }

        System.out.println("Edges and their counts:");
        for (Map.Entry<String, Integer> entry_lechoncito : edgeCountMap_lechoncito.entrySet()) {
            System.out.println("Edge " + entry_lechoncito.getKey() + " appears " + entry_lechoncito.getValue() + " times.");
        }

        scanner_lechoncito.close();
    }
}