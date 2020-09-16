package trees.BinarySearchTree;
import trees.Node;
 public class BinarySearchTree extends Node {
 Node root;
 public void insert(int key) {
	 root= insertUtil(root,key);
 }
	 Node insertUtil(Node root,int key) {
		if(root==null) return new Node(key);
		if(key < root.key)
			root.left = insertUtil(root.left,key);
		if(key > root.key)
			root.right = insertUtil(root.right,key);
		return root;
	}
	Node MinValue(Node root) {
		if(root== null) return root;
		while(root != null&& root.left!= null)
		{root= root.left;			
		}
		return root;
	}
	public void delete(int key) {
		root= deleteUtil(root,key);
	}
	 Node deleteUtil(Node root,int key) {
		if(root==null) {
			System.out.println("Not Fond!");
			 return root;
		}
		if(key < root.key)
			root.left = deleteUtil(root.left,key);
		else if(key > root.key)
			root.right = deleteUtil(root.right,key);
		// if root->key == key
		//if  root have only one child or none
		else if(root.left == null)
		{
			return root.right;
		}
		else if(root.right == null) {
			
			return root.left;
		}
		else {
			Node temp = MinValue(root.right);
			root.key = temp.key;
			root.right = deleteUtil(root.right,temp.key);
			
		}
		return root;	
	}
	 public void inOrder() {
		 inOrder(root);
		 System.out.println();
	 }
	 public void preOrder() {
		 preOrder(root);
		 System.out.println();
	 }
	 public  void postOrder() {
		 postOrder(root);	 System.out.println();
	 }
	 
	 
	
	public BinarySearchTree() {
	 root =null;
	}
//	public BinarySearchTree() {
//		
//	}

}
