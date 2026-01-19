package testofgetterandsetter;

public class Mainstudent {

	public static void main(String[] args) {
		
		Student S1=new Student();
		
		S1.Setname("Hello World");
		S1.Setage(-2);
		
		System.out.println("Name:"+ S1.Getname());
		System.out.println("Age :"+ S1.Getage());
		
	}

}
