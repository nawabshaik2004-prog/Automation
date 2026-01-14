package encapsulation2;

public class MainEmployee {

	public static void main(String[] args) {

		
		Employee E1=new Employee();
		
		E1.SetEmpID("123465");
		E1.SetSalary(10000.00);
		
		System.out.println("EmpId:"+ E1.GetEmpID());
		System.out.println("Salary:"+ E1.GetSalary());
	}

}
