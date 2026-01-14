package abstractioneg2;

public class Paymentmainclass {

	public static void main(String[] args) {
		
		Payment P1=new Creditcarpayment();
		
	P1.makePayment(1000.05);
	
	Payment P2=new UPIPayment();
	P2.makePayment(200.45);
	}

}
