package nawabpratice;

public class counterCopy {

	public static void main(String[] args) {
		
	
	Counter.incrementstatic();
	
	Counter c1=new Counter();
	c1.incrementnonstatic();
	
	c1.incrementnonstatic();
	
	}
}
