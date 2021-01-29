package Interface;
/*
 * In this example, the Printable interface has only one method, and its implementation is provided in the InterfaceExample1 class.
 */

interface printable{
	void print();
}

class InterfaceExample1 implements printable {
	public void print() {System.out.println("Hello");}
	
	public static void main(String args []) {
		InterfaceExample1 obj = new InterfaceExample1 ();
		obj.print();
	}
}
