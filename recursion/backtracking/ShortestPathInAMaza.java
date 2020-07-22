package recursion.backtracking;

public class ShortestPathInAMaza {

	public static void main(String[] args) {
	

	}
	public static int ShortestPath(int a[][],int i,int j,int x,int y) {
	
		boolean vis[][] =new boolean[i][j];
		return util(a,i,j,x,y,vis);
	}
	static int  util(int a[][],int i,int j,int x,int y,boolean vis[][]) {
	
	
		if(i==x &&j==y) return 0;
		if (!isValid(a, i, j, vis)) return 1000000;
		vis[i][j]=true;
		int top = util(a,i+1,j,x,y,vis)+1;
		int bottom =util(a,i-1,j,x,y,vis)+1;
		int right= util(a,i,j+1,x,y,vis)+1;
		int left = util(a,i,j-1,x,y,vis)+1;
		
		vis[x][y]=false;
		
		return Math.min(Math.min(top, bottom),Math.min(left, right));
		
	}
	static boolean isValid(int a[][],int i,int j,boolean vis[][])
	{ 
		int rows= a.length;
		int cols = a[0].length;
		return (i>=0 && i<rows && j>=0 && j<cols &&a[i][j]==1 && !vis[i][j] );
	}

}
