package conditionalstatements;

public class Nestedifstatement {

	public static void main(String[] args) {
		
		        int marks = 100;
		            if (marks >= 60) { // Outer if
		            System.out.println("You passed!");
		            if (marks >= 90) { // Inner if
		                System.out.println("Grade: A+");
		            } else if (marks >= 80) {
		                System.out.println("Grade: A");
		            } else if (marks >= 70) {
		                System.out.println("Grade: B");
		            } else {
		                System.out.println("Grade: C");
		            }
		        } else {
		            System.out.println("You failed!");
		        } } }

	


