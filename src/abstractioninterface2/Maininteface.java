package abstractioninterface2;

public class Maininteface {

	public static void main(String[] args) {


		Vehical V1=new Car();
		
		V1.Start();
		
		Fuel F1=new Car();
		
		F1.refuel(14);
		
		
		Vehical V2=new Bike();
		
		V2.Start();
		
		Fuel F2=new Bike();
		
		F2.refuel(10);
	}

}
