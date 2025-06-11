,package javaprojects;
import java.util.*;

/*public class AdvancedGraph {
	public static class graph{
		private Map<Integer,List<Integer>>adjlist=new HashMap<Integer,List<Integer>>();
		void addEdge(int u,int v) {
			adjlist.computeIfAbsent(u,k -> new ArrayList<>()).add(v);
			adjlist.computeIfAbsent(v,k -> new ArrayList<>()).add(u);	
		}
		void printGraph() {
			for(int node:adjlist.keySet()) {
				System.out.println("node"+node+"is connected");
			
				for(int neighbour:adjlist.get(node)) {
					System.out.println(neighbour+" ");
				}
				System.out.println(" ");
				
			}
		
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		graph g=new graph();
		g.addEdge(1,2);
		g.addEdge(3,7);
		g.addEdge(5,3);
		g.addEdge(2,8);
		g.addEdge(4,9);
		g.printGraph();

	}

}*/

public class AdvancedGraph {
    public static class Graph {  // Capitalized class name for Java conventions
        private Map<Integer, List<Integer>> adjlist = new HashMap<>();

        void addEdge(int u, int v) {
            adjlist.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
            adjlist.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
        }

        void printGraph() {
            for (int node : adjlist.keySet()) {
                System.out.println("Node " + node + " is connected to:");

                // Ensuring node is used in the correct scope
                for (int neighbour : adjlist.get(node)) {
                    System.out.println(neighbour + " ");
                }
                System.out.println(); // For better formatting
            }
        }
    }

    public static void main(String[] args) {
        Graph g = new Graph(); // Use the updated class name
        g.addEdge(1, 2);
        g.addEdge(3, 7);
        g.addEdge(5, 3);
        g.addEdge(2, 8);
        g.addEdge(4, 9);
        g.printGraph();
    }
}
