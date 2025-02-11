package YAIP4;

public class Mammal extends Animal {
	public Mammal(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return "Mammal []";
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mammal p1 = new Mammal("lolo");
		Mammal p2 = new Mammal("titi");
		
		System.out.println(p1);
		System.out.println(p2.toString());
		
		

	}

}
