import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import edu.princeton.cs.introcs.StdDraw;

public class Game {
	Game suivant;
	int NJ = Menu.getnombreJoueur();
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
		repartitionTroupes(joueur);
		System.out.println(ArrayListTerritoire.get(0));
		System.out.println(joueur.get(0).getNombreUnitesControlees());
		System.out.println(Territory.getTerritoryFromID(1).getNom());
		placerLesPremieresUnites();
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
	public void repartitionTroupes(ArrayList<Joueur> joueur) {
		if (NJ==2) {
			joueur.get(0).setNombreUnitesControlees(19);
			joueur.get(1).setNombreUnitesControlees(19);
		}
		if (NJ==3) {
			joueur.get(0).setNombreUnitesControlees(21);
			joueur.get(1).setNombreUnitesControlees(21);
			joueur.get(2).setNombreUnitesControlees(21);
		}
		if (NJ==4) {
			joueur.get(0).setNombreUnitesControlees(30);
			joueur.get(1).setNombreUnitesControlees(30);
			joueur.get(2).setNombreUnitesControlees(30);
			joueur.get(3).setNombreUnitesControlees(30);
		}
		if (NJ==5) {
			joueur.get(0).setNombreUnitesControlees(25);
			joueur.get(1).setNombreUnitesControlees(25);
			joueur.get(2).setNombreUnitesControlees(25);
			joueur.get(3).setNombreUnitesControlees(25);
			joueur.get(4).setNombreUnitesControlees(25);
		}
		if (NJ==6) {
			joueur.get(0).setNombreUnitesControlees(13);
			joueur.get(2).setNombreUnitesControlees(13);
			joueur.get(3).setNombreUnitesControlees(13);
			joueur.get(4).setNombreUnitesControlees(13);
			joueur.get(5).setNombreUnitesControlees(13);
			joueur.get(6).setNombreUnitesControlees(13);
		}
	}
	public void placerLesPremieresUnites() {
		for (int i=1; i<43; i++) {
			ArrayList<Unite> armeeTemp =  new ArrayList<Unite>();
			armeeTemp.add(new Soldat());
			Territory.getTerritoryFromID(i).setTroupes(armeeTemp);
			System.out.println(Territory.getTerritoryFromID(i).getTroupes());
		}
	}
	public void Afficher_Les_Unites() {
		
	}
}
