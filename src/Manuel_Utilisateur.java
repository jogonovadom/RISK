import java.awt.Color;
import java.awt.Font;


import javax.swing.JFrame;
import javax.swing.JLabel;
public class Manuel_Utilisateur extends JFrame{

        private JLabel aide;

        public Manuel_Utilisateur(){

            this.aide = new JLabel("Text ");
            this.setTitle("Manuel utilisateur");
            this.setSize(300,150);
            this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            this.setLocationRelativeTo(null);

            aide.setFont(new Font("Serif",Font.BOLD,12));
            aide.setForeground(Color.BLACK);
            aide.setBounds(100,650,200,100);
            this.getContentPane().add(aide);
        }
  }