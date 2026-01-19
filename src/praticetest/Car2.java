package praticetest;

public class Car2 implements Vehical2,Fuel{

	@Override
	public void Start() {
		System.out.println("car is starting with key ignition");
	}

	@Override
	public void refuel(int litres) {
		System.out.println("car refuel with"+ litres+ "litres");
		
	}

}
