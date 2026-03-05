package Method;

public class MAxnumber {

	int FindMax(int a, int b,int c) {
		int max =a;
		
		if(b>max) {
			max=b;
		}
		if(c>max) {
			max=c;
			
		}
		return max;
		
		
	}
	public static void main(String[] args) {

		MAxnumber m1=new MAxnumber();
		m1.FindMax(10,20,45);
		
		int largest = m1.FindMax(10, 20, 45);
		System.out.println(largest);
	}

}
