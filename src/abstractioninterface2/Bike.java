package abstractioninterface2;

public class Bike implements Vehical,Fuel {

	@Override
	public void refuel(int litres) {
		
		System.out.println("Bike refueled with "+litres+" " +"litres");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Start() {
		System.out.println("Bike is starting with self-start button");
		// TODO Auto-generated method stub
		
	}

}
