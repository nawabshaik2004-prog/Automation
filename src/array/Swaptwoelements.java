package array;

public class Swaptwoelements {

	public static void main(String[] args) {

		
		int[] arr= {10,20,30,40,50};
		
		int temp=arr[0];
		arr[0]=arr[arr.length-1];
		arr[arr.length-1]=temp;
		
		
		System.out.println("After swapping");
		for(int num : arr) {
			System.out.println(num);
		}
	}

}
