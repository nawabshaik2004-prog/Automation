package methodoverloading1;

public class Printer {
	
	public void printvalue(int num) {
		System.out.println(num);
	}
	
	public void printvalue(double num) {
		System.out.println(num);
	}
	
	public void printvalue(String text) {
		System.out.println(text);
	}
	
	public void printvalue(boolean flag) {
		System.out.println(flag);
	}

}
