package hierarchicalinheritance1;

public class Hierarchicalinheritance1 {

	public static void main(String[] args) {

		Employee E1=new Employee();
		
		E1.name="johnson";
		E1.display();
		E1.job();
		
		Manager M1=new Manager();
		
		M1.name="Marco";
		M1.display();
		M1.manage();
		
	}

}
