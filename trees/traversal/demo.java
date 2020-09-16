package trees.traversal;
import java.util.*;
import trees.traversal.preInPost_traversal.TreeNode;
public class demo {
	   private static List<Integer> a= new ArrayList<Integer>();
	    void inorder(TreeNode root){
	       
	         //if(root == null) return result;
	        inorder(root.left);
	           a.add(root.val);
	        inorder(root.right);
	        
	    }
	    public static void main(String[] args) {

	    	
	    }
	
}
