package collectionFramework.stack;

public class MainClass {

	public static void main(String[] args) throws Exception{
		Mystack<Integer> s = new Mystack<Integer>(); 
s.push(2);
s.push(4);
s.push(6);
s.push(8);

System.out.println("Peek element  : "+s.peek());
	System.out.println("poped element  : "+ s.pop());
	System.out.println("now, peek : "+s.peek());
	}

}
