
import java.util.*;

public class SimpleGraphConnectivity_lechoncito {

    private Map<Character, List<Character>> graph_lechoncito = new HashMap<>();

    public void addEdge_lechoncito(char u, char v) {
        graph_lechoncito.computeIfAbsent(u, k_lechoncito -> new ArrayList<>()).add(v);
        graph_lechoncito.computeIfAbsent(v, k_lechoncito -> new ArrayList<>()).add(u);
    }

    public boolean isConnected_lechoncito() {
        if (graph_lechoncito.isEmpty()) return true;

        Set<Character> visited_lechoncito = new HashSet<>();
        dfs_lechoncito(graph_lechoncito.keySet().iterator().next(), visited_lechoncito);

        return visited_lechoncito.size() == graph_lechoncito.size();
    }

    public int countConnectedComponents_lechoncito() {
        Set<Character> visited_lechoncito = new HashSet<>();
        int components_lechoncito = 0;

        for (char node : graph_lechoncito.keySet()) {
            if (!visited_lechoncito.contains(node)) {
                dfs_lechoncito(node, visited_lechoncito);
                components_lechoncito++;
            }
        }

        return components_lechoncito;
    }

    private void dfs_lechoncito(char node, Set<Character> visited_lechoncito) {
        visited_lechoncito.add(node);
        for (char neighbor : graph_lechoncito.getOrDefault(node, new ArrayList<>())) {
            if (!visited_lechoncito.contains(neighbor)) {
                dfs_lechoncito(neighbor, visited_lechoncito);
            }
        }
    }

    public static void main(String[] args_lechoncito) {
        SimpleGraphConnectivity_lechoncito graph_lechoncito = new SimpleGraphConnectivity_lechoncito();
        Scanner scanner_lechoncito = new Scanner(System.in);

        System.out.println("Enter edges of the graph (e.g., ab, bc, cd). Type 'done' when finished:");

        while (true) {
            String input_lechoncito = scanner_lechoncito.nextLine();
            if (input_lechoncito.equalsIgnoreCase("done")) {
                break;
            }
            if (input_lechoncito.length() == 2) {
                char u = input_lechoncito.charAt(0);
                char v = input_lechoncito.charAt(1);
                graph_lechoncito.addEdge_lechoncito(u, v);
            } else {
                System.out.println("Invalid input. Please enter an edge with exactly 2 characters.");
            }
        }

        scanner_lechoncito.close();

        if (graph_lechoncito.isConnected_lechoncito()) {
            System.out.println("The graph is connected.");
        } else {
            System.out.println("The graph is not connected. It has " + graph_lechoncito.countConnectedComponents_lechoncito() + " connected components.");
        }
    }
}
