package abstractinterface;

public class Ecommmerecemainclass {

	public static void main(String[] args) {
			
		ECommerce C1=new Amazon();
		
		C1.placeOrder("Laptop", 10);
		
		ECommerce C2=new Flipkart();
		C2.placeOrder("Mobile phone", 10);
		
	}

}
