package YAIP4;

public class Student extends Person{
	private String program;
	private int year;
	private double fee;
	
	public Student(String name, String address, String program, int year, double fee) {
		super(name, address);
		this.program = program;
		this.year = year;
		this.fee = fee;
		
		
			
	}

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "Student [program=" + program + ", year=" + year + ", fee=" + fee + "]";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student p1 = new Student("Amroune","Akim","math", 4, 4.4);
		Student p2 = new Student("Sofien", "Zeggane","francais", 2, 2.2 );
		
		System.out.println(p1);
		System.out.println(p2);
		
		

	}

}
