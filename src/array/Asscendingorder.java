package array;

public class Asscendingorder {

	public static void main(String[] args) {

		
		int []arr= {1,3,5,9};
		
		boolean sorted=true;
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				 sorted =false;break;
			}
		}
	if(sorted) {
		System.out.println("Array is in asscending order");
	}
	else {
		System.out.println("Array is not in asscending order");
	}
	
	
	}

}
