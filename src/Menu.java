import java.awt.Font;
import edu.princeton.cs.introcs.StdDraw;
import java.lang.Object;

public class Menu {
	Menu suivant;
	int largeur;
    int longueur;
    static int nombreJoueur;
    
    public Menu(int largeur, int longueur) {
		this.largeur = largeur;
		this.longueur = longueur;
	}
	
   
    
    public void AfficherMenu() {
    	 
    	boolean Etat = true;
    	
    	StdDraw.setCanvasSize(1600,900);
    	StdDraw.setXscale(0,1600);
    	StdDraw.setYscale(0,900);
    	Font font = new Font("SansSerif",Font.BOLD,30);
    	StdDraw.setFont(font);
    	//les lignes suivantes servent a choisir le nombre de joueurs
    	boolean case2;
    	case2=false;
    	
    	boolean case3;
    	case3=false;
    	
    	boolean case4;
    	case4=false;
    	
    	boolean case5;
    	case5=false;
    	
    	boolean case6;
    	case6=false;
    	int cptm =1; //numero de la page
    	while (Etat==true) {
    		double Xm=StdDraw.mouseX();
    		double Ym=StdDraw.mouseY();
    		
    		if (cptm == 1) {
        		if ( 704<Xm && Xm<898 && 323< Ym && Ym <365 ) {
        			
        			StdDraw.picture(800,450, "Images/menu/jeu du risk menu 1.png");
        			if (StdDraw.isMousePressed()) {
        				cptm ++;
        			}
        		}
        					
        		else if ( 669<Xm && Xm<930 && 200< Ym && Ym <254 ) {
        			StdDraw.picture(800,450, "Images/menu/jeu du risk menu 2.png");
        		}
        				
        		else {
        			StdDraw.picture(800,450, "Images/menu/jeu du risk menu 0.png" );
        		}
    		}
    		else if (cptm==2) {
    		    
    			StdDraw.rectangle(252,384.3,13.6,18);
    			StdDraw.rectangle(361.6,384.3,13.6,18);
    			StdDraw.rectangle(472,384.3,13.6,18);
    			StdDraw.rectangle(572.8,384.3,13.6,18);
    			StdDraw.rectangle(686.4,384.3,13.6,18);  
    			StdDraw.enableDoubleBuffering();
    			StdDraw.show();
    			if (704<Xm && Xm<796.8 && 261< Ym && Ym <324) {
    				StdDraw.picture(800,450, "Images/menu/nombre de joueur 2.png" );
    				
    				if (case2==true) {
        				StdDraw.filledCircle(252,384.3,13.6);
        		    	case3=false;			
        		    	case4=false;
        		    	case5=false;
        		    	case6=false;
        			}
    				
    				if (case3==true) {
        				StdDraw.filledCircle(361.6,384.3,13.6);
        				case2=false;			
        		    	case4=false;
        		    	case5=false;
        		    	case6=false;
        			}
    				
    				if (case4==true) {
        				StdDraw.filledCircle(472,384.3,13.6);
        				case3=false;			
        		    	case2=false;
        		    	case5=false;
        		    	case6=false;
        			}
    				
    				if (case5==true) {
        				StdDraw.filledCircle(572.8,384.3,13.6);
        				case3=false;			
        		    	case4=false;
        		    	case2=false;
        		    	case6=false;
        			}
    				
    				if (case6==true) {
        				StdDraw.filledCircle(686.4,384.3,13.6);
        				case3=false;			
        		    	case4=false;
        		    	case5=false;
        		    	case2=false;
        			}
    				
        			if (StdDraw.isMousePressed()) {
        				StdDraw.disableDoubleBuffering();
        				cptm ++;
        			}
        			
    			}
    			
    			else {
    				StdDraw.picture(800,450, "Images/menu/nombre de joueur 1.png" );
        			
        			
        			if (224<Xm && Xm<264 && 360< Ym && Ym <396) { //On affiche les cercles dans les cases coch�es
        				StdDraw.filledCircle(252,384.3,13.6);
        				if (StdDraw.isMousePressed() ) {
        					case2=true; //2 joueurs
        					nombreJoueur=2;
            			}
        			}
        			
					if (case2==true) {
        				StdDraw.filledCircle(252,384.3,13.6);
        				case3=false;			
        		    	case4=false;
        		    	case5=false;
        		    	case6=false;
        			}
					
        		    if (334.4<Xm && Xm<374.4 && 360< Ym && Ym <396) {
        				StdDraw.filledCircle(361.6,384.3,13.6);
        				if (StdDraw.isMousePressed()) {
        					case3=true; //3 joueurs
        					nombreJoueur=3;
            			}
        			}
					
					if (case3==true) {
        				StdDraw.filledCircle(361.6,384.3,13.6);
        				case2=false;			
        		    	case4=false;
        		    	case5=false;
        		    	case6=false;
        			}
					
        		    if ( 444.8<Xm && Xm<484.8 && 360< Ym && Ym <396) {
        				StdDraw.filledCircle(472,384.3,13.6);
        				if (StdDraw.isMousePressed()) {
        					case4=true; //4 joueurs
        					nombreJoueur=4;
            			}
        			}
        			
					if (case4==true) {
        				StdDraw.filledCircle(472,384.3,13.6);
        				case3=false;			
        		    	case2=false;
        		    	case5=false;
        		    	case6=false;
        			}
					
        			if ( 545.6<Xm && Xm<585.6 && 360< Ym && Ym <396) {
        				StdDraw.filledCircle(572.8,384.3,13.6);
        				if (StdDraw.isMousePressed()) {
        					case5=true; //5 joueurs
        					nombreJoueur=5;
            			}
        			}
        			
					if (case5==true) {
        				StdDraw.filledCircle(572.8,384.3,13.6);
        				case3=false;			
        		    	case4=false;
        		    	case2=false;
        		    	case6=false;
        			}
					
        			if ( 659.2<Xm && Xm<699.2 && 360< Ym && Ym <396) {
        				StdDraw.filledCircle(686.4,384.3,13.6);
        				if (StdDraw.isMousePressed()) {
        					case6=true; //6 joueurs
        					nombreJoueur=6;
            			}
        			}
					
					if (case6==true) {
        				StdDraw.filledCircle(686.4,384.3,13.6);
        				case3=false;			
        		    	case4=false;
        		    	case5=false;
        		    	case2=false;
        			}
        			
    			}
    			
    			
    				
    		}
    		
    		else if (cptm>2) { //tous les noms de joueurs avec 2 joueurs
    			if (case2==true) {
    				Etat=NomJoueur(true,2);
    			}
    			else if (case3==true) {
    				Etat=NomJoueur(true,3);
    			}
    			else if (case4==true) {
    				Etat=NomJoueur(true,4);
    			}
    			else if (case5==true) {
    				Etat=NomJoueur(true,5);
    			}
    			else if (case6==true) {
    				Etat=NomJoueur(true,6);
    			}
    		}
    	}
    	if (Etat==false) {
    		Game G = new Game(nombreJoueur);
    		G.Afficher_Plateau();
    		G.gameInit();
    	}
    }
    	
    /*public void AjouterTexte() {
    	
    	String  texte = "Joueur 1";
    	
    	//texte = texte + StdDraw.nextKeyTyped() + " ";
    	
		//StdDraw.disableDoubleBuffering();
    	//while (StdDraw.isKeyPressed(3)==false) {
    	if (StdDraw.hasNextKeyTyped()) {
    	texte = texte + StdDraw.nextKeyTyped() + " ";
    	//StdDraw.enableDoubleBuffering();
		//StdDraw.show();
		//StdDraw.disableDoubleBuffering();
    	}
    	//}
    	StdDraw.text(800,495,texte);
    	
		StdDraw.show(20);
    }*/
    public void Image(int i, int j) {
    	if (i==1) {
    		if (j==1) {
    			StdDraw.picture(800,450, "Images/menu/nom J1 0.png" );
    		}
    		else {
    			StdDraw.picture(800,450, "Images/menu/nom J1 1.png" );
    		}
    	}
    	else if (i==2) {
    		if (j==1) {
    			StdDraw.picture(800,450, "Images/menu/nom J2 0.png" );
    		}
    		else {
    			StdDraw.picture(800,450, "Images/menu/nom J2 1.png" );
    		}
    	}
    	else if (i==3) {
    		if (j==1) {
    			StdDraw.picture(800,450, "Images/menu/nom J3 0.png" );
    		}
    		else {
    			StdDraw.picture(800,450, "Images/menu/nom J3 1.png" );
    		}
    	}
    	else if (i==4) {
    		if (j==1) {
    			StdDraw.picture(800,450, "Images/menu/nom J4 0.png" );
    		}
    		else {
    			StdDraw.picture(800,450, "Images/menu/nom J4 1.png" );
    		}
    	}
    	else if (i==5) {
    		if (j==1) {
    			StdDraw.picture(800,450, "Images/menu/nom J5 0.png" );
    		}
    		else {
    			StdDraw.picture(800,450, "Images/menu/nom J5 1.png" );
    		}
    	}
    	else if (i==6) {
    		if (j==1) {
    			StdDraw.picture(800,450, "Images/menu/nom J6 0.png" );
    		}
    		else {
    			StdDraw.picture(800,450, "Images/menu/nom J6 1.png" );
    		}
    	}
    }
    public boolean NomJoueur(boolean EtatNJ, int p) { //p=nombre de joueur en tout ; i=page du joueur actuel
		int i=1;
    	while (i<p+1) {
    		StdDraw.pause(300);
    		double Xm=StdDraw.mouseX();
    		double Ym=StdDraw.mouseY();
			if (704<Xm && Xm<796.8 && 261< Ym && Ym <324) {
				Image(i,2);
				if (StdDraw.isMousePressed()) {
					i+=1;
				}
			}
			else {
				Image(i,1);
			}
    	}
    	EtatNJ=false;
    	return EtatNJ;
    }
	

	public Menu getSuivant() {
		return suivant;
	}

	public void setSuivant(Menu suivant) {
		this.suivant = suivant;
	}

	public int getLargeur() {
		return largeur;
	}

	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}

	public int getLongueur() {
		return longueur;
	}

	public void setLongueur(int longueur) {
		this.longueur = longueur;
	}

	public static int getnombreJoueur() {
		return nombreJoueur;
	}

	public void setnombreJoueur(int nombreJoueur) {
		nombreJoueur = nombreJoueur;
	}

}