package Abstraction;

//Example 2 : Abstract class containing the abstract and non-abstract method

abstract class Vehicle2
{
	abstract void bike(); //abstract method - no implementation
	
	void car() // non-abstract method - can have implementation
	{
		System.out.println("Car is running"); //implementation
		
	}
	
}
class Honda2 extends Vehicle2
{
	@Override
	void bike() {  //to access abstract method
		System.out.println("Bike is running");
		
	}
}


public class AbstractExample2 {

	public static void main(String[] args) {
		Honda2 obj = new Honda2();
		obj.bike();
		obj.car();

	}
}
