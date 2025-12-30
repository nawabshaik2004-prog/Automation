package nawabpratice;

public class swappingwithoutthirdvariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		
		System.out.println("Before swapiing:"+a);
		System.out.println("Before swapping:"+b);
		
		a=a+b;//a=30
		b=a-b;//b=10
		a=a-b;
		System.out.println("after swapping:"+a);
		System.out.println("after swappping:"+b);
		
	}

}
