import java.util.Scanner;

public class IncidenceMatrix_lechoncito {

    public static void main(String[] args_lechoncito) {
        Scanner scanner_lechoncito = new Scanner(System.in);

        System.out.print("Enter the number of vertices: ");
        int numVertices_lechoncito = scanner_lechoncito.nextInt();
        System.out.print("Enter the number of edges: ");
        int numEdges_lechoncito = scanner_lechoncito.nextInt();

        int[][] incidenceMatrix_lechoncito = new int[numVertices_lechoncito][numEdges_lechoncito];

        System.out.println("Enter vertex pairs associated with each edge and the number of times each edge appears:");
        for (int edge_lechoncito = 0; edge_lechoncito < numEdges_lechoncito; edge_lechoncito++) {
            System.out.print("Edge " + (edge_lechoncito + 1) + ": ");
            int vertex1_lechoncito = scanner_lechoncito.nextInt();
            int vertex2_lechoncito = scanner_lechoncito.nextInt();
            int count_lechoncito = scanner_lechoncito.nextInt();

            incidenceMatrix_lechoncito[vertex1_lechoncito - 1][edge_lechoncito] = count_lechoncito;
            incidenceMatrix_lechoncito[vertex2_lechoncito - 1][edge_lechoncito] = count_lechoncito;
        }

        System.out.println("Incidence Matrix:");
        for (int i_lechoncito = 0; i_lechoncito < numVertices_lechoncito; i_lechoncito++) {
            for (int j_lechoncito = 0; j_lechoncito < numEdges_lechoncito; j_lechoncito++) {
                System.out.print(incidenceMatrix_lechoncito[i_lechoncito][j_lechoncito] + " ");
            }
            System.out.println();
        }

        scanner_lechoncito.close();
    }
}
