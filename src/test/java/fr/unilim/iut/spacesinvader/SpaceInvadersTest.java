package fr.unilim.iut.spacesinvader;

import fr.unilim.iut.spacesinvader.utils.HorsEspaceJeuException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class SpaceInvadersTest {

   @Test
   public void test_AuDebut_JeuSpaceInvaderEstVide() {
	   
	    assertEquals("" + 
	    "...............\n" + 
	    "...............\n" +
	    "...............\n" + 
	    "...............\n" + 
	    "...............\n" + 
	    "...............\n" + 
	    "...............\n" + 
	    "...............\n" + 
	    "...............\n" + 
	    "...............\n" , spaceinvaders.recupererEspaceJeuDansChaineASCII());
        }
   @Test
	public void test_unNouveauVaisseauEstCorrectementPositionneDansEspaceJeu() {
		spaceinvaders.positionnerUnNouveauVaisseau(7,9);
		assertEquals("" + 
		"...............\n" + 
		"...............\n" +
		"...............\n" + 
		"...............\n" + 
		"...............\n" + 
		"...............\n" + 
		"...............\n" + 
		"...............\n" + 
		"...............\n" + 
		".......V.......\n" , spaceinvaders.recupererEspaceJeuDansChaineASCII());
	}
   @Test
	public void test_UnNouveauVaisseauPositionneHorsEspaceJeu_DoitLeverUneException() {
		
		
		try {
			spaceinvaders.positionnerUnNouveauVaisseau(15,9);
			fail("Position trop à droite : devrait déclencher une exception HorsEspaceJeuException");
		} catch (final HorsEspaceJeuException e) {
		}
		
		
		try {
			spaceinvaders.positionnerUnNouveauVaisseau(-1,9);
			fail("Position trop à gauche : devrait déclencher une exception HorsEspaceJeuException");
		} catch (final HorsEspaceJeuException e) {
		}
		
		
		try {
			spaceinvaders.positionnerUnNouveauVaisseau(14,10);
			fail("Position trop en bas : devrait déclencher une exception HorsEspaceJeuException");
		} catch (final HorsEspaceJeuException e) {
		}
		
		
		try {
			spaceinvaders.positionnerUnNouveauVaisseau(14,-1);
			fail("Position trop à haut : devrait déclencher une exception HorsEspaceJeuException");
		} catch (final HorsEspaceJeuException e) {
		}
			
	}
   
   @Test
  	public void test_VaisseauAvance_DeplacerVaisseauVersLaDroite() {
  		
  		spaceinvaders.positionnerUnNouveauVaisseau(7,9);

  		spaceinvaders.deplacerVaisseauVersLaDroite();
  		
  		assertEquals("" + 
  		"...............\n" + 
  		"...............\n" +
  		"...............\n" + 
  		"...............\n" + 
  		"...............\n" + 
  		"...............\n" + 
  		"...............\n" + 
  		"...............\n" + 
  		"...............\n" + 
  		"........V......\n" , spaceinvaders.recupererEspaceJeuDansChaineASCII());
  	}
   
   
   
   
   
   
   
   
   
   private SpaceInvaders spaceinvaders;

   @Before
   public void initialisation() {
	    spaceinvaders = new SpaceInvaders(15, 10);
   }
   
   }