package methodoverriding;

public class Overridding {

	public static void main(String[] args) {

		Bank b;
		
		b =new Sbi();
		System.out.println("SBI Rate of Interest:"+ b.getRateofInterest());
		
		b =new ICICI();
		System.out.println("ICICI Rate of Interest: "+ b.getRateofInterest());
	
		b= new RBI();
		System.out.println("RBI Rate of Interest: "+ b.getRateofInterest());
		
	
	
	}
	

}
