package Abstraction;
/*
 * Example 5 : Inner abstract class
 */
class Vehicle5
{
abstract class Car
{
	abstract void display();
	
}
class Honda5 extends Car
{
	@Override
	void display() {
		System.out.println("Inner abstract class is invoked");
	}
}
	
}

public class AbstractExample5 {

	public static void main(String[] args) {
		Vehicle5 obj=new Vehicle5(); //create new object for class Vehicle5
		Vehicle5.Car c = obj.new Honda5(); //create new object of Honda5
		c.display();
		

	}

}
