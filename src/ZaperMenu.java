import java.awt.Font;

import edu.princeton.cs.introcs.StdDraw;

public class ZaperMenu {
	ZaperMenu suivant;
	int largeur;
    int longueur;
    
    
    public ZaperMenu(int largeur, int longueur) {
		this.largeur = largeur;
		this.longueur = longueur;
	}
	
   
    
    public void AfficherZaperMenu() {
    	 
    	boolean Etat = true;
    	
    	StdDraw.setCanvasSize(1600,900);
    	StdDraw.setXscale(0,1600);
    	StdDraw.setYscale(0,900);
    	Font font = new Font("SansSerif",Font.BOLD,30);
    	StdDraw.setFont(font);
    	Plateau_du_jeu.AfficherPlateau();
    	}
    
	public ZaperMenu getSuivant() {
		return suivant;
	}

	public void setSuivant(ZaperMenu suivant) {
		this.suivant = suivant;
	}

	public int getLargeur() {
		return largeur;
	}

	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}

	public int getLongueur() {
		return longueur;
	}

	public void setLongueur(int longueur) {
		this.longueur = longueur;
	}

}
