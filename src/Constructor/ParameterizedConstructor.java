package Constructor;

public class ParameterizedConstructor {
	String name;
	int age;
	

		ParameterizedConstructor(String name, int age){
			System.out.println("Parameterized Constructor");
			
			System.out.println("Name:"+name);
			System.out.println("Age:"+age);
			
		}
	

	public static void main(String[] args) {
		ParameterizedConstructor p1 =new ParameterizedConstructor("Nawab",21);

	}

}
