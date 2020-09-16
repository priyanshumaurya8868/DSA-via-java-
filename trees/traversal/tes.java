package trees.traversal;

public class tes {
 public static void main(String[] args) {
	 BFS_via_Queue tree = new BFS_via_Queue();
	  tree.root= new Node(1); 
      tree.root.left= new Node(2); 
      tree.root.right= new Node(3); 
      tree.root.left.left= new Node(4); 
      tree.root.left.right= new Node(5);
      tree.BFS();
     // tree.printGivenLevel(tree.root, 3);
 }
}
