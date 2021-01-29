package Inherit;

public class MainProton {

	public static void main(String[] args) {
		
		ProtonX70 x7 = new ProtonX70();
		ProtonX50 x5 = new ProtonX50();
		ProtonSaga s = new ProtonSaga();
		ProtonPersona p = new ProtonPersona();
		
		x5.name();
		x5.tyre();
		x5.windows();
		x5.headlightOn();
		x5.headlightOff();
		x5.autoParkingOn();
		x5.autoParkingOff();
		x5.autoDriveOn();
		System.out.println(" ");
		
		x7.name();
		x7.tyre();
		x7.windows();
		x7.headlightOn();
		x7.headlightOff();
		x7.autoDriveOn();
		System.out.println(" ");
		
		s.name();
		s.tyre();
		s.windows();
		s.fuel();
		s.headlightOn();
		s.headlightOff();
		System.out.println(" ");
		
		p.name();
		p.tyre();
		p.windows();
		p.space();
		p.headlightOn();
		p.headlightOff();
		p.fuel();
		
		
		
		
		


	}

}
