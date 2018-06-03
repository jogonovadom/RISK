import java.awt.Color;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

import edu.princeton.cs.introcs.StdDraw;
public class Game {
	Game suivant;
	int NJ = Menu.getNombreJoueur();
	public Game(int NJ) {
		this.NJ = NJ;
	}
	public void Game_Init() {
		ArrayList<Joueur> joueur = new ArrayList<Joueur>();
		for (int i = 1;i<NJ;i++) {
			joueur.add(new Joueur(i,null));
		}
		// on crée une liste de 42 nombres pour 42 territoires
		ArrayList NbrT = new ArrayList();
		for (int i=1; i<43;i++) {
			NbrT.add(i);
		}
		int cpt=1; // compteur permettant de switch les territoires
		if (NJ==2) { //si on a que 2 joueurs
			ArrayList TerritoireJ1 = new ArrayList();
			ArrayList TerritoireJ2 = new ArrayList();
			for (int i=1; i<43;i++) {
				if (cpt==1) { // on rempli la liste territoire du joueur 1
					int NbrTrandom=ThreadLocalRandom.current().nextInt(0, NbrT.size()); // on choisit un chiffre dans l'arraylist NbrT de manière random
					TerritoireJ1.add(NbrTrandom);
					NbrT.remove(NbrTrandom);
					cpt++;
				}
				else if (cpt==2) { // on rempli la liste territoire du joueur 2
					int NbrTrandom=ThreadLocalRandom.current().nextInt(0, NbrT.size());
					TerritoireJ2.add(NbrTrandom);
					NbrT.remove(NbrTrandom);
					cpt=1;
				}
			}
			TerritoireJ1.set(0, joueur);
			TerritoireJ2.set(1, joueur);
		}
		else if (NJ==3) { //si on a que 3 joueurs
			ArrayList TerritoireJ1 = new ArrayList();
			ArrayList TerritoireJ2 = new ArrayList();
			ArrayList TerritoireJ3 = new ArrayList();
			for (int i=1; i<43;i++) {
				if (cpt==1) { // on rempli la liste territoire du joueur 1
					int NbrTrandom=ThreadLocalRandom.current().nextInt(0, NbrT.size()); // on choisit un chiffre dans l'arraylist NbrT de manière random
					TerritoireJ1.add(NbrTrandom);
					NbrT.remove(NbrTrandom);
					cpt++;
				}
				else if (cpt==2) { // on rempli la liste territoire du joueur 2
					int NbrTrandom=ThreadLocalRandom.current().nextInt(0, NbrT.size());
					TerritoireJ2.add(NbrTrandom);
					NbrT.remove(NbrTrandom);
					cpt++;
				}
				else if (cpt==3) { // on rempli la liste territoire du joueur 3
					int NbrTrandom=ThreadLocalRandom.current().nextInt(0, NbrT.size());
					TerritoireJ3.add(NbrTrandom);
					NbrT.remove(NbrTrandom);
					cpt=1;
				}
			}
			TerritoireJ1.set(0, joueur);
			TerritoireJ2.set(1, joueur);
			TerritoireJ3.set(2, joueur);
		}
		else if (NJ==4) { //si on a que 4 joueurs
			ArrayList TerritoireJ1 = new ArrayList();
			ArrayList TerritoireJ2 = new ArrayList();
			ArrayList TerritoireJ3 = new ArrayList();
			ArrayList TerritoireJ4 = new ArrayList();
			for (int i=1; i<43;i++) {
				if (cpt==1) { // on rempli la liste territoire du joueur 1
					int NbrTrandom=ThreadLocalRandom.current().nextInt(0, NbrT.size()); // on choisit un chiffre dans l'arraylist NbrT de manière random
					TerritoireJ1.add(NbrTrandom);
					NbrT.remove(NbrTrandom);
					cpt++;
				}
				else if (cpt==2) { // on rempli la liste territoire du joueur 2
					int NbrTrandom=ThreadLocalRandom.current().nextInt(0, NbrT.size());
					TerritoireJ2.add(NbrTrandom);
					NbrT.remove(NbrTrandom);
					cpt++;
				}
				else if (cpt==3) { // on rempli la liste territoire du joueur 3
					int NbrTrandom=ThreadLocalRandom.current().nextInt(0, NbrT.size());
					TerritoireJ3.add(NbrTrandom);
					NbrT.remove(NbrTrandom);
					cpt++;
				}
				else if (cpt==4) { // on rempli la liste territoire du joueur 4
					int NbrTrandom=ThreadLocalRandom.current().nextInt(0, NbrT.size());
					TerritoireJ4.add(NbrTrandom);
					NbrT.remove(NbrTrandom);
					cpt=1;
				}
			}
			TerritoireJ1.set(0, joueur);
			TerritoireJ2.set(1, joueur);
			TerritoireJ3.set(2, joueur);
			TerritoireJ4.set(3, joueur);
		}
		else if (NJ==5) { //si on a que 5 joueurs
			ArrayList TerritoireJ1 = new ArrayList();
			ArrayList TerritoireJ2 = new ArrayList();
			ArrayList TerritoireJ3 = new ArrayList();
			ArrayList TerritoireJ4 = new ArrayList();
			ArrayList TerritoireJ5 = new ArrayList();
			for (int i=1; i<43;i++) {
				if (cpt==1) { // on rempli la liste territoire du joueur 1
					int NbrTrandom=ThreadLocalRandom.current().nextInt(0, NbrT.size()); // on choisit un chiffre dans l'arraylist NbrT de manière random
					TerritoireJ1.add(NbrTrandom);
					NbrT.remove(NbrTrandom);
					cpt++;
				}
				else if (cpt==2) { // on rempli la liste territoire du joueur 2
					int NbrTrandom=ThreadLocalRandom.current().nextInt(0, NbrT.size());
					TerritoireJ2.add(NbrTrandom);
					NbrT.remove(NbrTrandom);
					cpt++;
				}
				else if (cpt==3) { // on rempli la liste territoire du joueur 3
					int NbrTrandom=ThreadLocalRandom.current().nextInt(0, NbrT.size());
					TerritoireJ3.add(NbrTrandom);
					NbrT.remove(NbrTrandom);
					cpt++;
				}
				else if (cpt==4) { // on rempli la liste territoire du joueur 4
					int NbrTrandom=ThreadLocalRandom.current().nextInt(0, NbrT.size());
					TerritoireJ4.add(NbrTrandom);
					NbrT.remove(NbrTrandom);
					cpt++;
				}
				else if (cpt==5) { // on rempli la liste territoire du joueur 5
					int NbrTrandom=ThreadLocalRandom.current().nextInt(0, NbrT.size());
					TerritoireJ5.add(NbrTrandom);
					NbrT.remove(NbrTrandom);
					cpt=1;
				}
			}
			TerritoireJ1.set(0, joueur);
			TerritoireJ2.set(1, joueur);
			TerritoireJ3.set(2, joueur);
			TerritoireJ4.set(3, joueur);
			TerritoireJ5.set(4, joueur);
		}
		else if (NJ==6) { //si on a que 6 joueurs
			ArrayList TerritoireJ1 = new ArrayList();
			ArrayList TerritoireJ2 = new ArrayList();
			ArrayList TerritoireJ3 = new ArrayList();
			ArrayList TerritoireJ4 = new ArrayList();
			ArrayList TerritoireJ5 = new ArrayList();
			ArrayList TerritoireJ6 = new ArrayList();
			for (int i=1; i<43;i++) {
				if (cpt==1) { // on rempli la liste territoire du joueur 1
					int NbrTrandom=ThreadLocalRandom.current().nextInt(0, NbrT.size()); // on choisit un chiffre dans l'arraylist NbrT de manière random
					TerritoireJ1.add(NbrTrandom);
					NbrT.remove(NbrTrandom);
					cpt++;
				}
				else if (cpt==2) { // on rempli la liste territoire du joueur 2
					int NbrTrandom=ThreadLocalRandom.current().nextInt(0, NbrT.size());
					TerritoireJ2.add(NbrTrandom);
					NbrT.remove(NbrTrandom);
					cpt++;
				}
				else if (cpt==3) { // on rempli la liste territoire du joueur 3
					int NbrTrandom=ThreadLocalRandom.current().nextInt(0, NbrT.size());
					TerritoireJ3.add(NbrTrandom);
					NbrT.remove(NbrTrandom);
					cpt++;
				}
				else if (cpt==4) { // on rempli la liste territoire du joueur 4
					int NbrTrandom=ThreadLocalRandom.current().nextInt(0, NbrT.size());
					TerritoireJ4.add(NbrTrandom);
					NbrT.remove(NbrTrandom);
					cpt++;
				}
				else if (cpt==5) { // on rempli la liste territoire du joueur 5
					int NbrTrandom=ThreadLocalRandom.current().nextInt(0, NbrT.size());
					TerritoireJ5.add(NbrTrandom);
					NbrT.remove(NbrTrandom);
					cpt++;
				}
				else if (cpt==6) { // on rempli la liste territoire du joueur 6
					int NbrTrandom=ThreadLocalRandom.current().nextInt(0, NbrT.size());
					TerritoireJ6.add(NbrTrandom);
					NbrT.remove(NbrTrandom);
					cpt=1;
				}
			}
			TerritoireJ1.set(0, joueur);
			TerritoireJ2.set(1, joueur);
			TerritoireJ3.set(2, joueur);
			TerritoireJ4.set(3, joueur);
			TerritoireJ5.set(4, joueur);
			TerritoireJ6.set(5, joueur);
		}
	}
}
