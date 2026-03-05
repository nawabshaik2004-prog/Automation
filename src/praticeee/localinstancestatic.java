package praticeee;

public class localinstancestatic {
	
	int instance=100;
	
	static int variable=150;
	
	void display() {
		
	
	int localvar=200;
	
	
	System.out.println("instance variable :"+ instance);
	System.out.println(" Static variable :"+ variable);
	System.out.println("local variable :"+ localvar);}

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		localinstancestatic o1=new localinstancestatic();
		o1.display();
		
	}

}
