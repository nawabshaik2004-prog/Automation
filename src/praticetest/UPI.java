package praticetest;

public class UPI extends Payment{

	@Override
	void makepayment(double amount) {
		System.out.println("paid amount using UPI :"+   amount);
	}

}
