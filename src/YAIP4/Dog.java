package YAIP4;

public class Dog extends Animal{
	public Dog(String name) {
		super(name);
	}
	
	public void greets() {
		System.out.println("Woof");
	}
	
	public void greets(Dog another) {
		System.out.println("Woooof");
	}

	@Override
	public String toString() {
		return "Dog []";
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog p1 = new Dog("lolo");
		Dog p2 = new Dog("titi");
		
		System.out.println(p1);
		System.out.println(p2.toString());
		
		

	}

}
