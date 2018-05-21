
public class Unité {
	
	protected int puissanceMax;
	protected int puissanceMin;
	protected int coût;
	protected int prioriteAtt; //priorité d'attaque
	protected int prioriteDef; //priorité defensive
	protected int mouvement; 
	
	
    public Unité(int puissanceMax, int puissanceMin, int coût, int prioriteAtt, int prioriteDef, int mouvement) {
		super();
		this.puissanceMax = puissanceMax;
		this.puissanceMin = puissanceMin;
		this.coût = coût;
		this.prioriteAtt = prioriteAtt;
		this.prioriteDef = prioriteDef;
		this.mouvement = mouvement;
	}
    
   
	
}
