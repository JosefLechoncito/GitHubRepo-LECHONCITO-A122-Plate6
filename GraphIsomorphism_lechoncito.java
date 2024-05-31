import java.util.Scanner;

public class GraphIsomorphism_lechoncito {

    
    public static boolean areIsomorphic_lechoncito(int[][] graph1_lechoncito, int[][] graph2_lechoncito) {
        int n_lechoncito = graph1_lechoncito.length;
        
       
        if (n_lechoncito != graph2_lechoncito.length) {
            return false;
        }

        
        int[] permutation_lechoncito = new int[n_lechoncito];
        for (int i_lechoncito = 0; i_lechoncito < n_lechoncito; i_lechoncito++) {
            permutation_lechoncito[i_lechoncito] = i_lechoncito;
        }

      
        do {
            if (isPermutationIsomorphic_lechoncito(graph1_lechoncito, graph2_lechoncito, permutation_lechoncito)) {
                return true;
            }
        } while (nextPermutation_lechoncito(permutation_lechoncito));

        return false;
    }

    
    private static boolean isPermutationIsomorphic_lechoncito(int[][] graph1_lechoncito, int[][] graph2_lechoncito, int[] permutation_lechoncito) {
        int n_lechoncito = graph1_lechoncito.length;
        for (int i_lechoncito = 0; i_lechoncito < n_lechoncito; i_lechoncito++) {
            for (int j_lechoncito = 0; j_lechoncito < n_lechoncito; j_lechoncito++) {
                if (graph1_lechoncito[i_lechoncito][j_lechoncito] != graph2_lechoncito[permutation_lechoncito[i_lechoncito]][permutation_lechoncito[j_lechoncito]]) {
                    return false;
                }
            }
        }
        return true;
    }

   
    private static boolean nextPermutation_lechoncito(int[] array_lechoncito) {
        int n_lechoncito = array_lechoncito.length;
        int i_lechoncito = n_lechoncito - 2;
        while (i_lechoncito >= 0 && array_lechoncito[i_lechoncito] >= array_lechoncito[i_lechoncito + 1]) {
            i_lechoncito--;
        }
        if (i_lechoncito < 0) {
            return false;
        }
        int j_lechoncito = n_lechoncito - 1;
        while (array_lechoncito[j_lechoncito] <= array_lechoncito[i_lechoncito]) {
            j_lechoncito--;
        }
        swap_lechoncito(array_lechoncito, i_lechoncito, j_lechoncito);
        reverse_lechoncito(array_lechoncito, i_lechoncito + 1, n_lechoncito - 1);
        return true;
    }

    private static void swap_lechoncito(int[] array_lechoncito, int i_lechoncito, int j_lechoncito) {
        int temp_lechoncito = array_lechoncito[i_lechoncito];
        array_lechoncito[i_lechoncito] = array_lechoncito[j_lechoncito];
        array_lechoncito[j_lechoncito] = temp_lechoncito;
    }

    private static void reverse_lechoncito(int[] array_lechoncito, int start_lechoncito, int end_lechoncito) {
        while (start_lechoncito < end_lechoncito) {
            swap_lechoncito(array_lechoncito, start_lechoncito, end_lechoncito);
            start_lechoncito++;
            end_lechoncito--;
        }
    }

    public static void main(String[] args) {
        Scanner scanner_lechoncito = new Scanner(System.in);

        System.out.println("Enter the number of vertices in the graphs:");
        int n_lechoncito = scanner_lechoncito.nextInt();
        
        
        int[][] graph1_lechoncito = new int[n_lechoncito][n_lechoncito];
        int[][] graph2_lechoncito = new int[n_lechoncito][n_lechoncito];
        
        System.out.println("Enter the adjacency matrix for graph 1 (row-wise):");
        for (int i_lechoncito = 0; i_lechoncito < n_lechoncito; i_lechoncito++) {
            for (int j_lechoncito = 0; j_lechoncito < n_lechoncito; j_lechoncito++) {
                graph1_lechoncito[i_lechoncito][j_lechoncito] = scanner_lechoncito.nextInt();
            }
        }
        
        System.out.println("Enter the adjacency matrix for graph 2 (row-wise):");
        for (int i_lechoncito = 0; i_lechoncito < n_lechoncito; i_lechoncito++) {
            for (int j_lechoncito = 0; j_lechoncito < n_lechoncito; j_lechoncito++) {
                graph2_lechoncito[i_lechoncito][j_lechoncito] = scanner_lechoncito.nextInt();
            }
        }

        boolean result_lechoncito = areIsomorphic_lechoncito(graph1_lechoncito, graph2_lechoncito);
        System.out.println("The graphs are isomorphic: " + result_lechoncito);

        scanner_lechoncito.close();
    }
}
