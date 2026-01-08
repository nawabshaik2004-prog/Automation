package methodoverloading;

public class Differentsequenceofparameters {

	public void add(int a,String b) {
		System.out.println(a+" "+b);
		
	}
	
	public void add(String a, int b) {
		System.out.println(a+" "+b);
	}
}
