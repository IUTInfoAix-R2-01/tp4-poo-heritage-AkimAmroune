package YAIP4;

public class Animal {
private String name;
	
	public Animal(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + "]";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal p1 = new Animal("lolo");
		Animal p2 = new Animal("titi");
		
		System.out.println(p1);
		System.out.println(p2.toString());
		
		

	}

}
