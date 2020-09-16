package trees.binaryTree.construction;
import trees.Node;
class construct{
	Node root;
	int ip;
	
	public Node constructTree(int[] in,int[] pre,int start,int end) {
		if(start > end) return null;
		Node node =new Node(pre[ip++]);
		if(start == end) return node;
		int i =0;
		for(i=start;i<=end;i++)
			if(in[i]==node.key)
				break;
		node.left = constructTree(in, pre, start, i-1);
		node.right =constructTree(in, pre, i+1, end);
		return node;	
	}
	
}

public class InorderAndPreorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int inorder[]  = { 4, 2, 1, 7, 5, 8, 3, 6 };
		int preorder[] = { 1, 2, 4, 3, 5, 7, 8, 6 };
		construct c1 = new construct();
	Node root= c1.constructTree(inorder, preorder, 0, inorder.length-1);
	
	System.out.print("Inorder :");root.inOrder(root);
	System.out.println();
	System.out.print("Preorder :");root.preOrder(root);
	
	
	}

}
