package hierarchicalinheritance;

public class Hierarchicalinheritance {

	public static void main(String[] args) {

		Dog d1=new Dog();
		 
		d1.name="husky";
		d1.eat();
		d1.bark();
		
		Cat c1=new Cat();
		c1.name="persian";
		c1.eat();
		c1.walk();
	}

}
