import edu.princeton.cs.introcs.StdDraw;
import java.awt.Graphics; 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Parametre extends JFrame { //la fenêtre dépend de JFrame #heritage

    private JPanel pan = new JPanel();
    public  JButton bouton1 = new JButton("Quitter le jeu");
    public JButton bouton2 = new JButton ("Aide?");



    public Parametre(){
        this.setTitle("Parametres");
        this.setSize(600, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        //Ajout des boutons à notre content pane (=> là où sont disposés les composants)
        pan.add(bouton1);
        pan.add(bouton2);
        //bouton.addActionListener(this);
        this.setContentPane(pan);
        this.setVisible(true);
        //bouton.addActionListener(this);
        //bouton2.addActionListener(this);

        bouton1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        bouton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(true);
                EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        try{
                            Manuel_Utilisateur window = new Manuel_Utilisateur();
                            window.setVisible(true);
                        } catch(Exception e){
                            e.printStackTrace();
                        }

                    }
                });
            }
        });

    }
}
