package com.Frogger.Logic;

import javafx.scene.image.Image;


/**
 * End class deals with goals where user is navigating frogger towards in game
 * 
 * @author Gabriel
 *
 */
public class End extends Actor{
	boolean activated = false;
	
	/**
	 * Method is unused
	 */
	@Override
	public void act(long now) {
		// TODO Auto-generated method st
	}
	
	/**
	 * Method to initialise position and image of goals in game
	 * 
	 * @param x		Set x-Axis position of image in px
	 * @param y		Set y-Axis position of image in px
	 */
	public End(int x, int y) {
		setX(x);
		setY(y);
		setImage(new Image("file:Resources/World/End.png", 60, 60, true, true));
	}
	
	/**
	 * Method to change image of goal when user reaches the end
	 */
	public void setEnd() {
		setImage(new Image("file:Resources/World/FrogEnd.png", 70, 70, true, true));
		activated = true;
	}
	
	/**
	 * Method to signify if end goal is activated
	 * 
	 * @return boolean var 
	 */
	public boolean isActivated() {
		return activated;
	}
	

}
