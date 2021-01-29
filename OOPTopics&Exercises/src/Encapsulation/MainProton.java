package Encapsulation;


public class MainProton {

	public static void main(String[] args) {
		
		ProtonSaga s = new ProtonSaga();
		System.out.println("Proton Saga features :-");
		System.out.println("\t");
		s.fuel();
		s.printProton();
		s.checkTyresize();
		s.boot();
		
		System.out.println("\t");
		
		ProtonPersona p = new ProtonPersona();
	
		System.out.println("\t");
		System.out.println("Proton Persona features :-");
		System.out.println("\t");
		p.boot();
		p.printProton();
			
		//ENCAPSULATION
		//p.radio="Samsung"; //not visible because it's private
		//p.brand="Michellin"; //visible because it's not private
		//p.bigBoot="TRY"; //visible because it's not private
		p.setRadio("Kenwood"); //setting value in the name member
		System.out.println(p.getRadio()); // getting value of the name member
		System.out.println(p.getKey());
		//p.key-"TRY"; // can't change the value of the key data member which is "remote" .
		
		
		System.out.println("\t");
		
		ProtonX70 p1 = new ProtonX70();
	
		System.out.println("\t");
		System.out.println("ProtonX70 features :-");
		System.out.println("\t");
		p1.pilot();
		p1.printProton();
		
		System.out.println("\t");
		
		ProtonX50 p2 = new ProtonX50();	
		
		System.out.println("\t");
		System.out.println("ProtonX50 features :-");
		System.out.println("\t");
		p2.parking();
		p2.pilot();
		p2.printProton();


	}

}
