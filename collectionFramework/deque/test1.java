package collectionFramework.deque;

public class test1 {

	public static void main(String[] arsgs) {
		MyDeque<String> md = new MyDeque<>();
		
		md.insertionFront("centre");
		md.insertionFront("centre-1");
        md.insertionRear( "center+1");
		
md.showData();
System.out.println();
System.out.println(md.getFront()+"\n"+md.getRear());

System.out.println();
md.deleteFront();
md.deleteRear();
md.showData();



	}

}
