package ExceptionHandling;

public class Example2 {

	public static void main(String[] args) {
	
		try {
			int[] myNumbers = {1, 2, 3};
			System.out.println(myNumbers[4]);
			
		}
		
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}

}
