import java.util.ArrayList;
import edu.princeton.cs.introcs.StdDraw;
import java.util.ArrayList;
public class Territory {
	public double Y;
	public double X;
	public int IDterritory;
	public String Nom;
	public ArrayList<Unite> Troupes;
	public Territory(String Nom, int IDterritory, double X, double Y, ArrayList<Unite> Troupes){
		this.Nom=Nom;
		this.IDterritory=IDterritory;
		this.X=X;
		this.Y=Y;
		this.Troupes=Troupes;
	}
	static Territory Alaska = new Territory("Alaska",1,125.5,711.5, null);
	static Territory TNO = new Territory("Territoire du Nord Ouest",2,386,731, null);
	static Territory Alberta = new Territory("Alberta",3,221,666, null);
	static Territory Ontario = new Territory("Ontario",4,382,638, null);
	static Territory EOuest = new Territory("Etat de lOuest",5,286,630, null);
	static Territory AC = new Territory("Amerique centrale",6,234,538, null);
	static Territory EE = new Territory("Etat de lEst",7,368,598, null);
	static Territory Quebec = new Territory("Quebec",8,451,698, null);
	static Territory Groenland = new Territory("Groenland",9,515,710, null);
	static Territory Venezuela = new Territory("Venezuela",10,363,412, null);
	static Territory Bresil = new Territory("Bresil",11,539,351, null);
	static Territory Perou = new Territory("Perou",12,355,364, null);
	static Territory Argentine = new Territory("Argentine",13,435,137, null);
	static Territory Islande = new Territory("Islande",14,698,764, null);
	static Territory GB = new Territory("Grande-Bretagne",15,612,637, null);
	static Territory EOccidentale = new Territory("Europe occidentale",16,664,569, null);
	static Territory EN = new Territory("Europe Nord",17,768,662, null);
	static Territory Scandinavie = new Territory("Scandinavie",18,781,740, null);
	static Territory ES = new Territory("EU Sud",19,822,578, null);
	static Territory Ukraine = new Territory("Ukraine",20,914,697, null);
	static Territory AN = new Territory("Afrique du Nord",21,698,450, null);
	static Territory Egypte = new Territory("Egypte",22,816,484, null);
	static Territory AE = new Territory("Afrique de l�Est",23,980,361, null);
	static Territory Congo = new Territory("Congo",24,812,317, null);
	static Territory AS = new Territory("Afrique du Sud",25,856,149, null);
	static Territory Madagascar = new Territory("Madagascar",26,1015,179, null);
	static Territory MO = new Territory("Moyen-Orient",27,1017,451, null);
	static Territory Inde = new Territory("Inde",28,1138,450, null);
	static Territory Afghanistan = new Territory("Afghanistan",29,1019,588, null);
	static Territory Oural = new Territory("Oural",30,1012,715, null);
	static Territory Siberie = new Territory("Siberie",31,1080,754, null);
	static Territory Yakoutie = new Territory("Yakoutie",32,1183,742, null);
	static Territory Tchita = new Territory("Tchita",33,1176,680, null);
	static Territory Mongolie = new Territory("Mongolie",34,1323,620, null);
	static Territory Chine = new Territory("Chine",35,1310,534, null);
	static Territory Siam = new Territory("Siam",36,1252,443, null);
	static Territory Kamtchatka = new Territory("Kamtchatka",37,1410,687, null);
	static Territory Japon = new Territory("Japon",38,1427,575, null);
	static Territory Indonesie = new Territory("Indonesie",39,1366,421, null);
	static Territory NG = new Territory("Nouvelle-Guinee",40,1483,384, null);
	static Territory AOccidentale = new Territory("Australie occidentale",41,1291,235, null);
	static Territory AOrientale = new Territory("Australie Orientale",42,1406,211, null);
	
	public static Territory getTerritoryFromID(int i) {
		if (i==1) {
			return Alaska;
		}
		else if (i==2) {
			return TNO;
		}
		else if (i==3) {
			return Alberta;
		}
		else if (i==4) {
			return Ontario;
		}
		else if (i==5) {
			return EOuest;
		}
		else if (i==6) {
			return AC;
		}
		else if (i==7) {
			return EE;
		}
		else if (i==8) {
			return Quebec;
		}
		else if (i==9) {
			return Groenland;
		}
		else if (i==10) {
			return Venezuela;
		}
		else if (i==11) {
			return Bresil;
		}
		else if (i==12) {
			return Perou;
		}
		else if (i==13) {
			return Argentine;
		}
		else if (i==14) {
			return Islande;
		}
		else if (i==15) {
			return GB;
		}
		else if (i==16) {
			return EOccidentale;
		}
		else if (i==17) {
			return EN;
		}
		else if (i==18) {
			return Scandinavie;
		}
		else if (i==19) {
			return ES;
		}
		else if (i==20) {
			return Ukraine;
		}
		else if (i==21) {
			return AN;
		}
		else if (i==22) {
			return Egypte;
		}
		else if (i==23) {
			return AE;
		}
		else if (i==24) {
			return Congo;
		}
		else if (i==25) {
			return AS;
		}
		else if (i==26) {
			return Madagascar;
		}
		else if (i==27) {
			return MO;
		}
		else if (i==28) {
			return Inde;
		}
		else if (i==29) {
			return Afghanistan;
		}
		else if (i==30) {
			return Oural;
		}
		else if (i==31) {
			return Siberie;
		}
		else if (i==32) {
			return Yakoutie;
		}
		else if (i==33) {
			return Tchita;
		}
		else if (i==34) {
			return Mongolie;
		}
		else if (i==35) {
			return Chine;
		}
		else if (i==36) {
			return Siam;
		}
		else if (i==37) {
			return Kamtchatka;
		}
		else if (i==38) {
			return Japon;
		}
		else if (i==39) {
			return Indonesie;
		}
		else if (i==40) {
			return NG;
		}
		else if (i==41) {
			return AOccidentale;
		}
		else {
			return AOrientale;
		}
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

	public int getIDterritory() {
		return IDterritory;
	}

	public void setIDterritory(int iDterritory) {
		IDterritory = iDterritory;
	}
	public ArrayList<Unite> getTroupes() {
		return Troupes;
	}
	public void setTroupes(ArrayList<Unite> troupes) {
		Troupes = troupes;
	}
	public void addTroupes(Unite troupes) {
		getTroupes().add(troupes);
	}
}