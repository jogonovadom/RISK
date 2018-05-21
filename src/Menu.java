import java.awt.Font;

import edu.princeton.cs.introcs.StdDraw;




public class Menu {
	Menu suivant;
	int largeur;
    int longueur;
    
    
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
    	//les lignes suivantes servent à  choisir le nombre de joueurs
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
    	//fin choix
    	int cptm =1; //numéro de la page
    	while (true) {
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
        			
        			
        			if (224<Xm && Xm<264 && 360< Ym && Ym <396) { //On affiche les cercles dans les cases cochées
        				StdDraw.filledCircle(252,384.3,13.6);
        				if (StdDraw.isMousePressed() ) {
        					case2=true; //2 joueurs
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
    		
    		else if (cptm==3 & case2==true) {
    			AjouterTexte();
    			
    			
    			if (704<Xm && Xm<796.8 && 261< Ym && Ym <324) {
    				StdDraw.picture(800,450, "Images/menu/nom J1 1.png" );
    				if (StdDraw.isMousePressed()) {
    					StdDraw.disableDoubleBuffering();
    					cptm++;
    					
    				}
    				
    			}
    			else {
    				StdDraw.picture(800,450, "Images/menu/nom J1 0.png" );
    			}
    			
    		}
    		else if (cptm==4 & case2==true) {
    			StdDraw.text(800,495,"Joueur 2");
    	    	
    			StdDraw.show(20);
				if (704<Xm && Xm<796.8 && 261< Ym && Ym <324) {
    				StdDraw.picture(800,450, "Images/menu/nom J2 1.png" );
    				if (StdDraw.isMousePressed()) {
    					StdDraw.disableDoubleBuffering();
    					Etat = false;
      					cptm++;
      				    
      				}
				}
				else {
				  StdDraw.picture(800,450, "Images/menu/nom J2 0.png" );
				}
			}
    		
    		else if (cptm==3 & case3==true) {
    			StdDraw.text(800,495,"Joueur 1");
    			StdDraw.show(20);
    			if (704<Xm && Xm<796.8 && 261< Ym && Ym <324) {
    				StdDraw.picture(800,450, "Images/menu/nom J1 1.png" );
    				if (StdDraw.isMousePressed()) {
    					StdDraw.disableDoubleBuffering();
    					cptm++;
    					
    				}
    			}
    				else {
        				StdDraw.picture(800,450, "Images/menu/nom J1 0.png" );
        			}
    			}
    		
    		
    		else if (cptm==4 & case3==true) {
    			StdDraw.text(800,495,"Joueur 2");
    			StdDraw.show(20);
				if (704<Xm && Xm<796.8 && 261< Ym && Ym <324) {
				  StdDraw.picture(800,450, "Images/menu/nom J2 1.png" );
				  if (StdDraw.isMousePressed()) {
  					cptm++;
  					
  				}
				}
				else {
					StdDraw.picture(800,450, "Images/menu/nom J2 0.png" );
				}
			}
    		else if (cptm==5 & case3==true) {
    			StdDraw.text(800,495,"Joueur 3");
    			StdDraw.show(20);
					if (704<Xm && Xm<796.8 && 261< Ym && Ym <324) {
    				  StdDraw.picture(800,450, "Images/menu/nom J3 1.png" );
    				  if (StdDraw.isMousePressed()) {
    					StdDraw.disableDoubleBuffering();
    					Etat = false;
      					cptm++;
      				    
      				}
					}
					else {
						StdDraw.picture(800,450, "Images/menu/nom J3 0.png" );
					}
    			}
    		else if (cptm==3 & case4==true) {
    			StdDraw.text(800,495,"Joueur 1");
    			StdDraw.show(20);
    			if (704<Xm && Xm<796.8 && 261< Ym && Ym <324) {
    				StdDraw.picture(800,450, "Images/menu/nom J1 1.png" );
    				if (StdDraw.isMousePressed()) {
    					StdDraw.disableDoubleBuffering();
    					cptm++;
    					
    				}
    			}
    				else {
        				StdDraw.picture(800,450, "Images/menu/nom J1 0.png" );
        			}
    			}
    		
    		
    		else if (cptm==4 & case4==true) {
    			StdDraw.text(800,495,"Joueur 2");
    			StdDraw.show(20);
				if (704<Xm && Xm<796.8 && 261< Ym && Ym <324) {
				  StdDraw.picture(800,450, "Images/menu/nom J2 1.png" );
				  if (StdDraw.isMousePressed()) {
  					cptm++;
  					
  				}
				}
				else {
					StdDraw.picture(800,450, "Images/menu/nom J2 0.png" );
				}
			}
    		else if (cptm==5 & case4==true) {
    			StdDraw.text(800,495,"Joueur 3");
    			StdDraw.show(20);
					if (704<Xm && Xm<796.8 && 261< Ym && Ym <324) {
    				  StdDraw.picture(800,450, "Images/menu/nom J3 1.png" );
    				  if (StdDraw.isMousePressed()) {
      					cptm++;
      					
      				}
					}
					else {
						StdDraw.picture(800,450, "Images/menu/nom J3 0.png" );
					}
    			}
    		else if (cptm==6 & case4==true) {
    			StdDraw.text(800,495,"Joueur 4");
    			StdDraw.show(20);
				if (704<Xm && Xm<796.8 && 261< Ym && Ym <324) {
				  StdDraw.picture(800,450, "Images/menu/nom J4 1.png" );
				  if (StdDraw.isMousePressed()) {
  					StdDraw.disableDoubleBuffering();
  					Etat = false;
    					cptm++;
    				    
    				}
				}
				else {
					StdDraw.picture(800,450, "Images/menu/nom J4 0.png" );
				}
			}
    		else if (cptm==3 & case5==true) {
    			StdDraw.text(800,495,"Joueur 1");
    			StdDraw.show(20);
    			if (704<Xm && Xm<796.8 && 261< Ym && Ym <324) {
    				StdDraw.picture(800,450, "Images/menu/nom J1 1.png" );
    				if (StdDraw.isMousePressed()) {
    					StdDraw.disableDoubleBuffering();
    					cptm++;
    					
    				}
    			}
    				else {
        				StdDraw.picture(800,450, "Images/menu/nom J1 0.png" );
        			}
    			}
    		
    		
    		else if (cptm==4 & case5==true) {
    			StdDraw.text(800,495,"Joueur 2");
    			StdDraw.show(20);
    			if (704<Xm && Xm<796.8 && 261< Ym && Ym <324) {
				  StdDraw.picture(800,450, "Images/menu/nom J2 1.png" );
				  if (StdDraw.isMousePressed()) {
  					cptm++;
  					
  				}
				}
				else {
					StdDraw.picture(800,450, "Images/menu/nom J2 0.png" );
				}
			}
    		else if (cptm==5 & case5==true) {
    			StdDraw.text(800,495,"Joueur 3");
    			StdDraw.show(20);
    			if (704<Xm && Xm<796.8 && 261< Ym && Ym <324) {
    				  StdDraw.picture(800,450, "Images/menu/nom J3 1.png" );
    				  if (StdDraw.isMousePressed()) {
      					cptm++;
      					
      				}
					}
					else {
						StdDraw.picture(800,450, "Images/menu/nom J3 0.png" );
					}
    			}
    		else if (cptm==6 & case5==true) {
    			StdDraw.text(800,495,"Joueur 4");
    			StdDraw.show(20);
    			if (704<Xm && Xm<796.8 && 261< Ym && Ym <324) {
				  StdDraw.picture(800,450, "Images/menu/nom J4 1.png" );
				  if (StdDraw.isMousePressed()) {
  					cptm++;
  					
  				}
				}
				else {
					StdDraw.picture(800,450, "Images/menu/nom J4 0.png" );
				}
			}
    		else if (cptm==7 & case5==true) {
    			StdDraw.text(800,495,"Joueur 5");
    			StdDraw.show(20);
    			if (704<Xm && Xm<796.8 && 261< Ym && Ym <324) {
				  StdDraw.picture(800,450, "Images/menu/nom J5 1.png" );
				  if (StdDraw.isMousePressed()) {
  					StdDraw.disableDoubleBuffering();
  					Etat = false;
    					cptm++;
    				    
    				}
				}
				else {
					StdDraw.picture(800,450, "Images/menu/nom J5 0.png" );
				}
			}
    		else if (cptm==3 & case6==true) {
    			StdDraw.text(800,495,"Joueur 1");
    			StdDraw.show(20);
    			if (704<Xm && Xm<796.8 && 261< Ym && Ym <324) {
    				StdDraw.picture(800,450, "Images/menu/nom J1 1.png" );
    				if (StdDraw.isMousePressed()) {
    					StdDraw.disableDoubleBuffering();
    					cptm++;
    					
    				}
    			}
    				else {
        				StdDraw.picture(800,450, "Images/menu/nom J1 0.png" );
        			}
    			}
    		
    		
    		else if (cptm==4 & case6==true) {
    			StdDraw.text(800,495,"Joueur 2");
    			StdDraw.show(20);
    			if (704<Xm && Xm<796.8 && 261< Ym && Ym <324) {
				  StdDraw.picture(800,450, "Images/menu/nom J2 1.png" );
				  if (StdDraw.isMousePressed()) {
  					cptm++;
  					
  				}
				}
				else {
					StdDraw.picture(800,450, "Images/menu/nom J2 0.png" );
				}
			}
    		else if (cptm==5 & case6==true) {
    			StdDraw.text(800,495,"Joueur 3");
    			StdDraw.show(20);
    			if (704<Xm && Xm<796.8 && 261< Ym && Ym <324) {
    				  StdDraw.picture(800,450, "Images/menu/nom J3 1.png" );
    				  if (StdDraw.isMousePressed()) {
      					cptm++;
      					
      				}
					}
					else {
						StdDraw.picture(800,450, "Images/menu/nom J3 0.png" );
					}
    			}
    		else if (cptm==6 & case6==true) {
    			StdDraw.text(800,495,"Joueur 4");
    			StdDraw.show(20);
    			if (704<Xm && Xm<796.8 && 261< Ym && Ym <324) {
				  StdDraw.picture(800,450, "Images/menu/nom J4 1.png" );
				  if (StdDraw.isMousePressed()) {
  					cptm++;
  					
  				}
				}
				else {
					StdDraw.picture(800,450, "Images/menu/nom J4 0.png" );
				}
			}
    		else if (cptm==7 & case6==true) {
    			StdDraw.text(800,495,"Joueur 5");
    			StdDraw.show(20);
    			if (704<Xm && Xm<796.8 && 261< Ym && Ym <324) {
				  StdDraw.picture(800,450, "Images/menu/nom J5 1.png" );
				  if (StdDraw.isMousePressed()) {
  					cptm++;
  					
  				}
				}
				else {
					StdDraw.picture(800,450, "Images/menu/nom J5 0.png" );
				}
			}
    		else if (cptm==8 & case6==true) {
    			StdDraw.text(800,495,"Joueur 6");
    			StdDraw.show(20);
    			if (704<Xm && Xm<796.8 && 261< Ym && Ym <324) {
				  StdDraw.picture(800,450, "Images/menu/nom J6 1.png" );
				  if (StdDraw.isMousePressed()) {
  					StdDraw.disableDoubleBuffering();
  					Etat = false;
    					cptm++;
    				    
    				}
				}
				else {
					StdDraw.picture(800,450, "Images/menu/nom J6 0.png" );
				}
			}
    		if (Etat==false) {
    		Plateau_du_jeu.AfficherPlateau();
    		}
    		}
    	}
    	
    public void AjouterTexte() {
    	
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

}