package trees.traversal;
class Node{
	int key;
	Node right,left;
	
	Node(){
		
	}
	
	Node(int key){
		this.key =key;
				left =right=null;
	}

	Node(int key,Node left,Node right){
		this.key = key;
		this.left =left;
		this.right=right;
	}
}

public class BFS_traversal  // or level order traverrsal
{
Node root;

 BFS_traversal() {
	root=null;
}

int height(Node root) {
	if(root==null) return 0;
	
	int lheight = height(root.left);
	int rheight= height(root.right);
	
	if(lheight > rheight) return (lheight+1);
	else return(rheight+1);
}    

public void printGivenLevel(Node root,int level) {
	if(root==null) return;
	if(level== 1)
		System.out.print(root.key+" ");
	else if(level >1) {
		printGivenLevel(root.left, level-1);
		printGivenLevel(root.right, level-1);
		
	}	
}
public void BFS() {
	int h = height(root);
	for(int i=1;i<=h;i++)
		printGivenLevel(root, i);
	System.out.println();
}



}
