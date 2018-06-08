import java.util.ArrayList;
import edu.princeton.cs.introcs.StdDraw;
import java.util.ArrayList;
public class Territory {
	public double Y;
	public double X;
	public int IDterritory;
	public String Nom;
	public ArrayList<Unite> Troupes;
	public double Xcavalier;
	public double Ycavalier;
	public Territory(String Nom, int IDterritory, double X, double Y, double Xcavalier, double Ycavalier, ArrayList<Unite> Troupes, int [] TerritoiresAdj){
		this.Nom=Nom;
		this.IDterritory=IDterritory;
		this.X=X;
		this.Y=Y;
		this.Troupes=Troupes;
		this.Xcavalier=Xcavalier;
		this.Ycavalier=Ycavalier;
	}
	static int [] adjAlaska = {2,3};
	static int [] adjTno = {1,2,4,9};
	static int [] adjAlberta = {1,3,4,5,7};
	static int [] adjOntario = {2,3,5,7,8,9};
	static int [] adjEouest = {3,4,6,7};
	static int [] adjAc = {5,7,10};
	static int [] adjEe = {3,4,5,6,8};
	static int [] adjQuebec = {4,7,9};
	static int [] adjGroenland = {2,4,8,14};
	static int [] adjVenezuela = {6,11,12};
	static int [] adjBresil = {10,12,13,21};
	static int [] adjPerou = {10,11,13};
	static int [] adjArgentine = {11,12};
	static int [] adjIslande = {9,15,18};
	static int [] adjGb = {14,17,18};
	static int [] adjEo = {17,19};
	static int [] adjEn = {15,16,17,18,20};
	static int [] adjScandinavie = {14,15,17,20};
	static int [] adjEs = {16,17,20};
	static int [] adjUkraine = {17,18,19,27,29,30};
	static int [] adjAn = {11,22,23,24};
	static int [] adjEgypte = {21,23,27};
	static int [] adjAe = {21,22,24,25,26,27};
	static int [] adjCongo = {21,23,25};
	static int [] adjAs = {23,24,26};
	static int [] adjMadagascar = {23,25};
	static int [] adjMo = {20,22,28};
	static int [] adjInde = {27,29,35,36};
	static int [] adjAfghanistan = {20,28,30,35};
	static int [] adjOural = {20,29,31,35};
	static int [] adjSiberie = {30,32,33,34,35};
	static int [] adjYakoutie = {31,33,37};
	static int [] adjTchita = {31,32,34,37};
	static int [] adjMongolie = {31,33,35,37,38};
	static int [] adjChine = {28,29,30,31,34,36};
	static int [] adjSiam = {28,35,39};
	static int [] adjKamtchatka = {32,33,34,38};
	static int [] adjJapon = {34,37};
	static int [] adjIndonesie = {36,40,41};
	static int [] adjNouvelleGuinee = {39,41,42};
	static int [] adjAoccidentale = {39,40,42};
	static int [] adjAorientale = {40,41};
	static Territory Alaska = new Territory("Alaska",1,125.5,711.5,182,739, null,adjAlaska);
	static Territory TNO = new Territory("Territoire du Nord Ouest",2,386,731,285,740, null,adjTno);
	static Territory Alberta = new Territory("Alberta",3,221,666,259,694, null,adjAlberta);
	static Territory Ontario = new Territory("Ontario",4,382,638,356,688, null,adjOntario);
	static Territory EOuest = new Territory("Etat de lOuest",5,286,630,232,630, null,adjEouest);
	static Territory AC = new Territory("Amerique centrale",6,234,538,270,481, null,adjAc);
	static Territory EE = new Territory("Etat de lEst",7,368,598,310,562, null, adjEe);
	static Territory Quebec = new Territory("Quebec",8,451,698,441,655, null,adjQuebec);
	static Territory Groenland = new Territory("Groenland",9,515,710,546,750, null,adjGroenland);
	static Territory Venezuela = new Territory("Venezuela",10,363,412,420,417, null,adjVenezuela);
	static Territory Bresil = new Territory("Bresil",11,539,351,457,358, null,adjBresil);
	static Territory Perou = new Territory("Perou",12,355,364,417,293, null,adjPerou);
	static Territory Argentine = new Territory("Argentine",13,435,137,430,227, null,adjArgentine);
	static Territory Islande = new Territory("Islande",14,698,764,625,710, null,adjIslande);
	static Territory GB = new Territory("Grande-Bretagne",15,612,637,711,669, null,adjGb);
	static Territory EOccidentale = new Territory("Europe occidentale",16,664,569,717,561, null,adjEo);
	static Territory EN = new Territory("Europe Nord",17,768,662,820,641, null,adjEn);
	static Territory Scandinavie = new Territory("Scandinavie",18,781,740,820,705, null,adjScandinavie);
	static Territory ES = new Territory("EU Sud",19,822,578,820,605, null,adjEs);
	static Territory Ukraine = new Territory("Ukraine",20,914,697,920,640, null,adjUkraine);
	static Territory AN = new Territory("Afrique du Nord",21,698,450,750,450, null,adjAn);
	static Territory Egypte = new Territory("Egypte",22,816,484,870,496, null,adjEgypte);
	static Territory AE = new Territory("Afrique de lEst",23,980,361,920,414, null,adjAe);
	static Territory Congo = new Territory("Congo",24,812,317,859,339, null,adjCongo);
	static Territory AS = new Territory("Afrique du Sud",25,856,149,870,225, null,adjAs);
	static Territory Madagascar = new Territory("Madagascar",26,1015,179,1042,225, null,adjMadagascar);
	static Territory MO = new Territory("Moyen-Orient",27,1017,451,990,489, null,adjMo);
	static Territory Inde = new Territory("Inde",28,1138,450,1093,530, null,adjInde);
	static Territory Afghanistan = new Territory("Afghanistan",29,1019,588,1046,649, null,adjAfghanistan);
	static Territory Oural = new Territory("Oural",30,1012,715,1063,687, null,adjOural);
	static Territory Siberie = new Territory("Siberie",31,1080,754,1137,714, null,adjSiberie);
	static Territory Yakoutie = new Territory("Yakoutie",32,1183,742,1244,756, null,adjYakoutie);
	static Territory Tchita = new Territory("Tchita",33,1176,680,1235,684, null,adjTchita);
	static Territory Mongolie = new Territory("Mongolie",34,1323,620,1235,634, null,adjMongolie);
	static Territory Chine = new Territory("Chine",35,1310,534,1160,593, null,adjChine);
	static Territory Siam = new Territory("Siam",36,1252,443,1252,483, null,adjSiam);
	static Territory Kamtchatka = new Territory("Kamtchatka",37,1410,687,1389,737, null,adjKamtchatka);
	static Territory Japon = new Territory("Japon",38,1427,575,1407,615, null,adjJapon);
	static Territory Indonesie = new Territory("Indonesie",39,1366,421,1308,374, null,adjIndonesie);
	static Territory NG = new Territory("Nouvelle-Guinee",40,1483,384,1456,356, null,adjNouvelleGuinee);
	static Territory AOccidentale = new Territory("Australie occidentale",41,1291,235,1300,273, null,adjAoccidentale);
	static Territory AOrientale = new Territory("Australie Orientale",42,1406,211,1413,273, null,adjAorientale);
	
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
	public static int getIDFromNom(String Nom) {
		//
		if ((Nom=="Alaska ")||(Nom==" Alaska ")||(Nom==" Alaska")) {
			return 1;
		}
		else if ((Nom=="Territoire du Nord Ouest") || (Nom=="Territoire du nord ouest")) {
			return 2;
		}
		else if (Nom=="Alberta") {
			return 3;
		}
		else if (Nom=="Ontario") {
			return 4;
		}
		else if ((Nom=="Etat de l'Ouest") || (Nom=="Etat de l'ouest")) {
			return 5;
		}
		else if ((Nom=="Afrique centrale")||(Nom=="Afrique Centrale")) {
			return 6;
		}
		else if ((Nom=="Etat de l'Est") || (Nom=="Etat de l'est")) {
			return 7;
		}
		else if (Nom=="Quebec") {
			return 8;
		}
		else if (Nom=="Groenland") {
			return 9;
		}
		else if (Nom=="Venezuela") {
			return 10;
		}
		else if (Nom=="Bresil") {
			return 11;
		}
		else if (Nom=="Perou") {
			return 12;
		}
		else if (Nom=="Argentine") {
			return 13;
		}
		else if (Nom=="Islande") {
			return 14;
		}
		else if (Nom=="Grande-Bretagne") {
			return 15;
		}
		else if ((Nom=="Europe Occidentale")||(Nom=="Europe occidentale")) {
			return 16;
		}
		else if ((Nom=="Europe du Nord")||(Nom=="Europe du nord")) {
			return 17;
		}
		else if (Nom=="Scandinavie") {
			return 18;
		}
		else if ((Nom=="Europe du Sud")||(Nom=="Europe du sud")) {
			return 19;
		}
		else if (Nom=="Ukraine") {
			return 20;
		}
		else if ((Nom=="Afrique du Nord")||(Nom=="Afrique du nord")) {
			return 21;
		}
		else if (Nom=="Egypte") {
			return 22;
		}
		else if ((Nom=="Afrique de l'Est")||(Nom=="Afrique de l'est")) {
			return 23;
		}
		else if (Nom=="Congo") {
			return 24;
		}
		else if ((Nom=="Afrique du Sud")||(Nom=="Afrique du sud")) {
			return 25;
		}
		else if (Nom=="Madagascar") {
			return 26;
		}
		else if (Nom=="Moyen-Orient") {
			return 27;
		}
		else if (Nom=="Inde") {
			return 28;
		}
		else if (Nom=="Afghanistan") {
			return 29;
		}
		else if (Nom=="Oural") {
			return 30;
		}
		else if (Nom=="Sibérie") {
			return 31;
		}
		else if (Nom=="Yakoutie") {
			return 32;
		}
		else if (Nom=="Tchita") {
			return 33;
		}
		else if (Nom=="Mongolie") {
			return 34;
		}
		else if (Nom=="Chine") {
			return 35;
		}
		else if (Nom=="Siam") {
			return 36;
		}
		else if (Nom=="Kamtchatka") {
			return 37;
		}
		else if (Nom=="Japon") {
			return 38;
		}
		else if (Nom=="Indonesie") {
			return 39;
		}
		else if (Nom=="Nouvelle-Guinee") {
			return 40;
		}
		else if ((Nom=="Australie Occidentale")||(Nom=="Australie occidentale")) {
			return 41;
		}
		else if ((Nom=="Australie Orientale")||(Nom=="Australie orientale")) {
			return 42;
		}
		else {
			return 1;
		}
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public double getYterritory() {
		return Y;
	}
	public void setYterritory(double y) {
		Y = y;
	}
	public double getXterritory() {
		return X;
	}
	public void setXterritory(double x) {
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
	public double getXcavalier() {
		return Xcavalier;
	}
	public void setXcavalier(double xcavalier) {
		Xcavalier = xcavalier;
	}
	public double getYcavalier() {
		return Ycavalier;
	}
	public void setYcavalier(double ycavalier) {
		Ycavalier = ycavalier;
	}
	
}