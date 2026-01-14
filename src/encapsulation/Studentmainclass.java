package encapsulation;

public class Studentmainclass {

	public static void main(String[] args) {

		
		Student S1=new Student();
		
		S1.SetName("Nawab");
		S1.SetAge(19);
		
		System.out.println("name:"+ S1.GetName());
		System.out.println("Age:"+ S1.GetAge());
	}

}
