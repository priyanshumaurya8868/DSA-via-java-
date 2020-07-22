package classAndObject;
/* NOTE :  CLASS = blueprint of the objects
 * 1 : You can create only one public class in a file (and i.e. obiouslly gonna be that contains main()
 *   initially classes in your program doesn't consume any memory until unless you create objects throughout them
 */
 class Phone  
{   //instance member variables
	 String name,processor;
	 int price;
	int ram,rom;
	int camera;
	//methods or instance member function
	public void  description()
	{
		System.out.println(name+" is one of the best phone in the price segment "+price);
		System.out.println("it has camera : "+camera+"MP");
		System.out.println("this is powered by the processor : "+processor+"\nRam : "+ram+"GB"+"\nRom : "+rom+"GB");
	}
	public Phone()
	{
		System.out.println("\t\thi we are Introducing a phone..!\n");
	}
	
}
public class basics {
	public static void main(String[] args)
	{
		Phone nokia = new Phone();
		/*NOTE : Objects = instance of classes
		 * they consume memory in a heap
		 * you can create multiple objects(of different name) from a single class
		 * u can access instance member function/variable through dot operator
		 */
		nokia.name="Nokia 6.1+";
		nokia.camera =16;
		nokia.ram=4;
		nokia.rom=64;
		nokia.processor="Snapdragon 636";
		nokia.price=14000;
		nokia.description();
	
		
	}
         
}
