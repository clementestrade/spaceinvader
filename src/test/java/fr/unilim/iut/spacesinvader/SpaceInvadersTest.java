package fr.unilim.iut.spacesinvader;

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
		"...............\n" , spaceInvaders.toString());
	}

   }