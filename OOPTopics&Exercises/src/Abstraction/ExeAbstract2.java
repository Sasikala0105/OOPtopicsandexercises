package Abstraction;
//Abstract class
abstract class Animal {
	//Abstract method (does not have a body)
	public abstract void animalSound();
	//Regular method
	public void sleep() {
		System.out.println("Zzz");
	}
}
//Subclass (inherit from Animal)
class Cat extends Animal { 
	public void animalSound() {
		//The body of animalSound() is provided here
		System.out.println("The cat says : Miaww Miaww");
	}
}

 class ExeAbstract2 {

	public static void main(String[] args) {
		Cat animal = new Cat ();
		animal.animalSound();
		animal.sleep();

	}

}
