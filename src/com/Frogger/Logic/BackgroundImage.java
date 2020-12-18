package com.Frogger.Logic;

import javafx.scene.image.Image;

/**
 * BackgroundImage class deals with initialization of background image
 * 
 * @author Gabriel
 *
 */
public class BackgroundImage extends Actor{
	
	/**
	 * Method is unused
	 */
	@Override
	public void act(long now) {
	//???
		
	}
	
	/**
	 * BackgroundImage set new background image
	 * 
	 * @param imageLink FilePath of Background to be shown
	 */
	public BackgroundImage(String imageLink) {
		setImage(new Image(imageLink, 600, 800, true, true));
		
	}

}
