
public class Lancement_du_jeu {
	public static void main(String[] args) {
		Music Mu = new Music("music/Top 15 Zelda Songs.wav");
		Mu.loop();
		Menu M = new Menu(1600,900);
		M.AfficherMenu();
	}
}
