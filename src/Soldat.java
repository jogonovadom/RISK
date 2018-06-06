
public class Soldat extends Unite {
	
	public static int puissanceMax=6;
	public static int puissanceMin=1;
	public static int puissance;
	public static int cout=1;
	public static int prioriteAtt=2; 
	public static int prioriteDef=1; 
	public static int mouvement=2; 
	
	
	public Soldat() {
		super(6, 1,puissance, 1, 2, 1, 2);
		
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

	public int getPrioriteAtt() {
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

	public  int getMouvement() {
		return mouvement;
	}

	public static void setMouvement(int mouvement) {
		Soldat.mouvement = mouvement;
	}

	

}
