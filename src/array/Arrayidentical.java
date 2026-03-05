package array;

import java.util.Arrays;

public class Arrayidentical {

	public static void main(String[] args) {


		int[] a= {1,5,3};
		int[] b= {1,2,3};
	

		if(Arrays.equals(a,b)) {
			System.out.println("Arrays Are identical");
		}
		else{
			System.out.println("Arrays are not identical");
			
		}
	
	}

}
