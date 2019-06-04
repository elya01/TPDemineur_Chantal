package com.modele.com;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
public class Fenetre extends JFrame {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
int espace=5;
int mx = -100;
int my= -100;

	//ceci est un commentaire d'essai	
	public Fenetre() {
		this.setTitle("DEMINEUR");
		this.setSize(1200,850);
		 //Instanciation d'un objet JPanel
        JPanel couleur = new JPanel();
 
        //Définition de la couleur de fond
        //couleur.setBackground(Color.DARK_GRAY);  
 
        //On informe  notre JFrame que notre JPanel qui sera son contentPane
        this.setContentPane(couleur);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(false);

		
				
		Grille grille =new Grille();
		this.setContentPane(grille);//
		
		Bouger bouger= new Bouger();
		this.addMouseMotionListener(bouger);
		
		Click click = new Click();
		this.addMouseListener(click);
		
	}


	public class Grille extends JPanel{
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public void paintComponent(Graphics g) {
			g.setColor(Color.DARK_GRAY);
			g.fillRect(0, 0, 1220, 830);
			
			for (int i =0;i<16; i++) {
				for (int j=0 ; j<9; j++) {
					g.setColor(Color.GRAY);
					if(mx>= espace+i*80 && mx < i*80+80-2 * espace&& my>= espace+j*80+80+26
							&&my<espace+j*80+80+80-2*espace ) {
						g.setColor(Color.red);
					}
					g.fillRect(espace +i*80,espace +j*80+80, 80-2*espace,80-2*espace);
				}
			}		
			
		}
	}
		
	
	public class Bouger implements MouseMotionListener{

		@Override
		public void mouseDragged(MouseEvent arg0) {
		
			
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			System.out.println("Votre souris a bougé");
			mx = e.getX();
			my = e.getY();
			System.out.println("X: " + mx+",Y: "+ my);
			
		}
	}
		

		public class Click implements MouseListener{

			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("la souris a été  cliquée");
				
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}		
	
		
	}

	}

