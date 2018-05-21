
public class Cavalier extends Unit� {
	
	protected static int puissanceMax=7;
	protected static int puissanceMin=2;
	protected static int co�t=3;
	protected static int prioriteAtt=1; 
	protected static int prioriteDef=3; 
	protected static int mouvement=3; 
	
	public Cavalier(int puissanceMax, int puissanceMin, int co�t, int prioriteAtt, int prioriteDef, int mouvement) {
		super(puissanceMax, puissanceMin, co�t, prioriteAtt, prioriteDef, mouvement);
		
	}

	public static int getPuissanceMax() {
		return puissanceMax;
	}

	public static void setPuissanceMax(int puissanceMax) {
		Cavalier.puissanceMax = puissanceMax;
	}

	public static int getPuissanceMin() {
		return puissanceMin;
	}

	public static void setPuissanceMin(int puissanceMin) {
		Cavalier.puissanceMin = puissanceMin;
	}

	public static int getCo�t() {
		return co�t;
	}

	public static void setCo�t(int co�t) {
		Cavalier.co�t = co�t;
	}

	public static int getPrioriteAtt() {
		return prioriteAtt;
	}

	public static void setPrioriteAtt(int prioriteAtt) {
		Cavalier.prioriteAtt = prioriteAtt;
	}

	public static int getPrioriteDef() {
		return prioriteDef;
	}

	public static void setPrioriteDef(int prioriteDef) {
		Cavalier.prioriteDef = prioriteDef;
	}

	public static int getMouvement() {
		return mouvement;
	}

	public static void setMouvement(int mouvement) {
		Cavalier.mouvement = mouvement;
	}

	
}
