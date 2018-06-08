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
	private JComboBox<Integer> comboCavalier = new JComboBox<Integer>();
	private JComboBox<Integer> comboCanon = new JComboBox<Integer>();
	private JComboBox<Integer> comboSoldat = new JComboBox<Integer>();
	private JLabel labelCavalier = new JLabel("Cavalier");
	private JLabel labelCanon = new JLabel("Canon");
	private JLabel labelSoldat= new JLabel("Soldat");
	private JButton valider = new JButton("Valider");
	private int numeroMonTerritoire;
	private int numeroTerritoireAdverse;

	public Fenetre(int numeroMonTerritoire, int numeroTerritoireAdverse){
		this.numeroMonTerritoire=numeroMonTerritoire;
		this.numeroTerritoireAdverse=numeroTerritoireAdverse;
		this.setTitle("choix att");
		this.setSize(700, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		container.setBackground(Color.white);
		container.setLayout(new BorderLayout());
		comboCavalier.setPreferredSize(new Dimension(100, 20));
		comboCanon.setPreferredSize(new Dimension(100, 20));
		comboSoldat.setPreferredSize(new Dimension(100, 20));
		comboCavalier.setLocation(0, 500);
		comboCanon.setLocation(250, 400);
		comboSoldat.setLocation(500, 400);
		JPanel Att = new JPanel();
		Att.add(labelCavalier);
		Att.add(comboCavalier);
		Att.add(labelCanon);
		Att.add(comboCanon);
		Att.add(labelSoldat);
		Att.add(comboSoldat);
		Att.add(valider, BorderLayout.SOUTH);
		container.add(Att, BorderLayout.SOUTH);
		container.add(new Panneau());
		this.setContentPane(container);
		this.setVisible(true);
		comboCavalier.addItem(0);
		comboCavalier.addItem(1);
		comboCavalier.addItem(2);
		comboCavalier.addItem(3);
		comboCavalier.addItemListener(new ItemState());
		comboCavalier.addActionListener(new ItemAction());
		comboCanon.addItem(0);
		comboCanon.addItem(1);
		comboCanon.addItem(2);
		comboCanon.addItem(3);
		comboCanon.addItemListener(new ItemState());
		comboCanon.addActionListener(new ItemAction());
		comboSoldat.addItem(0);
		comboSoldat.addItem(1);
    		comboSoldat.addItem(2);
    		comboSoldat.addItem(3);
    		comboSoldat.addItemListener(new ItemState());
    		comboSoldat.addActionListener(new ItemAction());
    		valider.addActionListener(new ItemAction());
	}

	public ArrayList<Unite> choixDef() {
		ArrayList<Unite> UniteDef = new ArrayList<Unite>();
		UniteDef.add(new Cavalier());
		return UniteDef;
	}
	public boolean verifAtt() {
		int nombreFinalCavalier=(int) comboCavalier.getSelectedItem();
		int nombreFinalCanon=(int) comboCanon.getSelectedItem();
		int nombreFinalSoldat=(int) comboSoldat.getSelectedItem();
		if (nombreFinalCavalier+nombreFinalCanon+nombreFinalSoldat>3) {
		    JOptionPane.showMessageDialog(valider,"Vous pouvez choisir au maximum 3 unit�s","Erreur", JOptionPane.ERROR_MESSAGE);
		    valider.setEnabled(false);
		    return false;
		}
	  
		else if (nombreFinalCavalier+nombreFinalCanon+nombreFinalSoldat==0) {
			JOptionPane.showMessageDialog(valider,"Choisissez au moins une troupe","Erreur", JOptionPane.ERROR_MESSAGE);
			valider.setEnabled(false);
			return false;
		}
		else {
			valider.setEnabled(true);
		}
		return true;
	}
  
	public ArrayList<Unite> choixAtt() { //on choisit les troupes qu'on veut pour attaquer
		int nombreFinalCavalier=(int) comboCavalier.getSelectedItem();
		int nombreFinalCanon=(int) comboCanon.getSelectedItem();
		int nombreFinalSoldat=(int) comboSoldat.getSelectedItem();
		int nombreCavalier=(int) comboCavalier.getItemAt(0);
		int nombreCanon=(int) comboCanon.getItemAt(0);
		int nombreSoldat=(int) comboSoldat.getItemAt(0);
		ArrayList<Unite> TroupeSelectionnees = new ArrayList<Unite>();
		if (nombreFinalCavalier+nombreFinalCanon+nombreFinalSoldat<=3 && nombreFinalCavalier+nombreFinalCanon+nombreFinalSoldat>0) {
			for (int i=0;i<nombreFinalCavalier;i++) {
				TroupeSelectionnees.add(new Cavalier());
			}
			for (int i=0;i<nombreFinalCanon;i++) {
				TroupeSelectionnees.add(new Canon()); 
			   
			}
			for (int i=0;i<nombreFinalSoldat;i++) {
				TroupeSelectionnees.add(new Soldat()); 
			}
			System.out.println(TroupeSelectionnees);
		}
		return TroupeSelectionnees;
	}
  
	class ItemState implements ItemListener{
		public void itemStateChanged(ItemEvent e) {
	}              
}
class ItemAction implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		boolean defense =false;
	    if (e.getSource()==comboCavalier || e.getSource()==comboCanon || e.getSource()==comboSoldat) {
	    		choixAtt();
	    }
	    if (e.getSource()==valider) {
	    		if (verifAtt()==true) {
	    			armee.attaquer(choixAtt(),choixDef());
	    			setVisible(false);
	    		}
	    		else {
	    			valider.setEnabled(false);
	    		}
	    	}
	}
}
	public void setArmees(ArrayList<Armee> armees) {
		this.armees = armees;
	}

	public void addArmee(Armee armee) {
		this.armees.add(armee);
	}

	public int getNumeroMonTerritoire() {
		return numeroMonTerritoire;
	}

	public void setNumeroMonTerritoire(int numeroMonTerritoire) {
		this.numeroMonTerritoire = numeroMonTerritoire;
	}

	public int getNumeroTerritoireAdverse() {
		return numeroTerritoireAdverse;
	}

	public void setNumeroTerritoireAdverse(int numeroTerritoireAdverse) {
		this.numeroTerritoireAdverse = numeroTerritoireAdverse;
	}
}
   
   
  

