package encapsulation;

public class Student {
	
	String name;//private 
	int age;//private

		public void SetName(String n) {
			name=n;
		}
		
		
			public String GetName() {
				return name;
			}
				
				public void SetAge(int a) {
					age= a;
				}
				
				public int GetAge() {
					return age;
					
			}
		}


