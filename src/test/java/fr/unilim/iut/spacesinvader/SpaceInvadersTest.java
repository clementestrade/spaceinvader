package fr.unilim.iut.spacesinvader;

import fr.unilim.iut.spacesinvader.utils.HorsEspaceJeuException;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SpaceInvadersTest {

   @Test
   public void test_AuDebut_JeuSpaceInvaderEstVide() {
	    SpaceInvaders spaceInvaders = new SpaceInvaders(15, 10);
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
	    "...............\n" , spaceInvaders.toString());
        }
   @Test
	public void test_unNouveauVaisseauEstCorrectementPositionneDansEspaceJeu() {
		SpaceInvaders spaceInvaders = new SpaceInvaders(15, 10);
		spaceInvaders.positionnerUnNouveauVaisseau(7,9);
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
		".......V.......\n" , spaceInvaders.toString());
	}
   @Test(expected = HorsEspaceJeuException.class)
	public void test_unNouveauVaisseauEstPositionneHorsEspaceJeuTropADroite_UneExceptionEstLevee() throws Exception {
		SpaceInvaders spaceinvaders = new SpaceInvaders(15, 10);
		spaceinvaders.positionnerUnNouveauVaisseau(16,9);
	}

   }