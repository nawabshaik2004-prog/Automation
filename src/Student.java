
public class Student {
	
	String name;
	int rollno;
	int marks;
	
	Student(String n,int r,int m){
		name=n;
		rollno=r;
		marks=m;
	}
	
	void displaystudent() {
		System.out.println("Name :"+name);
		System.out.println("Roll no :"+ rollno);
		System.out.println("Marks :"+marks);
	}

	public static void main(String[] args) {

		Student S1=new Student("nawab",01,50);
		S1.displaystudent();
	}

}
