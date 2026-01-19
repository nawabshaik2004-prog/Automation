package praticetest;

public class EMployee {
	
	String empid;
	Double Salary;
	
	public void Setemp(String e) {
		empid=e;
		
	}
	
	
	public String Getemp() {
		return empid;
	}

	
	public void SetSalary(Double s) {
		Salary=s;
	}
	
	 Double GetSalary() {
		return Salary;
	}
}
