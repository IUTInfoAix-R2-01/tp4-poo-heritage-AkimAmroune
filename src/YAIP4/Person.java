package YAIP4;

import Cycle.velo_java;

public class Person {
	private String name;
	private String address;
	
	
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getName() {
		return name;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + "]";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1 = new Person("sofien", "4 rue de aix");
		Person p2 = new Person("pablo", "2 rue du skeske" );
		Person p3 = new Person("akim", "1 rue de moi");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		

	}


}
