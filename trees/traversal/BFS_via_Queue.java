package trees.traversal;

import java.util.LinkedList;
import java.util.Queue;

import trees.traversal.BFS_traversal;
import java.util.*;
//class Node{
//	int key;
//	Node right,left;
//	
//	Node(){
//		
//	}
//	
//	Node(int key){
//		this.key =key;
//				left =right=null;
//	}
//
//	Node(int key,Node left,Node right){
//		this.key = key;
//		this.left =left;
//		this.right=right;
//	}
//}

public class BFS_via_Queue {

	Node root;
	public BFS_via_Queue() {
		root=null;
		
	}
	
	public void BFS() {
	Queue<Node> q= new LinkedList<Node>();
	q.add(root);
	
	while(!q.isEmpty()) {
		Node temp = q.poll();
		System.out.print(temp.key+" ");
		if(temp.left!= null)
			q.add(temp.left);
		if(temp.right!=null)
			q.add(temp.right);
	}
		
	}
//	 public List<List<Integer>> levelOrder(Node root) { // work against only full or perfect binary tree
//	        Queue<Node> queue = new LinkedList<Node>();
//	        List<List<Integer>> wrapList = new LinkedList<List<Integer>>();
//	        
//	        if(root == null) return wrapList;
//	        
//	        queue.offer(root);
//	        while(!queue.isEmpty()){
//	            int levelNum = queue.size();
//	            List<Integer> subList = new LinkedList<Integer>();
//	            for(int i=0; i<levelNum; i++) {
//	                if(queue.peek().left != null) queue.offer(queue.peek().left);
//	                if(queue.peek().right != null) queue.offer(queue.peek().right);
//	                subList.add(queue.poll().key);
//	            }
//	            wrapList.add(subList);
//	        }
//	        return wrapList;
//	    }
	 
	 
	 
//	//based on level order traversal(best one work again all cases)
//	    public void connect(TreeLinkNode root) {
//
//	        TreeLinkNode head = null; //head of the next level
//	        TreeLinkNode prev = null; //the leading node on the next level
//	        TreeLinkNode cur = root;  //current node of current level
//
//	        while (cur != null) {
//	            
//	            while (cur != null) { //iterate on the current level
//	                //left child
//	                if (cur.left != null) {
//	                    if (prev != null) {
//	                        prev.next = cur.left;
//	                    } else {
//	                        head = cur.left;
//	                    }
//	                    prev = cur.left;
//	                }
//	                //right child
//	                if (cur.right != null) {
//	                    if (prev != null) {
//	                        prev.next = cur.right;
//	                    } else {
//	                        head = cur.right;
//	                    }
//	                    prev = cur.right;
//	                }
//	                //move to next node
//	                cur = cur.next;
//	            }
//	            
//	            //move to next level
//	            cur = head;
//	            head = null;
//	            prev = null;
//	        }
//	        
//	    }

}
