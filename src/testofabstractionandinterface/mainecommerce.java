package testofabstractionandinterface;

public class mainecommerce {

	public static void main(String[] args) {

		ECommerce E1=new Amazon();
		
		E1.Placeorder("SmartPhone", 10);
		
		
		ECommerce E2=new Flipkart();
		
		E2.Placeorder("Laptop", 10);
	}

}
