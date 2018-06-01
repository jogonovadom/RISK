import edu.princeton.cs.introcs.StdDraw;

public class Plateau_du_jeu {
	Territory Alaska = new Territory("Alaska",1,125.5,711.5);
	Territory TNO = new Territory("Territoire du Nord Ouest",2,386,731);
	Territory Alberta = new Territory("Alberta",3,221,666);
	Territory Ontario = new Territory("Ontario",4,382,638);
	Territory EOuest = new Territory("Etat de l�Ouest",5,286,630);
	Territory AC = new Territory("Am�rique centrale",6,234,538);
	Territory EE = new Territory("Etat de l�Est",7,368,598);
	Territory Qu�bec = new Territory("Qu�bec",8,451,698);
	Territory Groenland = new Territory("Groenland",9,515,710);
	Territory Venezuela = new Territory("Venezuela",10,363,412);
	Territory Br�sil = new Territory("Br�sil",11,539,351);
	Territory P�rou = new Territory("P�rou",12,355,364);
	Territory Argentine = new Territory("Argentine",13,435,137);
	Territory Islande = new Territory("Islande",14,698,764);
	Territory GB = new Territory("Grande-Bretagne",15,612,637);
	Territory EOccidentale = new Territory("Europe occidentale",16,664,569);
	Territory EN = new Territory("Europe Nord",17,768,662);
	Territory Scandinavie = new Territory("Scandinavie",18,781,740);
	Territory ES = new Territory("EU Sud",19,822,578);
	Territory Ukraine = new Territory("Ukraine",20,914,697);
	Territory AN = new Territory("Afrique du Nord",21,698,450);
	Territory Egypte = new Territory("Egypte",22,816,484);
	Territory AE = new Territory("Afrique de l�Est",23,980,361);
	Territory Congo = new Territory("Congo",24,812,317);
	Territory AS = new Territory("Afrique du Sud",25,856,149);
	Territory Madagascar = new Territory("Madagascar",26,1015,179);
	Territory MO = new Territory("Moyen-Orient",27,1017,451);
	Territory Inde = new Territory("Inde",28,1138,450);
	Territory Afghanistan = new Territory("Afghanistan",29,1019,588);
	Territory Oural = new Territory("Oural",30,1012,715);
	Territory Sib�rie = new Territory("Sib�rie",31,1080,754);
	Territory Yakoutie = new Territory("Yakoutie",32,1183,742);
	Territory Tchita = new Territory("Tchita",33,1176,680);
	Territory Mongolie = new Territory("Mongolie",34,1323,620);
	Territory Chine = new Territory("Chine",35,1310,534);
	Territory Siam = new Territory("Siam",36,1252,443);
	Territory Kamtchatka = new Territory("Kamtchatka",37,1410,687);
	Territory Japon = new Territory("Japon",38,1427,575);
	Territory Indon�sie = new Territory("Indon�sie",39,1366,421);
	Territory NG = new Territory("Nouvelle-Guin�e",40,1483,384);
	Territory AOccidentale = new Territory("Australie occidentale",41,1291,235);
	Territory AOrientale = new Territory("Australie Orientale",42,1406,211);
	public static void AfficherPlateau() {
		StdDraw.picture(800, 450, "Images/Risk_game_map_complete.png");
	}
	
}
