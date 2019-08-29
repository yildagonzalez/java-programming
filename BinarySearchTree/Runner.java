package BinarySearchTree;

public class Runner {

public static void main(String[] args) {
		
		BinaryTree tree = new BinaryTree();

		tree.insert(9);
		tree.insert(7);
		tree.insert(6);
		tree.insert(8);
		tree.insert(11);
		tree.insert(10);
		tree.insert(5);



		tree.display();
		System.out.println("\nTree height: " + tree.getHeight());
		
		
		
	}
}
