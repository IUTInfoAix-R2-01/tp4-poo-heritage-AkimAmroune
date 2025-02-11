package Cycle;

import java.util.Random; 


public class velo_java {
	private static double DEFAUT_BRAQUET = 13.0;
	private double braquet; 
	private double diamRoue;
	private Random genAlea = new Random ();
	
	
	public double getBRAQUET() {
		return DEFAUT_BRAQUET;
	}
	
	
	public velo_java(double braquet, double diamRoue) {
		this.braquet = braquet;
		this.diamRoue = diamRoue;	
	}
	
	
	
	public velo_java(double braquet) {
		this.braquet = braquet;
	}
	
	
	public velo_java() {
		this(DEFAUT_BRAQUET,0);
	}
	
	
	public double getBraquet() {
		return braquet;
	}
	
	
	
	public void setBraquet(double braquet) {
		this.braquet = braquet;
	}
	
	
	public double getDiamRoue() {
		return diamRoue;
	}
	
	
	public void setDiamRoue(double diamRoue) {
		this.diamRoue = diamRoue;
	}
	
	
	public Random getGenAlea() {
		return genAlea;	
	}

	public void setGenAlea(Random genAlea) {
		this.genAlea = genAlea;
	}
	
	
	

	public double getPuissance(double FrequenceCoupsDePedale) {
		return FrequenceCoupsDePedale = FrequenceCoupsDePedale* braquet * diamRoue* genAlea.nextDouble();
		
	}
	
	
	@Override
	public String toString() {
		return "velo_java [BRAQUET=" + DEFAUT_BRAQUET + ", braquet=" + braquet + ", diamRoue=" + diamRoue + ", genAlea="
				+ genAlea + "]";
	
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		velo_java v1 = new velo_java();
		velo_java v2 = new velo_java(15);
		velo_java v3 = new velo_java(15, 4);
		
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.print(v3.getPuissance(10));
		
		

	}
	
}
