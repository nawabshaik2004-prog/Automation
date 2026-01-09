package methodoveridding2;

public class overridding2 {

	public static void main(String[] args) {

		Vehicle V;
		
		V=new Car();
		V.speed();
		
		V=new Bike();
		V.speed();
	}

}
