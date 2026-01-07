package test;

public class Book {
	
		String title;
		String author;
		int price;
		
		Book(String t,String a,int p){
			title=t;
			author=a;
			price=p;
			
		}
		
		void displaydetails() {
			System.out.println("book tile:"+title);
			System.out.println("book author:"+author);
			System.out.println("book price:"+price);
			
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Book obj= new Book("java","nawab",2000);
			obj.displaydetails();
		}


	

	}

