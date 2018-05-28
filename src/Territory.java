import edu.princeton.cs.introcs.StdDraw;
public class Territory {

	Territory suivant;
	private double Y;
	private double X;
	private int ID;
	private String Nom;
	
	public Territory(String Nom, int ID, double X, double Y){
		this.Nom=Nom;
		this.ID=ID;
		this.X=X;
		this.Y=Y;
	}
	
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public double getY() {
		return Y;
	}
	public void setY(double y) {
		Y = y;
	}
	public double getX() {
		return X;
	}
	public void setX(double x) {
		X = x;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}
	
}