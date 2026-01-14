package abstractioneg2;

public class UPIPayment extends Payment{
	
	void makePayment(double amount) {
		System.out.println("Paid ₹amount using UPI"+ amount);
	}
}
