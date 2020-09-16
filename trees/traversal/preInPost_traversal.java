package trees.traversal;
import java.util.*;
public class preInPost_traversal {

	public class TreeNode {
		      public int val;
		      public TreeNode left;
		      public TreeNode right;
		   public   TreeNode() {}
		      public TreeNode(int val) { this.val = val; }
		  public    TreeNode(int val, TreeNode left, TreeNode right) {
		          this.val = val;
		          this.left = left;
		          this.right = right;
		      }
		 }
	class Solution {
	   
	    public List<Integer> preorderTraversal(TreeNode root) {
	        
	      List<Integer> result = new ArrayList<Integer>();
	        if(root == null) return result;
	       result.add(root.val);
	    result.addAll(preorderTraversal(root.left));
	        result.addAll(preorderTraversal(root.right));
	        
	        return result;
	    }
	    public List<Integer> inorderTraversal(TreeNode root) {
	        List<Integer> result = new ArrayList<>();
	        if(root == null) return result;
	       
	        result.addAll(inorderTraversal(root.left));
	           result.add(root.val);
	        result.addAll(inorderTraversal(root.right));
	        return result;
	    }
	    public List<Integer> postorderTraversal(TreeNode root) {
	        List<Integer> result = new ArrayList<>();
	        if(root ==null) return result;
	        result.addAll(postorderTraversal(root.left));
	          result.addAll(postorderTraversal(root.right));
	          result.add(root.val);
	        return result;
	    }
	}

}
