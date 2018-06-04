import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import edu.princeton.cs.introcs.StdDraw;

public class Game {
	Game suivant;
	int NJ = Menu.getIDJoueur();
	public Game(int NJ) {
		this.NJ=NJ;
	}
	public void Game_Init() {
		ArrayList<ArrayList<Integer>> ArrayListTerritoire = new ArrayList<ArrayList<Integer>>();
		ArrayList<Joueur> joueur = new ArrayList<Joueur>();
		for (int i=0; i<NJ;i++) {
			joueur.add(new Joueur(i,null));
			ArrayListTerritoire.add(new ArrayList<Integer>());
			System.out.println(joueur);
			System.out.println(ArrayListTerritoire);
		}
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
		System.out.println(ArrayListTerritoire.get(0));
		System.out.println(ArrayListTerritoire.get(1));
	}
}
