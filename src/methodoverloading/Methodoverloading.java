package methodoverloading;

public class Methodoverloading {

	public static void main(String[] args) {

		Differentnumbersparameters obj = new Differentnumbersparameters();
		obj.add(10,20);
		obj.add(10,20,20);
		
		Differentdatatypes obj1 = new Differentdatatypes();
		
		obj1.add(20, 30);
		obj1.add(8.5, 7.9);
		
		Differentsequenceofparameters obj2= new Differentsequenceofparameters();
		
		obj2.add(10,"Hello");
		obj2.add("Nawab", 20);
	}

}
