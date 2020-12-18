package com.Frogger.Entity;

import com.Frogger.Logic.Actor;

import javafx.scene.image.Image;

/**
 * Obstacle Class deals with properties of car and truck obstacle
 * 
 * @author Gabriel
 *
 */
public class Obstacle extends Actor {
	private int speed;
	
	/**
	 * Method to set movement speed of obstacles
	 */
	@Override
	public void act(long now) {
		move(speed , 0);
		if (getX() > 600 && speed>0)
			setX(-200);
		if (getX() < -50 && speed<0)
			setX(600);
	}
	
	/**
	 * Method to initialise obstacle entity
	 * <p>
	 * 1) Set obstacle Image
	 * <p>
	 * 2) Set obstacle starting position
	 * <p>
	 * 3) Set obstacle movement speed
	 * 
	 * @param imageLink		FilePath of image of obstacle entity
	 * @param xpos			x-Axis position of obstacle in px
	 * @param ypos			y-Axis position of obstacle in px
	 * @param s				Speed of obstacle
	 * @param w				Image width of obstacle
	 * @param h				Image height of obstacle
	 */
	public Obstacle(String imageLink, int xpos, int ypos, int s, int w, int h) {
		setImage(new Image(imageLink, w,h, true, true));
		setX(xpos);
		setY(ypos);
		speed = s;
	}

}
