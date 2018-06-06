import java.awt.Color;
import java.util.ArrayList;
public class Joueur {
	private int IDJoueur;
	private ArrayList<Integer> TerritoiresControles;
	private int NombreUnitesControlees;
	public Joueur(int IDJoueur, ArrayList<Integer> TerritoiresControles, int NombreUnitesControlees) {
		this.IDJoueur=IDJoueur;
		this.TerritoiresControles = TerritoiresControles;
		this.NombreUnitesControlees = NombreUnitesControlees;
	}
	public int getIDJoueur() {
		return IDJoueur;
	}
	public void setIDJoueur(int IDJoueur) {
		IDJoueur = IDJoueur;
	}
	public ArrayList<Integer> getTerritoiresControles() {
		return TerritoiresControles;
	}
	public void setTerritoiresControles(ArrayList<Integer> territoiresControles) {
		TerritoiresControles = territoiresControles;
	}
	public int getNombreUnitesControlees() {
		return NombreUnitesControlees;
	}
	public void setNombreUnitesControlees(int nombreUnitesControlees) {
		NombreUnitesControlees = nombreUnitesControlees;
	}
}
