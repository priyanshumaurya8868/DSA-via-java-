package fileHandling;
import java.io.*;
import java.util.*;
public class Intro {

	public static void main(String[] args) {
		
		File myobj = new File("C:\\temp\\filehandling\\file1.txt");
		try {			myobj.delete();
			//1. creating a new File 

		boolean res=	myobj.createNewFile();     
		if(res) System.out.println("File created successfuly!");
		else System.out.println("Already exists!!");
			//2. writing on a file
			FileWriter myWriter = new FileWriter("C:\\temp\\\\filehandling\\file1.txt");
			myWriter.write("java is more powerful than cpp!!\n second line\n another line");
			myWriter.close();
			
			//3. file info
			System.out.println("\nFile Name : "+myobj.getName());
			System.out.println("AbsolutePath : "+myobj.getAbsolutePath());
			System.out.println("Length : "+ myobj.length());
			//can be reset by passing boolean value as parameter in  the func : myobj.setWritable
			System.out.println("Writable : "+myobj.canWrite()); System.out.println("Restricting Writable : "+myobj.setWritable(false));
			System.out.println("Readable : "+myobj.canRead()); System.out.println("Restricting Readable : "+myobj.setReadable(false));
            System.out.println("Excecutable : "+myobj.canExecute());
          
            //4. reading from file
            Scanner myReader = new Scanner(myobj);
            while(myReader.hasNextLine()) {
            	String s = myReader.nextLine();
            	System.out.println(s);
            }
            	
            myReader.close();
        	System.out.println("Readable : "+myobj.canRead()); 
       
        	System.out.println("Writable : "+myobj.canWrite());
		}catch(IOException e) {
			System.out.println("Eroor Occured!!"+e);
		}

	}

}
