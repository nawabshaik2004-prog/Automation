package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class arraylistofint {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<>();
		
		
		numbers.add(89);
        numbers.add(78);
        numbers.add(56);
        numbers.add(45); 
        numbers.add(199);
        
        System.out.println(numbers);
        
        numbers.remove(Integer.valueOf(78));
        System.out.println(numbers);
        
        System.out.println("iterating number");
        for (int num : numbers) {
           System.out.println(num);
	
         ArrayList<Character> alphabetical =new ArrayList<>();
         
         alphabetical.add('A');
         alphabetical.add('B');
         
         Collections.reverse(numbers);
         System.out.println(numbers);
         
         
        }

}}
