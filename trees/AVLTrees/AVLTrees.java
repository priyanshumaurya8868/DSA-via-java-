package trees.AVLTrees;


class Node{
	int key,height;
	Node left,right;
	public Node(int key) {
		this.key = key;
		height =1;
	}
}

public class AVLTrees {
	Node root ;
	
	int height(Node y) {
		if(y==null) return 0;
		return y.height;
	}
	int getBalance(Node y) {
		if(y==null) return 0;
		return height(y.left)-height(y.right);
	}
	 public void insert(int key) {
		 root =insertUtil(root, key);
	 }
	Node rightRotate(Node y) {
		Node x = y.left;
		Node t2 = x.right;
		
		x.right =y;
		y.left = t2;
		
		return x;
	}
	Node leftRotate(Node y) {
		Node z= y.right;
		Node t2 =z.left;
		z.left =  y;
		y.right =t2;
		return z;
	}
	 public Node insertUtil(Node root,int key) {
		 // step 1 : bst insertion..
		 if(root== null) return new Node(key);
		 if(key < root.key)
			 root.left = insertUtil(root.left,key);
		 else if(key > root.key)
			 root.right = insertUtil(root.right,key);
		 else 
			 return root; //no place for duplicates
		 // step 2 : update height
		 root.height = Math.max(height(root.left), height(root.right))+1;
		 //step 3 : get balancing
		 int balance = getBalance(root);
		 //left-left case
		 if(balance > 1 && key < root.left.key)
			 return rightRotate(root);
		 // left-right case
		 if(balance > 1 && key > root.left.key)
		 { root.left= leftRotate(root.left);
		  return rightRotate(root);			 
		 }
		 // right right case
		 if(balance < -1 && key > root.right.key)
			 return leftRotate(root);
		 if(balance < -1 && key < root.right.key)
		 {
			 root.right=rightRotate(root.right);
			 return leftRotate(root);
		 }
		 return root;	 
	 }
	int minValue(Node root) {
		 if(root==null) return 0;
       while(root != null && root.left !=null) root =root.left;
       return root.key;
	 }
	 
	 public  void delete(int key) {
		 root= deleteUtil(root, key);
	 }
	  Node deleteUtil(Node root, int key) {
		  if(root == null) return root;
		   
		  if(key < root.key)
			 root.left = deleteUtil(root.left, key);
		  else if(key > root.key)
			root.right = deleteUtil(root.right,key);
		  else {
			 if(root.left ==null || root.right==null)
			 {
				 Node temp=null;
				 if(root.right==null)
					  temp = root.left;
				 else if(root.left==null)
					 temp= root.right;
				
			    root=temp;
			 }
			 else {
				 root.key = minValue(root.right);
				 root.right = deleteUtil(root.right,root.key); 
			 }
			 if(root ==null) return root;
			 
			 root.height = Math.max(height(root.left), height(root.right))+1;
			 int balance = getBalance(root);
			 //ll
			 if(balance > 1 && getBalance(root.left) >= 0)
			 { return rightRotate(root);				 
			 }
			 //lr
			 if(balance > 1 && getBalance(root.left) < 0)
			 {
				  return root.left = leftRotate(root.left);
				 
			 }
			 if(balance < -1 && getBalance(root.right) <= 0)
			     return leftRotate(root);
			     if(balance < -1 && getBalance(root.right) > 0) {
			    	 root.right = rightRotate(root.right);
			    	 return leftRotate(root);
			     }		 
			 
		  }
		  return root;			  
	  }
		void preOrder(Node root) {
			if(root==null) return;
			System.out.print(root.key+", ");
			preOrder(root.left);
			preOrder(root.right);
		}
	 void inOrder(Node root) {
			if(root==null) return;
			inOrder(root.left);
			System.out.print(root.key+", ");
			inOrder(root.right);		
		}
		 void postOrder(Node root) {
			if(root==null) return;
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.key+", ");
		}

		 public void inOrder() {
			 inOrder(root);
		 }
		 public void preOrder() {
			 preOrder(root);
		 }
		 public void postOrder() {
			 postOrder(root);
		 }

}
