public class Parametre {

	//attributs de la classe
	Parametre suivant;
	private double Y;
	private double X;
	
	public Parametre( double X, double Y){
		this.X=X;
		this.Y=Y;
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
}
