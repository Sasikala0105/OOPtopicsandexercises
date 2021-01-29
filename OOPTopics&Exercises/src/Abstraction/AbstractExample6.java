package Abstraction;
/*
 * Example 6 : Nested abstract class
 */
abstract class Vehicle6
{
	abstract class Car
	{
		abstract void display();
	}
}
class Honda6 extends Vehicle6
{
	class FourWheller extends Car
	{
		@Override
		void display() {
			System.out.println("Nested abstract class is invoked");
		}
		}
	}

public class AbstractExample6 {

	public static void main(String[] args) {
		Vehicle6 obj=new Honda6();
		Honda6 h =(Honda6)obj;
		Honda6.FourWheller fw = h.new FourWheller();
		fw.display();
	}

}
