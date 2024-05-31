import java.util.*;

public class GraphCycleDetector_lechoncito {

    private final Map<Character, List<Character>> adjacencyList_lechoncito;

    public GraphCycleDetector_lechoncito() {
        this.adjacencyList_lechoncito = new HashMap<>();
    }

    public void addEdge_lechoncito(char src, char dest) {
        adjacencyList_lechoncito.computeIfAbsent(src, k_lechoncito -> new ArrayList<>()).add(dest);
        adjacencyList_lechoncito.putIfAbsent(dest, new ArrayList<>());
    }

    public boolean hasCycle_lechoncito() {
        Set<Character> visited_lechoncito = new HashSet<>();
        Set<Character> recStack_lechoncito = new HashSet<>();

        for (Character node : adjacencyList_lechoncito.keySet()) {
            if (detectCycle_lechoncito(node, visited_lechoncito, recStack_lechoncito)) {
                return true;
            }
        }
        return false;
    }

    private boolean detectCycle_lechoncito(Character node, Set<Character> visited_lechoncito, Set<Character> recStack_lechoncito) {
        if (recStack_lechoncito.contains(node)) {
            return true;
        }

        if (visited_lechoncito.contains(node)) {
            return false;
        }

        visited_lechoncito.add(node);
        recStack_lechoncito.add(node);

        for (Character neighbor : adjacencyList_lechoncito.get(node)) {
            if (detectCycle_lechoncito(neighbor, visited_lechoncito, recStack_lechoncito)) {
                return true;
            }
        }

        recStack_lechoncito.remove(node);
        return false;
    }

    public static void main(String[] args_lechoncito) {
        Scanner scanner_lechoncito = new Scanner(System.in);
        GraphCycleDetector_lechoncito graph_lechoncito = new GraphCycleDetector_lechoncito();

        System.out.println("Enter edges in the format <src><dest> (e.g., ab, bc, ca). Enter 'done' to finish:");

        while (true) {
            String line_lechoncito = scanner_lechoncito.nextLine();
            if (line_lechoncito.equalsIgnoreCase("done")) {
                break;
            }
            if (line_lechoncito.length() != 2) {
                System.out.println("Invalid input. Please enter in the format <src><dest>.");
                continue;
            }
            char src = line_lechoncito.charAt(0);
            char dest = line_lechoncito.charAt(1);
            graph_lechoncito.addEdge_lechoncito(src, dest);
        }

        if (graph_lechoncito.hasCycle_lechoncito()) {
            System.out.println("Graph contains cycle");
        } else {
            System.out.println("Graph does not contain cycle");
        }

        scanner_lechoncito.close();
    }
}

