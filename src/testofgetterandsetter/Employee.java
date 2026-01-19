package testofgetterandsetter;

public class Employee {
	
	private int EmpID;
	private double Salary;
	
	public void SetEmpID(int e) {
		EmpID=e;
		
	}
	
	public int GetEmpID() {
		return EmpID;
	}
	
	public void SetSalary(double s) {
		Salary=s;
		
	}
	
	public double GetSalary() {
		return Salary;
	}

}
