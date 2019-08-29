package Graph;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import static org.junit.Assert.*;


/* 
  A graph is a data structure for storing connected data like a network
  of people on a social media platform
 
  A graph consists of vertices and edges. A vertex represents the entity
 (for example, people) and an edge represents the relationship between 
 entities (for example, a person's friendships)

  Different types of graphs
 	- Directed Graph
 	- Weighted Graph
 	
 	Graph Representations
 	- adjacency matrix
 	    * (square matrix with dimensions equal to # of vertices in graph)
 		elements of matrix typically have value '0' or '1'. A value of '1' indicates
 		adjacency between the vertices in the row and the column, and a value of '0'
 		otherwise.
 		* Fairly easier to implement and efficient to query, however, it's less
 		 efficient with respect to space occupied
 	- adjacency list
 		* An array of lists. The size of the array is equivalent to the number of 
 		  vertices in the graph.
 		* The list at a specified index of the array represents the adjacent vertices of
 		  the vertex represented by that array index
 		* Comparatively difficult to create and less efficient to query,
 		  however, it offers better space efficiency
 		  
 	* Java doesn't have a default implementation of the graph data structure,
 	  however, we can implement the graph using Java Collections.
 	  
 	* Map - represents a mapping between a key and a value. The Map interface
 	        Map<key, value>
 	        Map<String, Integer> hm = new HashMap<String, Integer>();
 	        hm.put("a", new Integer(100));
 	        
 	* List - represents an ordered sequence of objects. The elements contained
 		     in a Java List can be inserted, accessed, iterated, and removed
 		     according to the order in which they appear internally in the Java List.
 		   - The Java List interface is s standard Java interface, it it is a subtype
 		     of the Java Collection interface, meaning List inherits from Collection
 	
 * */
 

public class Graph {

	// We will represent the Graph using an adjacency list
	
	//Each Vertex(key) is associated with a list of adjacent vertex
	//public Map<Vertex, List<Vertex>> adjVertices = new HashMap<>();

	Map<Vertex, List<Vertex>> adjVertices = new HashMap<>();

	
	void addVertex(String label) {
	    adjVertices.putIfAbsent(new Vertex(label), new ArrayList<>());
	}
	 
	public void removeVertex(String label) {
	    Vertex v = new Vertex(label);
	    adjVertices.values().stream().forEach(e -> e.remove(v));
	    adjVertices.remove(new Vertex(label));
	}
	
	// Method to add an edge
	public void addEdge(String label1, String label2) {
		Vertex v1 = new Vertex(label1);
		Vertex v2 = new Vertex(label2);
		adjVertices.get(v1).add(v2);
		adjVertices.get(v2).add(v1);
	}
	
	
	// Method to remove an edge
	public void removeEdge(String label1, String label2) {
		Vertex v1 = new Vertex(label1);
		Vertex v2 = new Vertex(label2);
		
		List<Vertex> eV1 = adjVertices.get(v1);
		List<Vertex> eV2 = adjVertices.get(v2);
		
		if (eV1 != null) 
			eV1.remove(v2);
		if (eV2 != null)
			eV2.remove(v1);
	
	}
	
	public Graph createGraph() {
		
	Graph graph = new Graph();
		
		graph.addVertex("Bob");
		graph.addVertex("Alice");
	    graph.addVertex("Mark");
	    graph.addVertex("Rob");
	    graph.addVertex("Maria");
	    graph.addEdge("Bob", "Alice");
	    graph.addEdge("Bob", "Rob");
	    graph.addEdge("Alice", "Mark");
	    graph.addEdge("Rob", "Mark");
	    graph.addEdge("Alice", "Maria");
	    graph.addEdge("Rob", "Maria");
	    
	    assertEquals("[Bob, Rob, Maria, Alice, Mark]", depthFirstTraversal(graph, "Bob").toString());


	    return graph;
	}
	
	public List<Vertex> getAdjVertices(String label) {
		return adjVertices.get(new Vertex(label));
	}
	
	public Set<String> depthFirstTraversal(Graph graph, String root) {
		Set<String> visited = new LinkedHashSet<String>();
		Stack<String> stack = new Stack<String> ();
		stack.push(root);
		
		while(!stack.isEmpty()) {
			String vertex = stack.pop();
			if (!visited.contains(vertex)) {
				visited.add(vertex);
				for (Vertex v : graph.getAdjVertices(vertex)) {
					stack.push(v.label);
				}
			}
		}
		return visited;
	}

	
	
	
	public static void main(String[] args) {
		
		Graph graph = new Graph();
		
		// Add vertices
		graph.addVertex("Bob");
		graph.addVertex("Alice");
	    graph.addVertex("Mark");
	    graph.addVertex("Rob");
	    graph.addVertex("Maria");
	    
	    // Add edges
	    graph.addEdge("Bob", "Alice");
	    graph.addEdge("Bob", "Rob");
	    graph.addEdge("Alice", "Mark");
	    graph.addEdge("Rob", "Mark");
	    graph.addEdge("Alice", "Maria");
	    graph.addEdge("Rob", "Maria");
		
	}
	
	
	
	
}
