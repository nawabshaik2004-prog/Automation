
public class Display {

	
	void show(int a) {
		System.out.println(a);
	}
	
	void show(double a)
	{
		System.out.println(a);
	}
	
	void show(String a) {
		System.out.println(a);
	}
	public static void main(String[] args) {
		
		Display D1=new Display();
		D1.show(10);
		D1.show(10.05);
		D1.show("Nawab");

		
	}

}
