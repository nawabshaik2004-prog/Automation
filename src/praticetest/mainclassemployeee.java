package praticetest;

public class mainclassemployeee {

	public static void main(String[] args) {

		
		EMployee E1=new EMployee();
		
		E1.Setemp("nawab");
		E1.SetSalary(2000.05);
		
		System.out.println("emp:"+ E1.Getemp());
		System.out.println("Salary:"+ E1.GetSalary());
		
	}

}
