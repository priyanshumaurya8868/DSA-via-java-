package trees.binaryTree.construction;
import trees.*;
class Index{
	int pIndex;
	Index(int i){
	pIndex=i;
}
}

class ConstructTree {
	public Node constructTree(int[] inorder,int[] postorder,int start,int end,Index postIndex) {
		if(start>end||postIndex.pIndex<0) return null;
		Node node = new Node(postorder[postIndex.pIndex--]);
		if(start == end) return node;
		int i=0; for(i =start;i<=end;i++)
			if(inorder[i] == node.key)
				break;
		
		node.right = constructTree(inorder, postorder, i+1, end, postIndex);
		node.left = constructTree(inorder, postorder, start, i-1, postIndex);
		return node;
	}
}

public class InorderAndPostorder {
	public static void main(String[] args) {
      int inorder[]   = { 4, 2, 1, 7, 5, 8, 3, 6 };
		int postorder[] = { 4, 2, 7, 8, 5, 6, 3, 1 };
  
		ConstructTree c1 = new ConstructTree();
		Index i = new Index(inorder.length-1);
		Node root = c1.constructTree(inorder, postorder, 0, inorder.length-1, i);
		System.out.print("inorder : ");
		root.inOrder(root);


	}

}
