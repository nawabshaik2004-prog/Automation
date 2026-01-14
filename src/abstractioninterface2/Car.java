package abstractioninterface2;

public class Car implements Vehical,Fuel{

	@Override
	public void refuel(int litres) {
		System.out.println("Car refueled with "+litres+ " "+"litres");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Start() {
		System.out.println("Car is starting with key ignition");
		
	}

}