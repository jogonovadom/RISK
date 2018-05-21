
public class Canon extends Unité {
	
	protected static int puissanceMax=9;
	protected static int puissanceMin=4;
	protected static int coût=7;
	protected static int prioriteAtt=3; 
	protected static int prioriteDef=2; 
	protected static int mouvement=1; 
	
	public Canon(int puissanceMax, int puissanceMin, int coût, int prioriteAtt, int prioriteDef, int mouvement) {
		super(puissanceMax, puissanceMin, coût, prioriteAtt, prioriteDef, mouvement);
		
	}

	public static int getPuissanceMax() {
		return puissanceMax;
	}

	public static void setPuissanceMax(int puissanceMax) {
		Canon.puissanceMax = puissanceMax;
	}

	public static int getPuissanceMin() {
		return puissanceMin;
	}

	public static void setPuissanceMin(int puissanceMin) {
		Canon.puissanceMin = puissanceMin;
	}

	public static int getCoût() {
		return coût;
	}

	public static void setCoût(int coût) {
		Canon.coût = coût;
	}

	public static int getPrioriteAtt() {
		return prioriteAtt;
	}

	public static void setPrioriteAtt(int prioriteAtt) {
		Canon.prioriteAtt = prioriteAtt;
	}

	public static int getPrioriteDef() {
		return prioriteDef;
	}

	public static void setPrioriteDef(int prioriteDef) {
		Canon.prioriteDef = prioriteDef;
	}

	public static int getMouvement() {
		return mouvement;
	}

	public static void setMouvement(int mouvement) {
		Canon.mouvement = mouvement;
	}

	
}
