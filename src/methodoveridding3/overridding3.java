package methodoveridding3;

public class overridding3 {

	public static void main(String[] args) {

		Employee E;
		
		E =new Manager();
		E.CalculateSalary();
		
		E=new Developer();
		E.CalculateSalary();
	}

}
