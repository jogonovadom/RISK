import java.util.ArrayList;
import java.util.Collections;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Armee {
	
	public Armee()
	{
		
	}

	
	public void attaquer(ArrayList<Unite> Attk,ArrayList<Unite> Def) {
		
		
		
		
		ArrayList<Unite> Unite = Attk;
		ArrayList<Unite> Unite2 = Def;
		
		

		
		
		
		
		ArrayList <Integer> ID = new  ArrayList<Integer>();
		ArrayList <Integer> Attaquants = new  ArrayList<Integer>();
		ArrayList <Integer> Defenseurs = new ArrayList<Integer>();
		
		for (int i=0;i<Unite.size();i++) {
			Unite.get(i);
			
			//System.out.println(Unite.get(i).getClass().getID());
			System.out.println(Unite.get(i).getClass().getName());
			String type =Unite.get(i).getClass().getName(); //On récupère le type de l'Unite
			
			if (type=="Soldat") {
				int Puissance=Soldat.getPuissanceMin() + (int) ( (Math.random()*(Soldat.getPuissanceMax() - Soldat.getPuissanceMin()+1)));
				Attaquants.add(Puissance);
				System.out.println(Soldat.getID()+i);
				ID.add(Soldat.getID()+i);
				
			}
			
			else if (type=="Cavalier") {
				int Puissance= Cavalier.getPuissanceMin() + (int) ( (Math.random()*(Cavalier.getPuissanceMax() - Cavalier.getPuissanceMin()+1)));
				Attaquants.add(Puissance);
				
			}
			
			else {
				int Puissance= Canon.getPuissanceMin() + (int) ( (Math.random()*(Canon.getPuissanceMax() - Canon.getPuissanceMin()+1))); 
				Attaquants.add(Puissance);
			}
			System.out.println(Attaquants);
		}
		
		for (int j=0;j<Unite2.size();j++) {
			Unite2.get(j);
			
			System.out.println(Unite2.get(j).getClass().getName());
			String type =Unite2.get(j).getClass().getName();
			
			if (type=="Soldat") {
				int Puissance=Soldat.getPuissanceMin() + (int) ( (Math.random()*(Soldat.getPuissanceMax() - Soldat.getPuissanceMin()+1)));
				Defenseurs.add(Puissance);
				
			}
			
			else if (type=="Cavalier") {
				int Puissance=Cavalier.getPuissanceMin() + (int) ( (Math.random()*(Cavalier.getPuissanceMax() - Cavalier.getPuissanceMin()+1)));
				Defenseurs.add(Puissance);
			}
			
			else {
				int Puissance=Canon.getPuissanceMin() + (int) ( (Math.random()*(Canon.getPuissanceMax() - Canon.getPuissanceMin()+1)));
				Defenseurs.add(Puissance);
			}
			System.out.println(Defenseurs);
			
		}
		//tri ordre décroissant
		Collections.sort(Attaquants);
		Collections.reverse(Attaquants);
		System.out.println("Attaque : " + Attaquants);
		Collections.sort(Defenseurs);
		Collections.reverse(Defenseurs);
		System.out.println("Défense : " + Defenseurs);
		//fin tri
		
		ArrayList <Integer> Attdefaite =  new  ArrayList<Integer>(); // on stock les  perdants qu'on supprimera ensuite
		ArrayList <Integer> Defdefaite =  new  ArrayList<Integer>();
		ArrayList <Integer> Attvictoire =  new  ArrayList<Integer>();
		ArrayList <Integer> Defvictoire =  new  ArrayList<Integer>();
		
		ArrayList  ArmeeAttdefaite =  new  ArrayList();
		ArrayList  ArmeeDefdefaite =  new  ArrayList();
		
		for (int i=0;i<Defenseurs.size();i++) {
		  if (Attaquants.get(i) <= Defenseurs.get(i)) {
			  Attdefaite.add(Attaquants.get(i));
			  Defvictoire.add(Defenseurs.get(i));
			  ArmeeAttdefaite.add(Unite.get(i));
		  }
		  else {
			  Attvictoire.add(Attaquants.get(i));
			  Defdefaite.add(Defenseurs.get(i));
			  ArmeeDefdefaite.add(Unite2.get(i));
		  }
		  
	}
		
		for (int i=0;i<Attdefaite.size();i++) {
			System.out.println("l'attaquant " + i + " a perdu TCHIN TCHANG");
			System.out.println("le défenseur " + i + " a gagné MATUIDI CHARO");
			Attaquants.remove(Attdefaite.get(i));
		}
		
		
		for (int i=0;i<Defdefaite.size();i++) {
			System.out.println("l'attaquant " + i + " a gagné MATUIDI CHARO");
			System.out.println("le défenseur " + i + " a perdu TCHIN TCHAANG");
			Defenseurs.remove(Defdefaite.get(i));
		}
		for (int i=0;i<ArmeeAttdefaite.size();i++) {
			System.out.println("l'Unite offensive " + Unite.get(i)+ i + " a perdu TCHIN TCHANG");
			Unite.remove(Unite.get(i));
		}
		
		for (int i=ArmeeDefdefaite.size()-1;i>=0;i--) {
			
			
			System.out.println("l'Unite défensive " + Unite2.get(i)+ i + " a perdu TCHIN TCHANG");
			Unite2.remove(Unite2.get(i));
		}
		System.out.println("Attaque après combat: " + Attaquants);
		System.out.println("Défense après combat : " + Defenseurs);
		System.out.println("Armée offensive après combat: " + Unite);
		System.out.println("Armée défensive après combat : " + Unite2);
}
	
}
