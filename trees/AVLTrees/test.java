package trees.AVLTrees;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AVLTrees a = new AVLTrees();
	  a.insert(10);
	  a.insert(90);
		a.insert(80);
	  a.insert(70);
	  a.insert(60);
	  a.insert(40);
	   
	  a.inOrder();
	  a.delete(40);
	  a.delete(90);
	  a.delete(10);
	  System.out.println();
	  a.inOrder();
	}

}
