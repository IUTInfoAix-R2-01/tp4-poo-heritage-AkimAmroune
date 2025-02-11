package YAIP4;

public class Cat extends Animal{
	
	public Cat(String name) {
		super(name);
	}
	
	public void greets() {
		System.out.println("Meow");
	}

	@Override
	public String toString() {
		return "Cat []";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cat p1 = new Cat("lolo");
		Cat p2 = new Cat("titi");
		
		System.out.println(p1);
		System.out.println(p2.toString());
		
		

	}

}
