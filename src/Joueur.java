import java.awt.Color;
import java.util.ArrayList;
public class Joueur {
	private int NumeroJoueur;
	private ArrayList TerritoiresControles;
	public Joueur(int NumeroJoueur, ArrayList TerritoiresControles) {
		this.NumeroJoueur=NumeroJoueur;
		this.TerritoiresControles = TerritoiresControles;
	}
	public int getNumeroJoueur() {
		return NumeroJoueur;
	}
	public void setNumeroJoueur(int numeroJoueur) {
		NumeroJoueur = numeroJoueur;
	}
	public ArrayList getTerritoiresControles() {
		return TerritoiresControles;
	}
	public void setTerritoiresControles(ArrayList territoiresControles) {
		TerritoiresControles = territoiresControles;
	}
	
}
