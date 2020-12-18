package com.Frogger.Entity;

import com.Frogger.Logic.Actor;

import javafx.scene.image.Image;

/**
 * Log class deals with properties of log entity
 * 
 * @author Gabriel
 *
 */
public class Log extends Actor {

	private double speed;
	
	/**
	 * Method to set the movement speed of log entity
	 */
	@Override
	public void act(long now) {
		move(speed , 0);
		if (getX()>600 && speed>0)
			setX(-180);
		if (getX()<-300 && speed<0)
			setX(700);
	}
	
	/**
	 * Method to initialise log entity:
	 * <p>
	 * 1) Set log Image
	 * <p>
	 * 2) Set log starting position
	 * <p>
	 * 3) Set log movement speed
	 * 
	 * @param imageLink 	FilePath of image of log entity
	 * @param size			Size of image in px
	 * @param xpos			Set x-Axis position of log in px
	 * @param ypos			Set y-Axis position of log in px
	 * @param s				Movement speed of log entity
	 */
	public Log(String imageLink, int size, int xpos, int ypos, double s) {
		setImage(new Image(imageLink, size, size, true, true));
		setX(xpos);
		setY(ypos);
		speed = s;
		
	}
	
	/**
	 * Method to get movement speed of log entity
	 * 
	 * @return speed at which log entity is moving
	 */
	public boolean getLeft() {
		return speed < 0;
	}
}
