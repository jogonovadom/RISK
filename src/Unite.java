
public class Unite {

	protected static int puissanceMax;
	protected static int puissanceMin;
	protected  int puissance;

	public  int getPuissance() {
		return puissance;
	}

	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}

	protected static int cout;
	public static int prioriteAtt; // priorite d'attaque
	protected static int prioriteDef; // priorite defensive
	protected static int mouvement;
	

	

	public Unite(int puissanceMax, int puissanceMin, int puissance, int cout, int prioriteAtt, int prioriteDef,
			int mouvement) {

	}

	public static int getPuissanceMax() {
		return puissanceMax;
	}

	public static void setPuissanceMax(int puissanceMax) {
		Unite.puissanceMax = puissanceMax;
	}

	public static int getPuissanceMin() {
		return puissanceMin;
	}

	public static void setPuissanceMin(int puissanceMin) {
		Unite.puissanceMin = puissanceMin;
	}

	public static int getCout() {
		return cout;
	}

	public static void setCout(int cout) {
		Unite.cout = cout;
	}

	public int getPrioriteAtt() {
		return prioriteAtt;
	}

	public static void setPrioriteAtt(int prioriteAtt) {
		Unite.prioriteAtt = prioriteAtt;
	}

	public static int getPrioriteDef() {
		return prioriteDef;
	}

	public static void setPrioriteDef(int prioriteDef) {
		Unite.prioriteDef = prioriteDef;
	}

	public  int getMouvement() {
		return mouvement;
	}

	public static void setMouvement(int mouvement) {
		Unite.mouvement = mouvement;
	}

}
