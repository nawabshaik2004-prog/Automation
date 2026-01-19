package testofgetterandsetter;

public class Student {
	
	private String name;
	private int age;
	
	
	public void Setname(String n) {
		name=n;
	}
	
	public String Getname() {
		return name;
	}
	
	
	public void Setage(int a) {
		if(age>0) {
			age=a;
		}else {
			System.out.println("Invalid age");
		}
		
	}
	
	public int Getage() {
		return age;
	}

}
