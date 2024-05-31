import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VertexDegree_lechoncito {
    public static void main(String[] args_lechoncito) {
        Scanner scanner_lechoncito = new Scanner(System.in);
        System.out.println("Enter the number of edges:");
        int numEdges_lechoncito = scanner_lechoncito.nextInt();
        scanner_lechoncito.nextLine(); 

        Map<Integer, Integer> vertexDegree_lechoncito = new HashMap<>();

        System.out.println("Enter the edges (one pair per line):");
        for (int i_lechoncito = 0; i_lechoncito < numEdges_lechoncito; i_lechoncito++) {
            String[] edge_lechoncito = scanner_lechoncito.nextLine().split(" ");
            int vertex1_lechoncito = Integer.parseInt(edge_lechoncito[0]);
            int vertex2_lechoncito = Integer.parseInt(edge_lechoncito[1]);

            vertexDegree_lechoncito.put(vertex1_lechoncito, vertexDegree_lechoncito.getOrDefault(vertex1_lechoncito, 0) + 1);
            vertexDegree_lechoncito.put(vertex2_lechoncito, vertexDegree_lechoncito.getOrDefault(vertex2_lechoncito, 0) + 1);
        }

        System.out.println("Degree of each vertex:");
        for (Map.Entry<Integer, Integer> entry_lechoncito : vertexDegree_lechoncito.entrySet()) {
            System.out.println("Vertex " + entry_lechoncito.getKey() + ": Degree " + entry_lechoncito.getValue());
        }

        scanner_lechoncito.close();
    }
}
