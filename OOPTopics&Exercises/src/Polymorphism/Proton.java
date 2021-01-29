package Polymorphism;


public class Proton {
	
	String brand, windows, headlight;
	int tyreSize;
	
	Proton() {
	this.brand="Dunlop";
	this.tyreSize=18;
	}
	Proton(String w, String h){
		this.windows=w;
		this.headlight=h;
	}
	public void printProton() {
		Proton obj1 = new Proton();
		Proton obj2 = new Proton("Up", "On");
		Proton obj3 = new Proton("Down", "Off");
		
		System.out.println("Tyre Brand : " + obj1.brand + "\nTyre size : " + obj1.tyreSize);
		System.out.println("Windows : " + obj2.windows+" "+obj2.headlight);
		System.out.println("Windows : " + obj3.windows+" "+obj3.headlight);
		
	}
	
	//method overloading
	void sum(int base, long standard) {
		System.out.println(base + standard);
	}
	void sum (int base, int executive, int premium) {
		System.out.println(base + executive + premium);
	}
	
	//defining a method for POLYMORPHISM
	void run() {
		System.out.println("Vehicle is running");
	}
	
}
