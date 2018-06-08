import java.util.ArrayList;
import java.util.Collections;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import edu.princeton.cs.introcs.StdDraw;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ArmeeConsole {
	
	public ArmeeConsole()
	{
		
	}
	public static void attaquer(int joueurAttaquant, ArrayList<Joueur> joueur, int numeroMonTerritoire, int numeroTerritoireAdverse) {
		int joueurAttaque;
		for (int i=0; i<joueur.size(); i++) {
			for (int j : joueur.get(i).getTerritoiresControles()) {
				if (j==numeroTerritoireAdverse) {
					joueurAttaque=i;
				}
			}
		}
		
		ArrayList<Unite> ArmeeAttaquante = Territory.getTerritoryFromID(numeroMonTerritoire).getTroupes();
		ArrayList<Unite> ArmeeAttaquee = Territory.getTerritoryFromID(numeroTerritoireAdverse).getTroupes();
		
		int min;
		min=0;
		
		ArrayList <Integer> ID = new  ArrayList<Integer>();
		ArrayList <Integer> Attaquants = new  ArrayList<Integer>();
		ArrayList <Integer> Defenseurs = new ArrayList<Integer>();
		
		if (ArmeeAttaquante.size()>ArmeeAttaquee.size()) {
			min=ArmeeAttaquee.size();
		}
			
		if (ArmeeAttaquante.size()<ArmeeAttaquee.size()) {
			min=ArmeeAttaquante.size();
		}
			
		for (int i=0;i<ArmeeAttaquante.size();i++) {
			
			System.out.println(ArmeeAttaquante.get(i).getClass().getName());
			String type =ArmeeAttaquante.get(i).getClass().getName(); //On recupere le type de l'Unite
			
			if (type=="Soldat") {
				int Puissance =Soldat.getPuissanceMin() + (int) ( (Math.random()*(Soldat.getPuissanceMax() - Soldat.getPuissanceMin()+1)));
				ArmeeAttaquante.get(i).setPuissance(Puissance);
				Attaquants.add(Puissance);
				System.out.println("Soldat fait" + ArmeeAttaquante.get(i).getPuissance());
			}
			
			else if (type=="Cavalier") {
				int Puissance= Cavalier.getPuissanceMin() + (int) ( (Math.random()*(Cavalier.getPuissanceMax() - Cavalier.getPuissanceMin()+1)));
				ArmeeAttaquante.get(i).setPuissance(Puissance);
				Attaquants.add(Puissance);
				System.out.println("Cavalier fait" + ArmeeAttaquante.get(i).getPuissance());
			}
			
			else {
				int Puissance= Canon.getPuissanceMin() + (int) ( (Math.random()*(Canon.getPuissanceMax() - Canon.getPuissanceMin()+1))); 
				ArmeeAttaquante.get(i).setPuissance(Puissance);
				Attaquants.add(Puissance);
				System.out.println("Canon fait" + ArmeeAttaquante.get(i).getPuissance());
			}
			System.out.println(Attaquants);
		}
		
		for (int j=0;j<ArmeeAttaquee.size();j++) {
			ArmeeAttaquee.get(j);
			
			System.out.println(ArmeeAttaquee.get(j).getClass().getName());
			String type =ArmeeAttaquee.get(j).getClass().getName();
			
			if (type=="Soldat") {
				int Puissance=Soldat.getPuissanceMin() + (int) ( (Math.random()*(Soldat.getPuissanceMax() - Soldat.getPuissanceMin()+1)));
				ArmeeAttaquee.get(j).setPuissance(Puissance);
				Defenseurs.add(Puissance);
				System.out.println("Soldat fait" + ArmeeAttaquee.get(j).getPuissance());
			}
			
			else if (type=="Cavalier") {
				int Puissance=Cavalier.getPuissanceMin() + (int) ( (Math.random()*(Cavalier.getPuissanceMax() - Cavalier.getPuissanceMin()+1)));
				ArmeeAttaquee.get(j).setPuissance(Puissance);
				Defenseurs.add(Puissance);
				System.out.println("Cavalier fait" + ArmeeAttaquee.get(j).getPuissance());
			}
			
			else {
				int Puissance=Canon.getPuissanceMin() + (int) ( (Math.random()*(Canon.getPuissanceMax() - Canon.getPuissanceMin()+1)));
				ArmeeAttaquee.get(j).setPuissance(Puissance);
				Defenseurs.add(Puissance);
				System.out.println("Canon fait" + ArmeeAttaquee.get(j).getPuissance());
			}
			System.out.println(Defenseurs);
		}
		
		for (int i=0;i<ArmeeAttaquante.size();i++) {  //tri en fonction des puissances
			while (i<ArmeeAttaquante.size()-1) {
				System.out.println(ArmeeAttaquante.get(i).getPuissance());
				System.out.println(ArmeeAttaquante.get(i+1).getPuissance());
				if (ArmeeAttaquante.get(i).getPuissance()<ArmeeAttaquante.get(i+1).getPuissance()) {
					Collections.swap(ArmeeAttaquante, i,i+1);
				}
				i++;
			}
			System.out.println(ArmeeAttaquante);
		}
		
		for (int i=0;i<ArmeeAttaquante.size();i++) {  //tri en fonction des priorites
			while (i<ArmeeAttaquante.size()-1) {
			if (ArmeeAttaquante.get(i).getPrioriteAtt()>ArmeeAttaquante.get(i+1).getPrioriteAtt() && ArmeeAttaquante.get(i).getPuissance()==ArmeeAttaquante.get(i+1).getPuissance()) {
				Collections.swap(ArmeeAttaquante, i,i+1);
			}
			i++;
			}
			System.out.println(ArmeeAttaquante);
		}
		//tri ordre d�croissant
		Collections.sort(Attaquants);
		Collections.reverse(Attaquants);
		System.out.println("Attaque : " + Attaquants);
		Collections.sort(Defenseurs);
		Collections.reverse(Defenseurs);
		System.out.println("Defense : " + Defenseurs);
		//fin tri
		
		ArrayList <Integer> Attdefaite =  new  ArrayList<Integer>(); // on stock les  perdants qu'on supprimera ensuite
		ArrayList <Integer> Defdefaite =  new  ArrayList<Integer>();
		ArrayList <Integer> Attvictoire =  new  ArrayList<Integer>();
		ArrayList <Integer> Defvictoire =  new  ArrayList<Integer>();
		
		
		
		for (int i=0;i<min;i++) {
		  if (Attaquants.get(i) <= Defenseurs.get(i)) {
			  Attdefaite.add(i);
			  Defvictoire.add(i);
		  }
		  else {
			  Attvictoire.add(i);
			  Defdefaite.add(i);
		  }
	}
	 // if (Attdefaite.size()>0) {
		for (int i=Attdefaite.size()-1;i>=0;i--) {
			
			int j=Attdefaite.get(i);
			System.out.println("l'attaquant " + j + " a perdu");
			System.out.println("le defenseur " + j + " a gagne");
			ArmeeAttaquante.remove(j);
		}
	//  }
	  
		System.out.println(Defdefaite);
		for (int i=Defdefaite.size()-1;i>=0;i--) {
			int j=Defdefaite.get(i);
			System.out.println("l'attaquant " + j + " a gagne");
			System.out.println("le defenseur " + j + " a perdu");
			ArmeeAttaquee.remove(j);
		}
		
		System.out.println("Attaque apres combat: " + Attaquants);
		System.out.println("Defense apres combat : " + Defenseurs);
		System.out.println("Armee offensive apres combat: " + ArmeeAttaquante);
		System.out.println("Armee defensive apres combat : " + ArmeeAttaquee);
}

public void ajouterSoldat(ArrayList<Unite> Armee) {
	if (StdDraw.isMousePressed()) {
		Armee.add(new Soldat()); 
	}
}

public void ajouterCavalier(ArrayList<Unite> Armee) {
	if (StdDraw.isMousePressed()) {
		Armee.add(new Cavalier()); 
	}
}

public void ajouterCanon(ArrayList<Unite> Armee) {
	if (StdDraw.isMousePressed()) {
		Armee.add(new Canon()); 
	}
}

public static void deplacer(int IDterritoireActuel,int IDNouveauTerritoire,int [] idTerritoiresAdjacents) {
	int idNouveauTerritoire=IDNouveauTerritoire;
	boolean adjacent=false;
	for (Unite unite : Territory.getTerritoryFromID(IDterritoireActuel).getTroupes()) {
		int mouv=unite.getMouvement();
		for (int i=0;i<idTerritoiresAdjacents.length;i++) {
			int compareId=idTerritoiresAdjacents[i];
			if (idNouveauTerritoire==compareId) {
				adjacent=true;
			}
		}
		if (adjacent==true && mouv!=0) {
			Territory.getTerritoryFromID(IDterritoireActuel).getTroupes().add(unite);
			Territory.getTerritoryFromID(idNouveauTerritoire).getTroupes().remove(unite);
			}
		}
	}
}
	

