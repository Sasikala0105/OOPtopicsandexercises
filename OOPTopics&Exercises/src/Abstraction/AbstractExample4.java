package Abstraction;
/*
 * Example 4 : Abstract class containing overloaded abstract methods
 */ 

abstract class Vehicle4
{
	abstract void display();
	abstract void display(String msg);
	
}
class Honda4 extends Vehicle4
{
	@Override
	void display() {
		System.out.println("Abstract method is invoked");
	}
	@Override
	void display(String msg) {
		System.out.println(msg);
	}
}

public class AbstractExample4 {

	public static void main(String[] args) {
		Honda4 obj = new Honda4();
		obj.display();
		obj.display("Overloaded abstract method is invoked");
		

	}

}
