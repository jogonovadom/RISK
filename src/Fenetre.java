import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
public class Fenetre extends JFrame {
	
	Armee armee = new Armee();
	
	ArrayList<Armee> armees = new ArrayList<Armee>();
	
	
  private JPanel container = new JPanel();
  private JPanel containerDef = new JPanel();
  private JComboBox<Integer> combo = new JComboBox<Integer>();
  private JComboBox<Integer> combo2 = new JComboBox<Integer>();
  private JComboBox<Integer> combo3 = new JComboBox<Integer>();
  private JComboBox<Integer> nbrUniteDef = new JComboBox<Integer>();
  private JLabel label = new JLabel("Cavalier");
  private JLabel label2 = new JLabel("Canon");
  private JLabel label3= new JLabel("Soldat");
  private JLabel nombreUniteDef= new JLabel("Nombre d'unités pour défendre?");
  private JButton valider = new JButton("Valider");
  private JButton validerDef = new JButton("Valider");
  
  public Fenetre(){
    this.setTitle("choix att");
    this.setSize(700, 500);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
    container.setBackground(Color.white);
    container.setLayout(new BorderLayout());
    combo.setPreferredSize(new Dimension(100, 20));
    combo2.setPreferredSize(new Dimension(100, 20));
    combo3.setPreferredSize(new Dimension(100, 20));
    combo.setLocation(0, 500);
    combo2.setLocation(250, 400);
    combo3.setLocation(500, 400);
   // bouton.setSize(300,150);
    //bouton.setLayout(new BorderLayout());
    
    JPanel Att = new JPanel();
    
    Att.add(label);
    Att.add(combo);
    Att.add(label2);
    Att.add(combo2);
    Att.add(label3);
    Att.add(combo3);
    Att.add(valider, BorderLayout.SOUTH);
    container.add(Att, BorderLayout.SOUTH);
    container.add(new Panneau());
    this.setContentPane(container);
    this.setVisible(true);
    combo.addItem(0);
    combo.addItem(1);
    combo.addItem(2);
    combo.addItem(3);
    combo.addItemListener(new ItemState());
    combo.addActionListener(new ItemAction());
    combo2.addItem(0);
    combo2.addItem(1);
    combo2.addItem(2);
    combo2.addItem(3);
    combo2.addItemListener(new ItemState());
    combo2.addActionListener(new ItemAction());
    combo3.addItem(0);
    combo3.addItem(1);
    combo3.addItem(2);
    combo3.addItem(3);
    combo3.addItemListener(new ItemState());
    combo3.addActionListener(new ItemAction());
    valider.addActionListener(new ItemAction());
    
    
    
  }
  public void FenetreDef() {
	    this.setTitle("choix def");
	    this.setSize(700, 500);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLocationRelativeTo(null);
	    containerDef.setBackground(Color.white);
	    containerDef.setLayout(new BorderLayout());
	    JPanel Def = new JPanel();
	    Def.add(nombreUniteDef);
	    Def.add(nbrUniteDef);
	    Def.add(validerDef, BorderLayout.SOUTH);
	    containerDef.add(Def, BorderLayout.SOUTH);
	    containerDef.add(new Panneau());
	    this.setContentPane(containerDef);
	    this.setVisible(true);
	    nbrUniteDef.addItem(1);
	    nbrUniteDef.addItem(2);
	    nbrUniteDef.addItemListener(new ItemState());
	    nbrUniteDef.addActionListener(new ItemAction());
	    validerDef.addActionListener(new ItemAction());
        
	    
	   
	    
  }
  
  public ArrayList<Unite> choixDef() {
	  int nombreDef=(int) nbrUniteDef.getSelectedItem();
	  ArrayList<Unite> UniteDef = new ArrayList<Unite>();
	  if (nombreDef<=2) {
	  for (int i=0;i<nombreDef;i++) {
		  UniteDef.add(new Cavalier());
	  }
	  System.out.println(UniteDef);
	  }
	  return UniteDef;
  }
  public void setArmees(ArrayList<Armee> armees) {
	  this.armees = armees;
  }
  
  public void addArmee(Armee armee) {
	  this.armees.add(armee);
  }
  public ArrayList<Unite> choixAtt() {
	  
	  int nombre=(int) combo.getSelectedItem();
	  int nombre2=(int) combo2.getSelectedItem();
	  int nombre3=(int) combo3.getSelectedItem();
	  if (nombre+nombre2+nombre3>3) {
	  JOptionPane.showMessageDialog(valider,"Vous pouvez choisir au maximum 3 unités","Erreur", JOptionPane.ERROR_MESSAGE);
	  }
	  ArrayList<Unite> Unite = new ArrayList<Unite>();
	  if (nombre+nombre2+nombre3<=3) {
		  for (int i=0;i<nombre;i++) {
			  Unite.add(new Cavalier());
		  }
		  for (int i=0;i<nombre2;i++) {
			  Unite.add(new Canon()); 
			   
		  }
		  for (int i=0;i<nombre3;i++) {
			  Unite.add(new Soldat()); 
			  
		  }
		  System.out.println(Unite);
		  
		  }
		  return Unite;
  }
  
  class ItemState implements ItemListener{
	    public void itemStateChanged(ItemEvent e) {
	      System.out.println("événement déclenché sur : " + e.getItem());
	      
	    }              
	  }
  
   class ItemAction implements ActionListener{
	    public void actionPerformed(ActionEvent e) {
	    	boolean defense =false;
	      if (e.getSource()==combo || e.getSource()==combo2 || e.getSource()==combo3 ) {
	      
	        choixAtt();
	      }
	      if (e.getSource()==valider) {
	    	  setVisible(false);
	    	  FenetreDef();
	    	  
	    	  
	      }
	      
	      if (e.getSource()==nbrUniteDef) {
    		  choixDef();
    	  }
	      if (e.getSource()==validerDef) {
	    	  
	             armee.attaquer(choixAtt(),choixDef());
	             
		    	 defense = true;
		      }
	    	  if (defense == true) {
	    		  setVisible(false);
	    	  }
	      }
	      
	    }   
	    
	  }
   
   
  

