package ConsAndInherit;


public class MainProton {

	public static void main(String[] args) {
		
		ProtonSaga s = new ProtonSaga();
		System.out.println("Proton Saga features :-");
		System.out.println("\t");
		s.fuel();
		s.printProton();
		
		System.out.println("\t");
		
		ProtonPersona p = new ProtonPersona();
	
		System.out.println("\t");
		System.out.println("Proton Persona features :-");
		System.out.println("\t");
		p.space();
		p.fuel();
		
		System.out.println("\t");
		
		ProtonX70 p1 = new ProtonX70();
	
		System.out.println("\t");
		System.out.println("ProtonX70 features :-");
		System.out.println("\t");
		p1.printProton();
		p1.autoDriveOn();
		
		System.out.println("\t");
		
		ProtonX50 p2 = new ProtonX50();	
		
		System.out.println("\t");
		System.out.println("ProtonX50 features :-");
		System.out.println("\t");
		p2.parking();
		p2.autoDriveOn();
		p2.printProton();


	}

}
