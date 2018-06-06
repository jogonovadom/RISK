import java.awt.Font;

import edu.princeton.cs.introcs.StdDraw;

public class ZaperMenu {
	ZaperMenu suivant;
	int largeur;
    int longueur;
    static int nombreJoueur;
    
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
    	Game G = new Game(2);
    	G.Afficher_Plateau();
    	G.gameInit();
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



	public static int getnombreJoueur() {
		return nombreJoueur;
	}



	public static void setnombreJoueur(int nombreJoueur) {
		nombreJoueur = nombreJoueur;
	}
	
}
