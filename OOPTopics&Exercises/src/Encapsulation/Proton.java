package Encapsulation;

import java.util.Scanner;

public class Proton {
	
	Proton() {
	this.brand="Dunlop";
	this.tyreSize=18;
	}

	
	Proton(String w, String h){
		this.windows=w;
		this.headlight=h;
	}
	String brand, windows, headlight;
	int tyreSize;
	
	public void printProton() {
		Proton obj1 = new Proton();
		Proton obj2 = new Proton("Up", "On");
		Proton obj3 = new Proton("Down", "Off");
		
		System.out.println("Tyre Brand : " + obj1.brand + "\nTyre size : " + obj1.tyreSize);
		System.out.println("Windows : " + obj2.windows+" "+obj2.headlight);
		System.out.println("Windows : " + obj3.windows+" "+obj3.headlight);
	}
	
	public void checkTyresize() {
		System.out.println("Please enter the tyre size : ");
		Scanner scan = new Scanner(System.in);
		int tyresize = scan.nextInt();
		System.out.println(tyresize);
		if (tyresize < 18) {
			throw new ArithmeticException("The tyre size is wrong!");
		}
		else {
			System.out.println("The tyre size is correct!");
		}
	}
		
		public void boot() {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the boot size : ");
		
			
			try {	
				int size =scan.nextInt();
				System.out.println("The boot space" + size);
			}
			catch (Exception e) {
				System.out.println("The input is wrong!");
			
		}
	
	}
	
}
