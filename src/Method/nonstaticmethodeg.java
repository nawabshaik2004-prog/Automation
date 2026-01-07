package Method;

public class nonstaticmethodeg {
	
	public void  printmsg() {
		System.out.println("this is nonstatic");
	}

	public static void main(String[] args) {
	nonstaticmethodeg obj1 = new nonstaticmethodeg();
	obj1.printmsg();

	}

}
