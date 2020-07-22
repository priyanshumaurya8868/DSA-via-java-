package oops.staticKeyword;
  class Student 
{ 
private	static int count=0;
	private String name ;
	private int rollno;
	private static String school = "RGB"; //cant declare this here because this not a top(i.e public) class
	
	class info
	{
		/* you can never create any static variable in any of the nested class like done below (because that can only be happen either this top class(i.e public) or static class)
		 * for that there are two ways :
		 * 1 : make that  class static
		 * 2: add final Keyword in front of the static variable
	
	*/
		
		//static  String school = "RGB";//compilation error
	}
	
	Student(int r,String n)
	{
		rollno=r;
	    name= n;
	    count++;
	    System.out.println("\n\tstudent "+(count)+"\nName : "+name+"\nRollNo. : "+rollno+"\nschool : "+school);
	}
	public void changeSchool(String School)
	{
		this.school = School;
	}
	public  String getSchool() {
		return school;
	}
	public  void setSchool(String school) {
		Student.school = school;
	}
}
public class StaticVariable {
	 
	public static void main(String[] args)
	{ 
		Student s1 = new Student(4,"Priya");
		
	/*******************************************************************************************************************************************************/	
		//static variable can be access or change by a non static function
		s1.setSchool("ghb");
		
		// non-static method 
		System.out.println("\nSchool changed : "+s1.getSchool());
	/**********************************************************************************************************************************************************/	
		
		Student s2 = new Student(5, "Priyanshu");
		
		Student s3 = new Student(3,"Riya");
		
	}

}

