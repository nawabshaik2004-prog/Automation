package praticetest;

public class mainclass2 {

	public static void main(String[] args) {

		
		Payment P1=new Creditcard();
		
		P1.makepayment(1000.05);
		
		Payment P2=new UPI();
		
		P2.makepayment(200.05);
	}

}
