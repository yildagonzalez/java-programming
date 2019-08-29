package BinarySearchTree;

public class BinaryTree {
	
	// Root of Binary Tree
	Node root;
	
	// Constructors
	public BinaryTree(int key) {
		
		root = new Node(key);
	}
	
	public BinaryTree() {
		
		root = null;
	} // END OF constructors
	
	public void insert(int data) {
		
		Node current;
		Node node = null;
		
		if (root == null) {
			root = new Node(data);
		}
		
		else {
			
			current = root;
			
			while (current != null) {
				
				node = current; // parent node of new node
				if (current.key == data) {
					System.out.println("Cannot add duplicates.");
				}
				// add to left side of tree
				else if (current.key > data) { 
					current = current.left;
				}
				else {
					current = current.right;
				}
			} // end of while
			
			if (node.key > data) {
				
				node.left = new Node(data);
			}
			else {
				
				node.right = new Node(data);
			}
		}
	} // END OF insert
	
	private int getHeight(Node jumper) {
		
		if (jumper == null) {
			return -1;
		}
		else {
			int left = getHeight(jumper.left) + 1;
			int right = getHeight(jumper.right) + 1;
			
			if (left > right) {
				return left;
			}
			else {
				return right;
			}
		}
		
	} // END OF getHeight
	
	public int getHeight() {
		 Node r = root;
		 return getHeight(r);
	}
	
	
	
	public void display(Node j) {
		
		if (j != null) {
			display(j.left);
			System.out.print(j.key + " ");
			display(j.right);
		}
	}
	
	public void display( ) {
		
		Node jumper = root;
		display(jumper);
		
	}
	
	
	
	
	
}
