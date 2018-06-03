
public class Cavalier extends Unite {
	
	protected static int puissanceMax=7;
	protected static int puissanceMin=2;
	protected static int cout=3;
	protected static int prioriteAtt=1; 
	protected static int prioriteDef=3; 
	protected static int mouvement=3; 
	protected static int ID=1000;
	
	public static int getID() {
		return ID;
	}

	public static void setID(int iD) {
		ID = iD;
	}

	public Cavalier() {
		super(7, 2, 3, 1, 3, 3, ID);
		
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

	public static int getCout() {
		return cout;
	}

	public static void setCout(int cout) {
		Cavalier.cout = cout;
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
