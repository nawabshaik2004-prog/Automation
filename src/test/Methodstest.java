package test;

public class Methodstest {
	
	
	public static void multiplynumbers(int a,int b) {
	 int multiply= a*b;
		System.out.println(multiply);
		}
	
		int c=2;
		int d=8;
		
		void addnumbers()
		{
		int add=c+d;
			System.out.println(add);
		}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multiplynumbers(10,5);
		
		Methodstest obj=new Methodstest();
		obj.addnumbers();

	}

}
