import java.util.LinkedList;

public class AdjacencyList {
    int v;
    LinkedList<Integer> adjListArray[];

    // constructor
    public AdjacencyList(int V) {
        this.v = V;

        // define the size of array as
        // number of vertices
        adjListArray = new LinkedList[v];

        for (int i = 0; i < v; i++) {
            adjListArray[i] = new LinkedList<>();
        }
    }

    // Adds an edge to an undirected graph
    public void addEdge(int src, int dest) {
        // Add an edge from src to dest.
        adjListArray[src].add(dest);
        // Since graph is undirected, add an edge from dest
        // to src also
    }

    // A utility function to print the adjacency list
    // representation of graph
    public String convert(int i) {
        String[] alphabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I"};
        return alphabet[i];
    }

    public void printGraph() {
        for (int i = 0; i < v; i++) {
            if (adjListArray[i].size() > 0) {
                System.out.print("Vertex " + convert(i) + " is connected to: ");
                for (int j = 0; j < adjListArray[i].size(); j++) {
                    System.out.print(convert(adjListArray[i].get(j)) + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        AdjacencyList myList = new AdjacencyList(10);

        myList.addEdge(0, 1);
        myList.addEdge(0, 3);
        myList.addEdge(0, 4);

        myList.addEdge(3, 6);

        myList.addEdge(6, 7);

        myList.addEdge(7, 8);

        myList.addEdge(8, 5);

        myList.addEdge(5, 2);

        myList.addEdge(2, 1);

        myList.addEdge(1, 4);

        myList.addEdge(4, 7);
        myList.addEdge(4, 5);

        myList.addEdge(5, 7);

        myList.printGraph();
    }

}