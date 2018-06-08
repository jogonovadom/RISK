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

public class Armee {
	
	public Armee()
	{
		
	}
	public void attaquer(ArrayList<Unite> Attk,ArrayList<Unite> Def) {
		
		ArrayList<Unite> Unite = Attk;
		ArrayList<Unite> Unite2 = Def;
		
		int min;
		min=0;
		
		ArrayList <Integer> ID = new  ArrayList<Integer>();
		ArrayList <Integer> Attaquants = new  ArrayList<Integer>();
		ArrayList <Integer> Defenseurs = new ArrayList<Integer>();
		
		if (Attk.size()>Def.size()) {
			min=Def.size();
		}
			
		if (Attk.size()<Def.size()) {
			min=Attk.size();
		}
			
		for (int i=0;i<Unite.size();i++) {
			
			System.out.println(Unite.get(i).getClass().getName());
			String type =Unite.get(i).getClass().getName(); //On r�cup�re le type de l'Unite
			
			if (type=="Soldat") {
				int Puissance =Soldat.getPuissanceMin() + (int) ( (Math.random()*(Soldat.getPuissanceMax() - Soldat.getPuissanceMin()+1)));
				Unite.get(i).setPuissance(Puissance);
				Attaquants.add(Puissance);
				System.out.println("Soldat fait" + Unite.get(i).getPuissance());
			}
			
			else if (type=="Cavalier") {
				int Puissance= Cavalier.getPuissanceMin() + (int) ( (Math.random()*(Cavalier.getPuissanceMax() - Cavalier.getPuissanceMin()+1)));
				Unite.get(i).setPuissance(Puissance);
				Attaquants.add(Puissance);
				System.out.println("Cavalier fait" + Unite.get(i).getPuissance());
			}
			
			else {
				int Puissance= Canon.getPuissanceMin() + (int) ( (Math.random()*(Canon.getPuissanceMax() - Canon.getPuissanceMin()+1))); 
				Unite.get(i).setPuissance(Puissance);
				Attaquants.add(Puissance);
				System.out.println("Canon fait" + Unite.get(i).getPuissance());
			}
			System.out.println(Attaquants);
		}
		
		for (int j=0;j<Unite2.size();j++) {
			Unite2.get(j);
			
			System.out.println(Unite2.get(j).getClass().getName());
			String type =Unite2.get(j).getClass().getName();
			
			if (type=="Soldat") {
				int Puissance=Soldat.getPuissanceMin() + (int) ( (Math.random()*(Soldat.getPuissanceMax() - Soldat.getPuissanceMin()+1)));
				Unite2.get(j).setPuissance(Puissance);
				Defenseurs.add(Puissance);
				System.out.println("Soldat fait" + Unite2.get(j).getPuissance());
			}
			
			else if (type=="Cavalier") {
				int Puissance=Cavalier.getPuissanceMin() + (int) ( (Math.random()*(Cavalier.getPuissanceMax() - Cavalier.getPuissanceMin()+1)));
				Unite2.get(j).setPuissance(Puissance);
				Defenseurs.add(Puissance);
				System.out.println("Cavalier fait" + Unite2.get(j).getPuissance());
			}
			
			else {
				int Puissance=Canon.getPuissanceMin() + (int) ( (Math.random()*(Canon.getPuissanceMax() - Canon.getPuissanceMin()+1)));
				Unite2.get(j).setPuissance(Puissance);
				Defenseurs.add(Puissance);
				System.out.println("Canon fait" + Unite2.get(j).getPuissance());
			}
			System.out.println(Defenseurs);
		}
		
		for (int i=0;i<Unite.size();i++) {  //tri en fonction des puissances
			while (i<Unite.size()-1) {
				System.out.println(Unite.get(i).getPuissance());
				System.out.println(Unite.get(i+1).getPuissance());
				if (Unite.get(i).getPuissance()<Unite.get(i+1).getPuissance()) {
					Collections.swap(Unite, i,i+1);
				}
				i++;
			}
			System.out.println(Unite);
		}
		
		for (int i=0;i<Unite.size();i++) {  //tri en fonction des priorites
			while (i<Unite.size()-1) {
			if (Unite.get(i).getPrioriteAtt()>Unite.get(i+1).getPrioriteAtt() && Unite.get(i).getPuissance()==Unite.get(i+1).getPuissance()) {
				Collections.swap(Unite, i,i+1);
			}
			i++;
			}
			System.out.println(Unite);
		}
		//tri ordre d�croissant
		Collections.sort(Attaquants);
		Collections.reverse(Attaquants);
		System.out.println("Attaque : " + Attaquants);
		Collections.sort(Defenseurs);
		Collections.reverse(Defenseurs);
		System.out.println("D�fense : " + Defenseurs);
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
			System.out.println("l'attaquant " + j + " a perdu TCHIN TCHANG");
			System.out.println("le d�fenseur " + j + " a gagn� MATUIDI CHARO");
			Unite.remove(j);
		}
	//  }
	  
		System.out.println(Defdefaite);
		for (int i=Defdefaite.size()-1;i>=0;i--) {
			int j=Defdefaite.get(i);
			System.out.println("l'attaquant " + j + " a gagn�");
			System.out.println("le d�fenseur " + j + " a perdu");
			Unite2.remove(j);
		}
		
		System.out.println("Attaque apr�s combat: " + Attaquants);
		System.out.println("D�fense apr�s combat : " + Defenseurs);
		System.out.println("Arm�e offensive apr�s combat: " + Unite);
		System.out.println("Arm�e d�fensive apr�s combat : " + Unite2);
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

public void deplacer(Unite unite,int IDterritoireActuel,int IDNouveauTerritoire,ArrayList<Integer> idTerritoiresAdjacents,ArrayList<Unite> armeeNouveauTerritoire,ArrayList<Unite> armeeTerritoireActuel) {
	int idTerritoireActuel=IDterritoireActuel;
	int idNouveauTerritoire=IDNouveauTerritoire;
	int mouv=unite.getMouvement();
	boolean adjacent=false;
	
	for (int i=0;i<idTerritoiresAdjacents.size();i++) {
		int compareId=idTerritoiresAdjacents.get(i);
		if (idNouveauTerritoire==compareId) {
			adjacent=true;
		}
	}
	if (adjacent==true && mouv!=0) {
		armeeNouveauTerritoire.add(unite);
		armeeTerritoireActuel.remove(unite);
		}
	}
}
	

