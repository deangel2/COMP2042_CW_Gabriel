package com.Frogger.Logic;

import javafx.scene.image.Image;

/**
 * Digit class deals with setting image to show highscore
 * 
 * @author Gabriel
 *
 */

public class Digit extends Actor{
	int dim;
	Image im1;
	
	/**
	 * Method is unused
	 */
	@Override
	public void act(long now) {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * Method digit initialises image to be shown as user score
	 * 
	 * @param n		FilePath of image
	 * @param dim	Dimensions of image in px
	 * @param x		Set x-Axis position of image in px
	 * @param y		Set y-Axis position of image in px
	 */
	public Digit(int n, int dim, int x, int y) {
		im1 = new Image("file:Resources/World/"+n+".png", dim, dim, true, true);
		setImage(im1);
		setX(x);
		setY(y);
	}
	
}
