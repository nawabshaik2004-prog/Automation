package array;

public class Assignment1 {

	public static void main(String[] args) {

		
		int[] arr= {41,42,43,44,45};
		
		
		int min = arr [0];
		int max = arr[0];
		
		for(int i=1; i<arr.length; i++) {
				
		if (arr[i] < min) {
			min =arr[i];
			
		}
		
		if (arr[i] > max) {
			max=arr[i];
		}
	}
		System.out.println("minimum elements :"+ min);
		System.out.println("Maximum elements :"+ max);

}}
