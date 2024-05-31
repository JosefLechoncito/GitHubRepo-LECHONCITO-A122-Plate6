import java.util.Scanner;

public class AdjacencyMatrix_lechoncito {
    public static void main(String[] args_lechoncito) {
        Scanner scanner_lechoncito = new Scanner(System.in);
        
        System.out.print("Enter the number of vertices in the graph: ");
        int numVertices_lechoncito = scanner_lechoncito.nextInt();
        
        int[][] adjacencyMatrix_lechoncito = new int[numVertices_lechoncito][numVertices_lechoncito];
        
        System.out.print("Enter the number of edges in the graph: ");
        int numEdges_lechoncito = scanner_lechoncito.nextInt();
        
        System.out.println("Enter the vertex pairs associated with the edges (format: vertex1 vertex2):");
        for (int i_lechoncito = 0; i_lechoncito < numEdges_lechoncito; i_lechoncito++) {
            int vertex1_lechoncito = scanner_lechoncito.nextInt();
            int vertex2_lechoncito = scanner_lechoncito.nextInt();
            

            adjacencyMatrix_lechoncito[vertex1_lechoncito][vertex2_lechoncito] = 1;
            adjacencyMatrix_lechoncito[vertex2_lechoncito][vertex1_lechoncito] = 1;
            
            
        }
        
        System.out.println("Adjacency Matrix:");
        for (int i_lechoncito = 0; i_lechoncito < numVertices_lechoncito; i_lechoncito++) {
            for (int j_lechoncito = 0; j_lechoncito < numVertices_lechoncito; j_lechoncito++) {
                System.out.print(adjacencyMatrix_lechoncito[i_lechoncito][j_lechoncito] + " ");
            }
            System.out.println();
        }
        
        scanner_lechoncito.close();
    }
}


