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
    	 
    	
    	StdDraw.setXscale();
    	StdDraw.setYscale();
    	StdDraw.setCanvasSize(this.largeur,this.longueur);
    	Font font = new Font("SansSerif",Font.BOLD,30);
    	StdDraw.setFont(font);
    	//les lignes suivantes servent à choisir le nombre de joueurs
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
    	int cptm =1; //num�ro de la page
    	while (true) {
    		double Xm=StdDraw.mouseX();
    		double Ym=StdDraw.mouseY();
    		
    		if (cptm == 1) {
        		if ( 0.45<Xm && Xm<0.55 && 0.36< Ym && Ym <0.41 ) {
        			
        			StdDraw.picture(0.5,0.5, "Images/menu/jeu du risk menu 1.png",1,1 );
        			if (StdDraw.isMousePressed()) {
        				cptm ++;
        			}
        		}
        					
        		else if ( 0.42<Xm && Xm<0.58 && 0.23< Ym && Ym <0.28 ) {
        			StdDraw.picture(0.5,0.5, "Images/menu/jeu du risk menu 2.png",1,1 );
        		}
        				
        		else {
        			StdDraw.picture(0.5,0.5, "Images/menu/jeu du risk menu 0.png",1,1 );
        		}
    		}
    		else if (cptm==2) {
    		    
    			StdDraw.rectangle(0.157,0.427,(0.166-0.149)/2,0.02);
    			StdDraw.rectangle(0.157+0.069,0.427,(0.165625-0.149375)/2,0.02);
    			StdDraw.rectangle(0.156875+0.069*2,0.42666666666666664,(0.165625-0.149375)/2,0.02);
    			StdDraw.rectangle(0.156875+0.067*3,0.42666666666666664,(0.165625-0.149375)/2,0.02);
    			StdDraw.rectangle(0.156875+0.068*4,0.42666666666666664,(0.165625-0.149375)/2,0.02);
    			StdDraw.enableDoubleBuffering();
    			StdDraw.show();
    			if (0.44<Xm && Xm<0.498 && 0.29< Ym && Ym <0.36) {
    				StdDraw.picture(0.5,0.5, "Images/menu/nombre de joueur 2.png",1,1 );
    				
    				if (case2==true) {
        				StdDraw.filledCircle(0.156875,0.42666666666666664,(0.165625-0.149375)/2);
        				
        		    	case3=false;			
        		    	case4=false;
        		    	case5=false;
        		    	case6=false;
        			}
    				
    				if (case3==true) {
        				StdDraw.filledCircle(0.156875+0.069,0.42666666666666664,(0.165625-0.149375)/2);
        				case2=false;			
        		    	case4=false;
        		    	case5=false;
        		    	case6=false;
        			}
    				
    				if (case4==true) {
        				StdDraw.filledCircle(0.156875+0.069*2,0.42666666666666664,(0.165625-0.149375)/2);
        				case3=false;			
        		    	case2=false;
        		    	case5=false;
        		    	case6=false;
        			}
    				
    				if (case5==true) {
        				StdDraw.filledCircle(0.156875+0.067*3,0.42666666666666664,(0.165625-0.149375)/2);
        				case3=false;			
        		    	case4=false;
        		    	case2=false;
        		    	case6=false;
        			}
    				
    				if (case6==true) {
        				StdDraw.filledCircle(0.156875+0.068*4,0.42666666666666664,(0.165625-0.149375)/2);
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
    				StdDraw.picture(0.5,0.5, "Images/menu/nombre de joueur 1.png" );
        			
        			
        			if (0.14<Xm && Xm<0.165 && 0.4< Ym && Ym <0.44) { //On affiche les cercles dans les cases � cocher
        				StdDraw.filledCircle(0.156875,0.42666666666666664,(0.165625-0.149375)/2);
        				if (StdDraw.isMousePressed() ) {
        					
        					
        					case2=true;
            			}
        			}
        			
					if (case2==true) {
        				StdDraw.filledCircle(0.156875,0.42666666666666664,(0.165625-0.149375)/2);
        				case3=false;			
        		    	case4=false;
        		    	case5=false;
        		    	case6=false;
        			}
					
        		    if ( 0.14+0.069<Xm && Xm<0.165+0.069 && 0.4< Ym && Ym <0.44 ) {
        				StdDraw.filledCircle(0.156875+0.069,0.42666666666666664,(0.165625-0.149375)/2);
        				if (StdDraw.isMousePressed()) {
        					StdDraw.filledCircle(0.156875+0.069,0.42666666666666664,(0.165625-0.149375)/2);
        					case3=true;
            			}
        			}
					
					if (case3==true) {
        				StdDraw.filledCircle(0.156875+0.069,0.42666666666666664,(0.165625-0.149375)/2);
        				case2=false;			
        		    	case4=false;
        		    	case5=false;
        		    	case6=false;
        			}
					
        		    if ( 0.14+0.069*2<Xm && Xm<0.165+0.069*2 && 0.4< Ym && Ym <0.44 ) {
        				StdDraw.filledCircle(0.156875+0.069*2,0.42666666666666664,(0.165625-0.149375)/2);
        				if (StdDraw.isMousePressed()) {
        					StdDraw.filledCircle(0.156875+0.069*2,0.42666666666666664,(0.165625-0.149375)/2);
        					case4=true;
            			}
        			}
        			
					if (case4==true) {
        				StdDraw.filledCircle(0.156875+0.069*2,0.42666666666666664,(0.165625-0.149375)/2);
        				case3=false;			
        		    	case2=false;
        		    	case5=false;
        		    	case6=false;
        			}
					
        			if ( 0.14+0.067*3<Xm && Xm<0.165+0.067*3 && 0.4< Ym && Ym <0.44 ) {
        				StdDraw.filledCircle(0.156875+0.067*3,0.42666666666666664,(0.165625-0.149375)/2);
        				if (StdDraw.isMousePressed()) {
        					StdDraw.filledCircle(0.156875+0.067*3,0.42666666666666664,(0.165625-0.149375)/2);
        					case5=true;
            			}
        			}
        			
					if (case5==true) {
        				StdDraw.filledCircle(0.156875+0.067*3,0.42666666666666664,(0.165625-0.149375)/2);
        				case3=false;			
        		    	case4=false;
        		    	case2=false;
        		    	case6=false;
        			}
					
        			if ( 0.14+0.068*4<Xm && Xm<0.165+0.068*4 && 0.4< Ym && Ym <0.44 ) {
        				StdDraw.filledCircle(0.156875+0.068*4,0.42666666666666664,(0.165625-0.149375)/2);
        				if (StdDraw.isMousePressed()) {
        					StdDraw.filledCircle(0.156875+0.068*4,0.42666666666666664,(0.165625-0.149375)/2);
        					case6=true;
            			}
        			}
					
					if (case6==true) {
        				StdDraw.filledCircle(0.156875+0.068*4,0.42666666666666664,(0.165625-0.149375)/2);
        				case3=false;			
        		    	case4=false;
        		    	case5=false;
        		    	case2=false;
        			}
        			
    			}
    			
    			
    				
    		}
    		
    		else if (cptm==3 & case2==true) {
    			AjouterTexte();
    			
    			
    			if (0.44<Xm && Xm<0.498 && 0.29< Ym && Ym <0.36) {
    				StdDraw.picture(0.5,0.5, "Images/menu/nom J1 1.png" );
    				if (StdDraw.isMousePressed()) {
    					StdDraw.disableDoubleBuffering();
    					cptm++;
    					
    				}
    				
    			}
    			else {
    				StdDraw.picture(0.5,0.5, "Images/menu/nom J1 0.png" );
    			}
    			
    		}
    		else if (cptm==4 & case2==true) {
    			StdDraw.text(0.5, 0.55,"Joueur 2");
    	    	
    			StdDraw.show(20);
				if (0.44<Xm && Xm<0.498 && 0.29< Ym && Ym <0.36) {
    				StdDraw.picture(0.5,0.5, "Images/menu/nom J2 1.png" );
				}
				else {
				  StdDraw.picture(0.5,0.5, "Images/menu/nom J2 0.png" );
				}
			}
    		
    		else if (cptm==3 & case3==true) {
    			StdDraw.text(0.5, 0.55,"Joueur 1");
    			StdDraw.show(20);
    			if (0.44<Xm && Xm<0.498 && 0.29< Ym && Ym <0.36) {
    				StdDraw.picture(0.5,0.5, "Images/menu/nom J1 1.png" );
    				if (StdDraw.isMousePressed()) {
    					StdDraw.disableDoubleBuffering();
    					cptm++;
    					
    				}
    			}
    				else {
        				StdDraw.picture(0.5,0.5, "Images/menu/nom J1 0.png" );
        			}
    			}
    		
    		
    		else if (cptm==4 & case3==true) {
    			StdDraw.text(0.5, 0.55,"Joueur 2");
    			StdDraw.show(20);
				if (0.44<Xm && Xm<0.498 && 0.29< Ym && Ym <0.36) {
				  StdDraw.picture(0.5,0.5, "Images/menu/nom J2 1.png" );
				  if (StdDraw.isMousePressed()) {
  					cptm++;
  					
  				}
				}
				else {
					StdDraw.picture(0.5,0.5, "Images/menu/nom J2 0.png" );
				}
			}
    		else if (cptm==5 & case3==true) {
    			StdDraw.text(0.5, 0.55,"Joueur 3");
    			StdDraw.show(20);
					if (0.44<Xm && Xm<0.498 && 0.29< Ym && Ym <0.36) {
    				  StdDraw.picture(0.5,0.5, "Images/menu/nom J3 1.png" );
    				  if (StdDraw.isMousePressed()) {
      					cptm++;
      					
      				}
					}
					else {
						StdDraw.picture(0.5,0.5, "Images/menu/nom J3 0.png" );
					}
    			}
    		else if (cptm==3 & case4==true) {
    			StdDraw.text(0.5, 0.55,"Joueur 1");
    			StdDraw.show(20);
    			if (0.44<Xm && Xm<0.498 && 0.29< Ym && Ym <0.36) {
    				StdDraw.picture(0.5,0.5, "Images/menu/nom J1 1.png" );
    				if (StdDraw.isMousePressed()) {
    					StdDraw.disableDoubleBuffering();
    					cptm++;
    					
    				}
    			}
    				else {
        				StdDraw.picture(0.5,0.5, "Images/menu/nom J1 0.png" );
        			}
    			}
    		
    		
    		else if (cptm==4 & case4==true) {
    			StdDraw.text(0.5, 0.55,"Joueur 2");
    			StdDraw.show(20);
				if (0.44<Xm && Xm<0.498 && 0.29< Ym && Ym <0.36) {
				  StdDraw.picture(0.5,0.5, "Images/menu/nom J2 1.png" );
				  if (StdDraw.isMousePressed()) {
  					cptm++;
  					
  				}
				}
				else {
					StdDraw.picture(0.5,0.5, "Images/menu/nom J2 0.png" );
				}
			}
    		else if (cptm==5 & case4==true) {
    			StdDraw.text(0.5, 0.55,"Joueur 3");
    			StdDraw.show(20);
					if (0.44<Xm && Xm<0.498 && 0.29< Ym && Ym <0.36) {
    				  StdDraw.picture(0.5,0.5, "Images/menu/nom J3 1.png" );
    				  if (StdDraw.isMousePressed()) {
      					cptm++;
      					
      				}
					}
					else {
						StdDraw.picture(0.5,0.5, "Images/menu/nom J3 0.png" );
					}
    			}
    		else if (cptm==6 & case4==true) {
    			StdDraw.text(0.5, 0.55,"Joueur 4");
    			StdDraw.show(20);
				if (0.44<Xm && Xm<0.498 && 0.29< Ym && Ym <0.36) {
				  StdDraw.picture(0.5,0.5, "Images/menu/nom J4 1.png" );
				  if (StdDraw.isMousePressed()) {
  					cptm++;
  					
  				}
				}
				else {
					StdDraw.picture(0.5,0.5, "Images/menu/nom J4 0.png" );
				}
			}
    		else if (cptm==3 & case5==true) {
    			StdDraw.text(0.5, 0.55,"Joueur 1");
    			StdDraw.show(20);
    			if (0.44<Xm && Xm<0.498 && 0.29< Ym && Ym <0.36) {
    				StdDraw.picture(0.5,0.5, "Images/menu/nom J1 1.png" );
    				if (StdDraw.isMousePressed()) {
    					StdDraw.disableDoubleBuffering();
    					cptm++;
    					
    				}
    			}
    				else {
        				StdDraw.picture(0.5,0.5, "Images/menu/nom J1 0.png" );
        			}
    			}
    		
    		
    		else if (cptm==4 & case5==true) {
    			StdDraw.text(0.5, 0.55,"Joueur 2");
    			StdDraw.show(20);
				if (0.44<Xm && Xm<0.498 && 0.29< Ym && Ym <0.36) {
				  StdDraw.picture(0.5,0.5, "Images/menu/nom J2 1.png" );
				  if (StdDraw.isMousePressed()) {
  					cptm++;
  					
  				}
				}
				else {
					StdDraw.picture(0.5,0.5, "Images/menu/nom J2 0.png" );
				}
			}
    		else if (cptm==5 & case5==true) {
    			StdDraw.text(0.5, 0.55,"Joueur 3");
    			StdDraw.show(20);
					if (0.44<Xm && Xm<0.498 && 0.29< Ym && Ym <0.36) {
    				  StdDraw.picture(0.5,0.5, "Images/menu/nom J3 1.png" );
    				  if (StdDraw.isMousePressed()) {
      					cptm++;
      					
      				}
					}
					else {
						StdDraw.picture(0.5,0.5, "Images/menu/nom J3 0.png" );
					}
    			}
    		else if (cptm==6 & case5==true) {
    			StdDraw.text(0.5, 0.55,"Joueur 4");
    			StdDraw.show(20);
				if (0.44<Xm && Xm<0.498 && 0.29< Ym && Ym <0.36) {
				  StdDraw.picture(0.5,0.5, "Images/menu/nom J4 1.png" );
				  if (StdDraw.isMousePressed()) {
  					cptm++;
  					
  				}
				}
				else {
					StdDraw.picture(0.5,0.5, "Images/menu/nom J4 0.png" );
				}
			}
    		else if (cptm==7 & case5==true) {
    			StdDraw.text(0.5, 0.55,"Joueur 5");
    			StdDraw.show(20);
				if (0.44<Xm && Xm<0.498 && 0.29< Ym && Ym <0.36) {
				  StdDraw.picture(0.5,0.5, "Images/menu/nom J5 1.png" );
				  if (StdDraw.isMousePressed()) {
  					cptm++;
  					
  				}
				}
				else {
					StdDraw.picture(0.5,0.5, "Images/menu/nom J5 0.png" );
				}
			}
    		else if (cptm==3 & case6==true) {
    			StdDraw.text(0.5, 0.55,"Joueur 1");
    			StdDraw.show(20);
    			if (0.44<Xm && Xm<0.498 && 0.29< Ym && Ym <0.36) {
    				StdDraw.picture(0.5,0.5, "Images/menu/nom J1 1.png" );
    				if (StdDraw.isMousePressed()) {
    					StdDraw.disableDoubleBuffering();
    					cptm++;
    					
    				}
    			}
    				else {
        				StdDraw.picture(0.5,0.5, "Images/menu/nom J1 0.png" );
        			}
    			}
    		
    		
    		else if (cptm==4 & case6==true) {
    			StdDraw.text(0.5, 0.55,"Joueur 2");
    			StdDraw.show(20);
				if (0.44<Xm && Xm<0.498 && 0.29< Ym && Ym <0.36) {
				  StdDraw.picture(0.5,0.5, "Images/menu/nom J2 1.png" );
				  if (StdDraw.isMousePressed()) {
  					cptm++;
  					
  				}
				}
				else {
					StdDraw.picture(0.5,0.5, "Images/menu/nom J2 0.png" );
				}
			}
    		else if (cptm==5 & case6==true) {
    			StdDraw.text(0.5, 0.55,"Joueur 3");
    			StdDraw.show(20);
					if (0.44<Xm && Xm<0.498 && 0.29< Ym && Ym <0.36) {
    				  StdDraw.picture(0.5,0.5, "Images/menu/nom J3 1.png" );
    				  if (StdDraw.isMousePressed()) {
      					cptm++;
      					
      				}
					}
					else {
						StdDraw.picture(0.5,0.5, "Images/menu/nom J3 0.png" );
					}
    			}
    		else if (cptm==6 & case6==true) {
    			StdDraw.text(0.5, 0.55,"Joueur 4");
    			StdDraw.show(20);
				if (0.44<Xm && Xm<0.498 && 0.29< Ym && Ym <0.36) {
				  StdDraw.picture(0.5,0.5, "Images/menu/nom J4 1.png" );
				  if (StdDraw.isMousePressed()) {
  					cptm++;
  					
  				}
				}
				else {
					StdDraw.picture(0.5,0.5, "Images/menu/nom J4 0.png" );
				}
			}
    		else if (cptm==7 & case6==true) {
    			StdDraw.text(0.5, 0.55,"Joueur 5");
    			StdDraw.show(20);
				if (0.44<Xm && Xm<0.498 && 0.29< Ym && Ym <0.36) {
				  StdDraw.picture(0.5,0.5, "Images/menu/nom J5 1.png" );
				  if (StdDraw.isMousePressed()) {
  					cptm++;
  					
  				}
				}
				else {
					StdDraw.picture(0.5,0.5, "Images/menu/nom J5 0.png" );
				}
			}
    		else if (cptm==8 & case6==true) {
    			StdDraw.text(0.5, 0.55,"Joueur 6");
    			StdDraw.show(20);
				if (0.44<Xm && Xm<0.498 && 0.29< Ym && Ym <0.36) {
				  StdDraw.picture(0.5,0.5, "Images/menu/nom J6 1.png" );
				  if (StdDraw.isMousePressed()) {
  					cptm++;
  					
  				}
				}
				else {
					StdDraw.picture(0.5,0.5, "Images/menu/nom J6 0.png" );
				}
			}
    		
    		}
    	}
    	
    public void AjouterTexte() {
    	
    	String  texte = "Joueur 1";
    	
    	//texte = texte + StdDraw.nextKeyTyped() + " ";
    	
		//StdDraw.disableDoubleBuffering();
    	//while (StdDraw.isKeyPressed(3)==false) {
    	//if (StdDraw.hasNextKeyTyped()) {
    	//texte = texte + StdDraw.nextKeyTyped() + " ";
    	//StdDraw.enableDoubleBuffering();
		//StdDraw.show();
		//StdDraw.disableDoubleBuffering();
    	//}
    	//}
    	StdDraw.text(0.5, 0.55,texte);
    	
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