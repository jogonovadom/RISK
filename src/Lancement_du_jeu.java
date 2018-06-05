
public class Lancement_du_jeu {
	public static void main(String[] args) {
		
		Music musique1 = new Music("Musique1.wav");
		musique1.loop(); //loop = en boucle
		
		Menu M = new Menu(1600,900);
		M.AfficherMenu();
		
	}
}
