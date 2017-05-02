package fr.unilim.iut.spacesinvader;

public class SpaceInvaders {

    private static final char MARQUE_VAISSEAU = 'V';
	int longueur;
    int hauteur;
    Vaisseau vaisseau;
    
    
    public SpaceInvaders(int longueur, int hauteur) {
	   this.longueur = longueur;
	   this.hauteur = hauteur;
   }
    
    
    
    public void positionnerUnNouveauVaisseau(int x, int y) {
        Vaisseau vaisseau = new Vaisseau(x,y);
	}

    @Override
	public String toString() {
		StringBuilder espaceDeJeu = new StringBuilder();
		
		for (int y = 0; y < hauteur; y++) {
			for (int x = 0; x < longueur; x++) {
				
				espaceDeJeu.append(recupererMarqueDeLaPosition(x, y));
			}
			espaceDeJeu.append('\n');
		}
		return espaceDeJeu.toString();
	}



	private char recupererMarqueDeLaPosition(int x, int y) {
		char marque;
		
		if (this.aUnVaisseauQuiOccupeLaPosition(x, y))
		      marque=MARQUE_VAISSEAU;
		else
		      marque='.';
		return marque;
	}



	private boolean aUnVaisseauQuiOccupeLaPosition(int x, int y) {
		return this.aUnVaisseau() && vaisseau.occupeLaPosition(x, y);
	}



	private boolean aUnVaisseau() {
		return vaisseau!=null;
	}
}