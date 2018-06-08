import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;
public class Joueur {
	private int IDJoueur;
	private ArrayList<Integer> TerritoiresControles;
	private int NombreUnitesControlees;
	private int TerritoiresCaptures;
	
	public Joueur(int IDJoueur, ArrayList<Integer> TerritoiresControles, int NombreUnitesControlees, int TerritoiresCaptures) {
		this.IDJoueur=IDJoueur;
		this.TerritoiresControles = TerritoiresControles;
		this.NombreUnitesControlees = NombreUnitesControlees;
		this.TerritoiresCaptures = TerritoiresCaptures;
	}
	public static void placerDesUnites(int unitesAPlacer, int quelJoueur, ArrayList<Joueur> joueur) {
		//cette fonction permet de placer des troupes en donnant le numéro du joueur
		int NombreUniteRestantes = unitesAPlacer;
		ArrayList<String> NomsTerritoiresControlees = new ArrayList<String>() ;
		int LongueurListTerritoiresControlees = joueur.get(quelJoueur).getTerritoiresControles().size();
		for (int i=0; i<LongueurListTerritoiresControlees;i++) {
			int Territoirei = joueur.get(quelJoueur).getTerritoiresControles().get(i);
			System.out.println("territoire contrôlé n° " + joueur.get(quelJoueur).getTerritoiresControles().get(i) + ": " + Territory.getTerritoryFromID(Territoirei).getNom());
		}
		while (NombreUniteRestantes !=0) {
			System.out.println("Le joueur " + (quelJoueur+1) + " doit placer ses " + NombreUniteRestantes +" unités restantes");
			System.out.println("Sur quel territoire voulez vous placer des troupes ?");
			System.out.println("entrez le numéro du territoire");
			Scanner scTerritoire = new Scanner(System.in);
			Territory TerritoireChoisi;
			int IDTerritoireChoisi = scTerritoire.nextInt();
			boolean PossederTerritoire=false;
			for (int i=0;i<joueur.get(quelJoueur).getTerritoiresControles().size();i++) {
				if (IDTerritoireChoisi==joueur.get(quelJoueur).getTerritoiresControles().get(i)) {
					PossederTerritoire=true;
				}
			}
			if (PossederTerritoire==true) {
				TerritoireChoisi=Territory.getTerritoryFromID(IDTerritoireChoisi);
				int NombreSoldatChoisi;
				Scanner scNombreSoldat = new Scanner(System.in);
				System.out.println("Combien de Soldat voulez vous?");
				NombreSoldatChoisi = scTerritoire.nextInt(); 
				int NombreCavalierChoisi;
				Scanner scNombreCavalier = new Scanner(System.in);
				System.out.println("Combien de Cavalier voulez vous?");
				NombreCavalierChoisi = scTerritoire.nextInt();
				int NombreCanonChoisi;
				Scanner scNombreCanon = new Scanner(System.in);
				System.out.println("Combien de Canon voulez vous?");
				NombreCanonChoisi = scTerritoire.nextInt();
				for (int i=1; i<=NombreSoldatChoisi;i++) {
					if (NombreUniteRestantes>=1) {
						TerritoireChoisi.addTroupes(new Soldat());
						NombreUniteRestantes=NombreUniteRestantes-1;
					}
					else {
						System.out.println("Vous n'avez pas assez de place pour un soldat, il vous reste" + NombreUniteRestantes + "troupes");
					}
				}
				for (int i=1; i<=NombreCavalierChoisi;i++) {
					if (NombreUniteRestantes>=3) {
						TerritoireChoisi.addTroupes(new Cavalier());
						NombreUniteRestantes=NombreUniteRestantes-3;
					}
					else {
						System.out.println("Vous n'avez pas assez de place pour un cavalier, il vous reste" + NombreUniteRestantes + "troupes");
					}
				}
				for (int i=1; i<=NombreCanonChoisi;i++) {
					if (NombreUniteRestantes>=7) {
						TerritoireChoisi.addTroupes(new Canon());
						NombreUniteRestantes=NombreUniteRestantes-7;
					}
					else {
						System.out.println("Vous n'avez pas assez de place pour un canon, il vous reste" + NombreUniteRestantes + "troupes");
					}
				}
			}
			else {
				System.out.println("ce territoire ne vous appartient pas");
			}
		}
	}
	public static int renfort(int i, ArrayList<Joueur> joueur) {
		int nombreRenfort=0;
		int cptAmeriqueNord=0;
		int cptAmeriqueSud=0;
		int cptEU=0;
		int cptAfrique=0;
		int cptAsie=0;
		int cptOceanie=0;
		nombreRenfort+=joueur.get(i).getTerritoiresControles().size()/3;
		for (int j : joueur.get(i).getTerritoiresControles()) {
			if ((j>=1) && (j<=9)) {
				cptAmeriqueNord ++;
			}
		}
		if (cptAmeriqueNord==9) {
			nombreRenfort+=4;
		}
		for (int j : joueur.get(i).getTerritoiresControles()) {
			if ((j>=10) && (j<=13)) {
				cptAmeriqueSud ++;
			}
		}
		if (cptAmeriqueSud==4) {
			nombreRenfort+=2;
		}
		for (int j : joueur.get(i).getTerritoiresControles()) {
			if ((j>=14) && (j<=20)) {
				cptEU ++;
			}
		}
		if (cptEU==7) {
			nombreRenfort+=3;
		}
		for (int j : joueur.get(i).getTerritoiresControles()) {
			if ((j>=21) && (j<=26)) {
				cptAfrique ++;
			}
		}
		if (cptAfrique==6) {
			nombreRenfort+=3;
		}
		for (int j : joueur.get(i).getTerritoiresControles()) {
			if ((j>=27) && (j<=38)) {
				cptAsie ++;
			}
		}
		if (cptAsie==12) {
			nombreRenfort+=6;
		}
		for (int j : joueur.get(i).getTerritoiresControles()) {
			if ((j>=39) && (j<=42)) {
				cptOceanie ++;
			}
		}
		if (cptOceanie==4) {
			nombreRenfort+=2;
		}
		for (int j=0;i<joueur.get(i).getTerritoiresCaptures();j++) {
			int renfortRandom=(int) Math.random()*(2 - 1);
			if (renfortRandom==1) {
				nombreRenfort+=1;
			}
		}
		return nombreRenfort;
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
	public int getTerritoiresCaptures() {
		return TerritoiresCaptures;
	}
	public void setTerritoiresCaptures(int territoiresCaptures) {
		TerritoiresCaptures = territoiresCaptures;
	}
}
