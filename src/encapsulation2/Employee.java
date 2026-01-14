package encapsulation2;

public class Employee {
	
	String EmpID;
	Double Salary;
	
	public void SetEmpID(String e) {
		EmpID=e;
		
	}
	
	public String GetEmpID() {
		return EmpID;
	}
	
	public void SetSalary(Double S) {
		Salary=S;
	}
	
	Double GetSalary() {
		return Salary;
	
		
	}

}
