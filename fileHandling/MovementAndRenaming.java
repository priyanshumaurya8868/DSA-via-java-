package fileHandling;
import java.io.*;

import java.util.*;

public class MovementAndRenaming {

	public static void main(String[] args) throws Exception {
		
		File file = new File("C:\\temp\\filehandling\\file1.txt");
		System.out.println(file.exists());
	File f2 =new File("C:\\temp\\filehandling\\newfile1.txt");
			if(file.renameTo(f2))
		{ //file.delete(); //deleteing original file
			System.out.println("File renamed/move successfuly");
		}
		else 
			System.out.println("failed!!");	System.out.println("*Is previous file still exists : "+file.exists());
	
	// for undo
		if(f2.renameTo(new File("C:\\temp\\filehandling\\file1.txt")))
		{
			f2.delete();
			System.out.println("Undo successfull!!");
		}
		else
			System.out.println("Undo failed!1");
		
		BufferedReader br = new BufferedReader(new FileReader(file)); 
		  
		  String st; 
		  while ((st = br.readLine()) != null) 
		    System.out.println(st);  
	}
	  
     
}
