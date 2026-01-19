package testofgetterandsetter;

public class mainemployeee {

	public static void main(String[] args) {

		
		Employee E1=new Employee();
		
		E1.SetEmpID(115915);
		E1.SetSalary(25000);
	
		System.out.println("EmpId :"+ E1.GetEmpID());
		System.out.println("Salary :"+ E1.GetSalary());
	
	
	}

}
