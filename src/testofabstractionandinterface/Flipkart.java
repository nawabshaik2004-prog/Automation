package testofabstractionandinterface;

public class Flipkart implements ECommerce {

	@Override
	public void Placeorder(String item, int quantity) {
	
		System.out.println("Order placed on Flipkart :"+item+"  "+quantity);
		
	}

}
