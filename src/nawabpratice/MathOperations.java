package nawabpratice;



public class MathOperations {

 
 public static void multiplyNumbers(int a,int b) {
    int multiply=a*b;
     System.out.println("static:"+multiply);
 }
   
 public void addNumbers(int c,int d) {
	 int add=c+d;
	 System.out.println("non staic :"+ add );
 }

 public static void main(String[] args) {
	
	 multiplyNumbers(10,6);
	 MathOperations a1=new MathOperations();
	 a1.addNumbers(100,5);
 }
	  
}

