package praticetest;

public class Bike2 implements Vehical2,Fuel{

	@Override
	public void refuel(int litres) {
			System.out.println("bike refule with "+litres+"litres");
	}

	@Override
	public void Start() {
			System.out.println("bike starting with self button");
	}

	
	

	
	
	
}