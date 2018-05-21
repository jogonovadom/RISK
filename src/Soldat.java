
public class Soldat extends Unit� {
	
	protected static int puissanceMax=6;
	protected static int puissanceMin=1;
	protected static int co�t=1;
	protected static int prioriteAtt=2; 
	protected static int prioriteDef=1; 
	protected static int mouvement=2; 
	
	public Soldat(int puissanceMax, int puissanceMin, int co�t, int prioriteAtt, int prioriteDef, int mouvement) {
		super(puissanceMax, puissanceMin, co�t, prioriteAtt, prioriteDef, mouvement);
		
	}

	public static int getPuissanceMax() {
		return puissanceMax;
	}

	public static void setPuissanceMax(int puissanceMax) {
		Soldat.puissanceMax = puissanceMax;
	}

	public static int getPuissanceMin() {
		return puissanceMin;
	}

	public static void setPuissanceMin(int puissanceMin) {
		Soldat.puissanceMin = puissanceMin;
	}

	public static int getCo�t() {
		return co�t;
	}

	public static void setCo�t(int co�t) {
		Soldat.co�t = co�t;
	}

	public static int getPrioriteAtt() {
		return prioriteAtt;
	}

	public static void setPrioriteAtt(int prioriteAtt) {
		Soldat.prioriteAtt = prioriteAtt;
	}

	public static int getPrioriteDef() {
		return prioriteDef;
	}

	public static void setPrioriteDef(int prioriteDef) {
		Soldat.prioriteDef = prioriteDef;
	}

	public static int getMouvement() {
		return mouvement;
	}

	public static void setMouvement(int mouvement) {
		Soldat.mouvement = mouvement;
	}

	

}
