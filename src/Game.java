import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import javax.swing.JOptionPane;

import edu.princeton.cs.introcs.StdDraw;
public class Game {
	Game suivant;
	static int NJ =2;
	public Game(int NJ) {
		this.NJ=NJ;
	}
	
	public void Afficher_Plateau() {
		if (NJ==2) {
			StdDraw.picture(800, 450, "Images/Risk_game_map_complete.png");
		}
		else if (NJ==3) {
			StdDraw.picture(800, 450, "Images/Risk_game_map_complete.png");
		}
		else if (NJ==4) {
			StdDraw.picture(800, 450, "Images/Risk_game_map_complete.png");
		}
		else if (NJ==5) {
			StdDraw.picture(800, 450, "Images/Risk_game_map_complete.png");
		}
		else if (NJ==6) {
			StdDraw.picture(800, 450, "Images/Risk_game_map_complete.png");
		}
	}
	public void gameInit() {
		ArrayList<ArrayList<Integer>> ArrayListTerritoire = new ArrayList<ArrayList<Integer>>();
		ArrayList<Joueur> joueur = new ArrayList<Joueur>();
		for (int i=0; i<NJ;i++) {
			joueur.add(new Joueur(i,null,0,0));
			ArrayListTerritoire.add(new ArrayList<Integer>());
		}
		repartitionTerritoires(ArrayListTerritoire, joueur);
		placerLesPremieresUnites();
		int PremieresUnitesAPlacer=repartitionTroupes(ArrayListTerritoire, joueur);
		afficherLesUnites(informationsUnites());
		for (int i=0;i<=NJ-1;i++) {
			Joueur.placerDesUnites(PremieresUnitesAPlacer, i, joueur);
			afficherLesUnites(informationsUnites());
		}
		deroulementDuJeu(joueur);
	}
	public void repartitionTerritoires(ArrayList<ArrayList<Integer>> ArrayListTerritoire, ArrayList<Joueur> joueur) {
		//répartition des territoires
		
		ArrayList<Integer> ListeT = new ArrayList<Integer>();
		for (int i=1; i<=42;i++) {
			ListeT.add(i);
		}
		Collections.shuffle(ListeT);
		int cpt=0;
		for (int i : ListeT) {
			if (cpt>=NJ) {
				cpt=0;
			}
			ArrayListTerritoire.get(cpt).add(i);
			cpt++;
		}
		for (int i=0; i<NJ;i++) {
			joueur.get(i).setTerritoiresControles(ArrayListTerritoire.get(i));
		}
	}
	public static int repartitionTroupes(ArrayList<ArrayList<Integer>> ArrayListTerritoire, ArrayList<Joueur> joueur) {
		int UnitesControlees=0;
		for (int i=0;i<=NJ-1;i++){
			joueur.get(i).setNombreUnitesControlees(40-5*(NJ-2) - ArrayListTerritoire.get(i).size());
			UnitesControlees=joueur.get(i).getNombreUnitesControlees();
		}
		return UnitesControlees;
	}
	public void placerLesPremieresUnites() {
		for (int i=1; i<43; i++) {
			ArrayList<Unite> armeeTemp =  new ArrayList<Unite>();
			armeeTemp.add(new Soldat());
			Territory.getTerritoryFromID(i).setTroupes(armeeTemp);
		}
	}
	
	public ArrayList<int []> informationsUnites() {
		ArrayList<int []> ArrayListInfoUnite = new ArrayList<int []>();
		int [] tabSoldat = new int[42];
		int [] tabCavalier = new int[42];
		int [] tabCanon = new int[42];
		int [] textActuelCavalier=new int[42];
		int [] textActuelSoldat=new int[42];
		int [] textActuelCanon=new int[42];
		for (int i = 1;i<=42;i++) {
			textActuelCavalier[i-1]=tabCavalier[i-1];
			textActuelSoldat[i-1]=tabSoldat[i-1];
			textActuelCanon[i-1]=tabCanon[i-1];
		}
		for (int i = 1;i<=42;i++) {	
		int NombreSoldat=0;
		int NombreCavalier=0;
		int NombreCanon=0;
			for (int j = 0; j<Territory.getTerritoryFromID(i).getTroupes().size();j++) {
				int mouvement = Territory.getTerritoryFromID(i).getTroupes().get(j).getMouvement();
				if (mouvement==2) {
					NombreSoldat=NombreSoldat+1;
				}
				else if (mouvement==3) {
					NombreCavalier=NombreCavalier+1;
				}
				else if (mouvement==1) {
					NombreCanon=NombreCanon+1;
				}
			}
			tabSoldat[i-1]=NombreSoldat;
			tabCavalier[i-1]=NombreCavalier;
			tabCanon[i-1]=NombreCanon;
		}
		ArrayListInfoUnite.add(tabSoldat);
		ArrayListInfoUnite.add(tabCavalier);
		ArrayListInfoUnite.add(tabCanon);
		ArrayListInfoUnite.add(textActuelSoldat);
		ArrayListInfoUnite.add(textActuelCavalier);
		ArrayListInfoUnite.add(textActuelCanon);
		
		return ArrayListInfoUnite;
	}
	public void afficherLesUnites(ArrayList<int []> ArrayListInfoUnite) {
		Font fontUnites = new Font("SansSerif",Font.BOLD,15);
		StdDraw.setFont();
		ArrayListInfoUnite = informationsUnites();
		int [] tabSoldat = ArrayListInfoUnite.get(0);
		int [] tabCavalier = ArrayListInfoUnite.get(1);
		int [] tabCanon = ArrayListInfoUnite.get(2);
		int [] textActuelSoldat = ArrayListInfoUnite.get(3);
		int [] textActuelCavalier = ArrayListInfoUnite.get(4);
		int [] textActuelCanon = ArrayListInfoUnite.get(5);
		for (int i=1;i<=42;i++) {
			double Xi;
			double Yi;
			Xi=Territory.getTerritoryFromID(i).getXcavalier();
			Yi=Territory.getTerritoryFromID(i).getYcavalier();
			StdDraw.setPenColor(StdDraw.WHITE);
			StdDraw.text(Xi, Yi-3, String.valueOf(textActuelCavalier[i-1])); //afficher le numéro du cavalier
			StdDraw.text(Xi -26 , Yi-3, String.valueOf(textActuelSoldat[i-1])); //afficher le numéro du soldat
			StdDraw.text(Xi + 26, Yi-3, String.valueOf(textActuelCanon[i-1])); //afficher le numéro du canon
			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.text(Xi, Yi-3, String.valueOf(tabCavalier[i-1])); //afficher le numéro du cavalier
			StdDraw.text(Xi -26 , Yi-3, String.valueOf(tabSoldat[i-1])); //afficher le numéro du soldat
			StdDraw.text(Xi + 26, Yi-3, String.valueOf(tabCanon[i-1])); //afficher le numéro du canon
		}
	}
	public static boolean verifierVictoire(ArrayList<Joueur> joueur) {
		for (int i=0;i<NJ;i++) {
			if (joueur.get(i).getTerritoiresControles().size()==42) {
				return true;
			}
		}
		return false;
	}
	public void deroulementDuJeu(ArrayList<Joueur> joueur) {
		int TourJoueur = 0;
		int cptTempo=0;
		while (!verifierVictoire(joueur)) {
			if (cptTempo==0) {
				int RenfortAPlacer=Joueur.renfort(TourJoueur,joueur);
				Joueur.placerDesUnites(RenfortAPlacer, TourJoueur, joueur);
				joueur.get(TourJoueur).setTerritoiresCaptures(0);
				cptTempo++;
			}
			else {
				JOptionPane fenetreSelectionMonTerritoire;
				JOptionPane fenetreSelectionTerritoireAdverse;
				int numeroMonTerritoire=0;
				int numeroTerritoireAdverse=0;
				while (cptTempo==1) {
					double Xm=StdDraw.mouseX();
    					double Ym=StdDraw.mouseY();
    					if ((Xm>=465)&&(Xm<626)&&(Ym>843)&&(Ym<886)) {
    						if (StdDraw.isMousePressed()) {
    							fenetreSelectionMonTerritoire = new JOptionPane();
    							fenetreSelectionMonTerritoire.showMessageDialog(null, "Selectionne ton territoire", "Territoire qui va attaquer", JOptionPane.INFORMATION_MESSAGE);
    							cptTempo=2;
    						}
    					}
				}
				while (cptTempo==2) {
					double Xm=StdDraw.mouseX();
					double Ym=StdDraw.mouseY();
					int numeroTerritoireSelectionne=getTerritoryIDAvecClick(Xm,Ym);
					if (numeroTerritoireSelectionne!=0) {
						fenetreSelectionTerritoireAdverse = new JOptionPane();
						fenetreSelectionTerritoireAdverse.showMessageDialog(null, "Tu as sélectionné le territoire " + Territory.getTerritoryFromID(numeroTerritoireSelectionne).getNom() + "selectionne maintenant le territoire adverse", "Territoire a attaquer", JOptionPane.INFORMATION_MESSAGE);
						numeroMonTerritoire=numeroTerritoireSelectionne;
					cptTempo=3;
					}
				}
				while (cptTempo==3) {
					double Xm=StdDraw.mouseX();
					double Ym=StdDraw.mouseY();
					int numeroTerritoireSelectionne=getTerritoryIDAvecClick(Xm,Ym);
					if (numeroTerritoireSelectionne!=0) {
						numeroTerritoireAdverse=numeroTerritoireSelectionne;
						Fenetre F = new Fenetre(numeroMonTerritoire,numeroTerritoireAdverse);
					}
    				}
			}
		}
	}
	public int getTerritoryIDAvecClick(double X, double Y) {
		for (int i=1;i<42;i++) {
			if ((X>Territory.getTerritoryFromID(i).getXterritory()-10)&&(X<Territory.getTerritoryFromID(i).getXterritory()+10)) {
				if ((Y>Territory.getTerritoryFromID(i).getYterritory()-10)&&(Y<Territory.getTerritoryFromID(i).getYterritory()+10)) {
					if (StdDraw.isMousePressed()) {
						return Territory.getTerritoryFromID(i).getIDterritory();
					}
				}
			}
		}
		return 0;
	}
}
