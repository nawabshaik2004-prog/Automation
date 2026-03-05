package array;

public class evenandodds {

	public static void main(String[] args) {

		int[] arr= {12,14,3,2,4,9,7};
		
		
		System.out.println("Even number");
		for(int num : arr) {
		if (num %2==0) {
			System.out.println(num);
		}
		
		}
		System.out.println("Odd numbers");
		for(int num1 : arr) {
			if(num1 %2!=0) {
				System.out.println(num1);
			}
		}
	
	}}


