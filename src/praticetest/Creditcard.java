package praticetest;

public class Creditcard extends Payment{

	@Override
	void makepayment(double amount) {
		System.out.println("paid amount by credit card  :"+  amount);
	}

}
