import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

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
			joueur.add(new Joueur(i,null,0));
			ArrayListTerritoire.add(new ArrayList<Integer>());
		}
		repartitionTerritoires(ArrayListTerritoire, joueur);
		placerLesPremieresUnites();
		ArrayList<Integer> PremieresUnitesAPlacer=repartitionTroupes(ArrayListTerritoire, joueur);
		afficherLesUnites(informationsUnites());
		for (int i=0;i<=NJ-1;i++) {
			placerDesUnites(PremieresUnitesAPlacer, i, joueur);
			afficherLesUnites(informationsUnites());
		}
		int TourJoueur = 0;
		int i=0;
		while (!verifierVictoire(joueur)) {
			deroulementDunTour(i);
		}
		deroulementDunTour(2);
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
	public static ArrayList<Integer> repartitionTroupes(ArrayList<ArrayList<Integer>> ArrayListTerritoire, ArrayList<Joueur> joueur) {
		ArrayList<Integer> UnitesControlees = new ArrayList<Integer>();
		for (int i=0;i<=NJ-1;i++){
			joueur.get(i).setNombreUnitesControlees(40-5*(NJ-2) - ArrayListTerritoire.get(i).size());
			UnitesControlees.add(joueur.get(i).getNombreUnitesControlees());
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
	public void placerDesUnites(ArrayList<Integer> unitesAPlacer, int quelJoueur, ArrayList<Joueur> joueur) {
		//cette fonction permet de placer des troupes en donnant le numéro du joueur
		int NombreUniteRestantes = joueur.get(quelJoueur).getNombreUnitesControlees();
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
					TerritoireChoisi.addTroupes(new Soldat());
					NombreUniteRestantes=NombreUniteRestantes-1;
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
	public boolean verifierVictoire(ArrayList<Joueur> joueur) {
		for (int i=0;i<=NJ-1;i++) {
			if (joueur.get(i).getTerritoiresControles().size()==42) {
				return true;
			}
		}
		return false;
	}
	public void deroulementDunTour(int i) {
		
	}
}
