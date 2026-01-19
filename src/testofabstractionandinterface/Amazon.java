package testofabstractionandinterface;

public class Amazon implements ECommerce {

	@Override
	public void Placeorder(String item, int quantity) {
			System.out.println("Order placed on Amazon :"+item+"  "+quantity);
	}

}
