package praticeforfinal;

public class Nestedif {

	public static void main(String[] args) {

		int a=10;
		
		if(a>0) {
			System.out.println("Number is positive");
		
			if(a%5==0) {
				System.out.println("Number is divisible by 5");
			}
		}
		else {
			System.out.println("Number is negative");
		}
	}

}
