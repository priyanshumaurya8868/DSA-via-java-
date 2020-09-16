package trees;
public class Node {
	public int key;
	public Node  left,right;
	public  Node(){
		
		
	}
	public Node(int key) {
		this.key =key;
		
	}
	public Node(int key,Node l ,Node r) {
		this.key = key;
		left =l;
		right =r;
	}
	public void preOrder(Node root) {
		if(root==null) return;
		System.out.print(root.key+", ");
		preOrder(root.left);
		preOrder(root.right);
	}
	public void inOrder(Node root) {
		if(root==null) return;
		inOrder(root.left);
		System.out.print(root.key+", ");
		inOrder(root.right);		
	}
	public void postOrder(Node root) {
		if(root==null) return;
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.key+", ");
	}

	public void printInorder(Node node) 
    { 
        if (node == null) 
            return; 
  
        /* first recur on left child */
        printInorder(node.left); 
  
        /* then print the data of node */
        System.out.print(node.key + " "); 
  
        /* now recur on right child */
        printInorder(node.right); 
    } 
}