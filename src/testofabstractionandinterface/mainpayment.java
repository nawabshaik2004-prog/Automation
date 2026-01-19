package testofabstractionandinterface;

public class mainpayment {

	public static void main(String[] args) {
			
		Payment P1=new Creditcard();
		
		P1.MakePayment(9000.05);
		
		Payment P2=new UPI();
		
		P2.MakePayment(2500.05);
		
		
	}

}
