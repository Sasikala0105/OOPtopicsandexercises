package Abstraction;
// Example 3 : Abstraction using constructor
abstract class Vehicle3
{
	String msg;
	Vehicle3(String msg) //constructor with parameter
	{
		this.msg = msg;
	}
	void display() //non-abstract method
	{
		System.out.println(msg);
	}
}
class Honda3 extends Vehicle3
{
	Honda3(String msg){
		super(msg);
	}
}

public class AbstractExample3 {

	public static void main(String[] args) {
		Honda3 obj=new Honda3("Constructor is invoked");
		obj.display();
	}
}
