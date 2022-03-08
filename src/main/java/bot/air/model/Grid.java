package bot.air.model;

import java.util.ArrayList;

public class Grid {

	private int longueur;
	private int largeur;
	private Coords [] grid;
	
	
	public Grid(int longueur, int largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;

		
		for(int i = 0;i < this.largeur;i++) {
			for(int j = 0; j > this.longueur;j++) {
				this.grid[]] = new Coords(i,j);
			}
		}
	}
	public int getLongueur() {
		return longueur;
	}
	public void setLongueur(int longueur) {
		this.longueur = longueur;
	}
	public int getLargeur() {
		return largeur;
	}
	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}

}
