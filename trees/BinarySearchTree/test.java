package trees.BinarySearchTree;
import trees.*;
public class test {
	
	public static void main(String[] args) {
	
		BinarySearchTree bst = new BinarySearchTree();
	 bst.insert(10);
	 bst.insert(30);
	bst.insert(20);
	bst.insert(40);
	bst.insert(60);
	bst.insert(50);
	
	bst.inOrder();
	
	bst.delete(10);
	bst.delete(40);
	bst.delete(60);
		bst.inOrder();
	}
	
	
			

}
