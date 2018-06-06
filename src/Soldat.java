
public class Soldat extends Unite {
	
	protected static int puissanceMax=6;
	protected static int puissanceMin=1;
	protected static int puissance;
	protected static int cout=1;
	protected static int prioriteAtt=2; 
	protected static int prioriteDef=1; 
	protected static int mouvement=2;
	public Soldat() {
		super(6,1,puissance,1,2,1,2);
		
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

	public static int getCout() {
		return cout;
	}

	public static void setCout(int cout) {
		Soldat.cout = cout;
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
