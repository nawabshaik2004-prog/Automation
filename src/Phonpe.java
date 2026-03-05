
public class Phonpe implements PaymentApp{

	@Override
	public void pay(double amount) {
		System.out.println(amount+"payment done by phonepe");
	}

}
