
public class Canon extends Unite {
	
	protected static int puissanceMax=9;
	protected static int puissanceMin=4;
	protected static  int puissance;
	protected static int cout=7;
	protected static int prioriteAtt=3; 
	protected static int prioriteDef=2; 
	protected static int mouvement=1; 
	
	
	public Canon() {
		super(9, 4,puissance, 7, 3, 2, 1);
		
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

	public static int getCout() {
		return cout;
	}

	public static void setCout(int cout) {
		Canon.cout = cout;
	}

	public  int getPrioriteAtt() {
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

	public int getMouvement() {
		return mouvement;
	}

	public static void setMouvement(int mouvement) {
		Canon.mouvement = mouvement;
	}

	
}
