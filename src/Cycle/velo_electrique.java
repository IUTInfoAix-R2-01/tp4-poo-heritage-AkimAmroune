package Cycle;

public class velo_electrique extends velo_java{
	private static double DEFAUT_FACTEUR_PUISSANCE_MOTEUR = 15.0;
	private double facteurPuissanceMoteur;
	
	
	public velo_electrique(double braquet, double diamRoue, double coupleMoteur) {
		super(braquet, diamRoue) ;
		this.facteurPuissanceMoteur = coupleMoteur;		
	}
	
	
	public velo_electrique(double diamRoue, double coupleMoteur) {
		super(diamRoue);
		this.facteurPuissanceMoteur = coupleMoteur;
	}
	
	
	public velo_electrique() {
		super();
	}


	public static double getDEFAUT_FACTEUR_PUISSANCE_MOTEUR() {
		return DEFAUT_FACTEUR_PUISSANCE_MOTEUR;
	}


	public static void setDEFAUT_FACTEUR_PUISSANCE_MOTEUR(double dEFAUT_FACTEUR_PUISSANCE_MOTEUR) {
		DEFAUT_FACTEUR_PUISSANCE_MOTEUR = dEFAUT_FACTEUR_PUISSANCE_MOTEUR;
	}


	public double getFacteurPuissanceMoteur() {
		return facteurPuissanceMoteur;
	}


	public void setFacteurPuissanceMoteur(double facteurPuissanceMoteur) {
		this.facteurPuissanceMoteur = facteurPuissanceMoteur;
	}
	
	public double getPuissance(double FrequenceCoupsDePedale) {
		return FrequenceCoupsDePedale = super.getPuissance(FrequenceCoupsDePedale) * facteurPuissanceMoteur;
		
	}


	@Override
	public String toString() {
		return "velo_electrique [facteurPuissanceMoteur=" + facteurPuissanceMoteur + "]";
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		velo_electrique v1 = new velo_electrique();
		velo_electrique v2 = new velo_electrique(15,10);
		velo_electrique v3 = new velo_electrique(15, 4, 2);
		
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v3.getPuissance(10));
		

	}

}
