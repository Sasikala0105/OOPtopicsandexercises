package InheritEx;

public class mainResume {

	public static void main(String[] args) {
		
		resume1 r1 = new resume1();
		resume2 r2 = new resume2();
		resume3 r3 = new resume3();
		resume4 r4 = new resume4();
		
		r1.Resume();
		r1.name();
		r1.age();
		r1.gender();
		r1.citizenship();
		r1.marital();
		r1.homeaddress();
		r1.phoneNum();
		
		System.out.println(" ");
		
		r1.examresult();
		r1.subject();
		r1.grade();
		
		System.out.println(" ");
		
		r2.Skills();
		r2.ItProficiency();
		r2.SpeakingProficiency();
		r2.WritingProficiency();
		
		System.out.println(" ");
		
		r3.Talent();
		r3.ThingsICanDo1();
		r3.ThingsICanDo2();
		r3.ThingsICanDo3();
		r3.ThingsICanDo4();
		
		System.out.println(" ");
		
		r4.WorkExperience();
		r4.wp1();
		r4.wp2();
		r4.wp3();

	}

}
