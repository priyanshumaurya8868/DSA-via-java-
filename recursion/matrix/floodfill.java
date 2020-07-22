package recursion.matrix;

import java.util.*;


public class floodfill {
	public static void main (String[] args) {
	    
		//code
		Scanner sc= new Scanner(System.in);
		int t= sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int m= sc.nextInt();
		    int a[][] =new int[n][m];
		    for(int i=0;i<n;i++){
		        for(int j=0;j<m;j++){
		        	System.out.print(i+" , "+j+": ");
		            a[i][j]=sc.nextInt();
		        }
		    }
		    int x= sc.nextInt();
		    int y= sc.nextInt();
		    int k= sc.nextInt();
		    int preFill=a[x][y];
		    floodFill(a,x,y,preFill,k);
		    
		    print(a); 
		}
		sc.close();
		
	}
	public static void print(int[][] a){
	    	int rows =a.length;
		int cols = a[0].length;
		for(int i=0;i<rows;i++){
		    for(int j=0;j<cols;j++){
		        System.out.print(a[i][j]+" ");
		    }
		}
		System.out.println();
	}
	public static void floodFill(int a[][],int r,int c,int preFill,int toFill)
	{
		int rows =a.length;
		int cols = a[0].length;
		
		if(r<0||r>= rows||c<0||c>=cols)
			return;
		if(a[r][c]!=preFill)
			return;
		a[r][c]=toFill;
		
		floodFill(a, r+1, c, preFill, toFill);
		floodFill(a, r-1, c, preFill, toFill);
		
		floodFill(a, r, c+1, preFill, toFill);
		floodFill(a, r, c-1, preFill, toFill);
		
		
	}
	
}