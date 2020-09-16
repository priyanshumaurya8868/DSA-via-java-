package trees.binaryTree.construction;
import trees.*;
class BuildTree{
	public Node buildTree(int[] preorder,int[] postorder,int start,int end,Index preIndex) {
		if(start > end||preIndex.pIndex >= preorder.length) return null;
		Node node = new Node(preorder[preIndex.pIndex++]);
		if(start==end||preIndex.pIndex>=postorder.length-1) return node;
           int i=0;
           for(i=start;i<= end;i++)
        	   if(postorder[i]== node.key)
        		   break;
           node.left = buildTree(preorder, postorder, start,i+1 , preIndex);
           node.right = buildTree(preorder,postorder,i-1,end,preIndex);
           return node;
		
	}
}
public class PostorderAndPreorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int preorder[] = { 1, 2, 4, 3, 5, 7, 8, 6 };
			int postorder[] = { 4, 2, 7, 8, 5, 6, 3, 1 };
	  
			BuildTree c1 = new BuildTree();
			Index i = new Index(0);
			Node root = c1.buildTree(preorder, postorder, 0, preorder.length-1, i);
			System.out.print("preorder : ");
			root.preOrder(root);
	}

}
