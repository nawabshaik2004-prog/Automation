package abstractinterface;

public class Flipkart implements ECommerce{

	@Override
	public void placeOrder(String item, int quantity) {
System.out.println("order placed on Flipkart:"+item+" "+quantity);		
	}
	

}
