package com.Frogger.Entity;

import com.Frogger.Logic.Actor;

import javafx.scene.image.Image;

/**
 * WetTurtle Class deals with properties of WetTurtle entity
 * 
 * @author Gabriel
 *
 */
public class WetTurtle extends Actor{
	Image turtle1;
	Image turtle2;
	Image turtle3;
	Image turtle4;
	//Set value to be divided by
	private static final int value = 900000000;
	private int speed;
	int i = 1;
	boolean bool = true;
	boolean sunk = false;
	
	/**
	 * Method to simulate movement of entity WetTurtle
	 */
	@Override
	public void act(long now) {

				if (now/value  % 4 ==0) {
					setImage(turtle2);
					sunk = false;
					
				}
				else if (now/value % 4 == 1) {
					setImage(turtle1);
					sunk = false;
				}
				else if (now/value %4 == 2) {
					setImage(turtle3);
					sunk = false;
				} else if (now/value %4 == 3) {
					setImage(turtle4);
					sunk = true;
				}
			
		move(speed , 0);
		if (getX() > 600 && speed>0)
			setX(-200);
		if (getX() < -75 && speed<0)
			setX(600);
	}
	
	/**
	 * Method to initialise WetTurtle entity
	 * <p>
	 * 1) Set WetTurtle Image
	 * <p>
	 * 2) Set WetTurtle starting position
	 * <p>
	 * 3) Set WetTurtle movement speed
	 * 
	 * @param xpos			x-Axis position of WetTurtle in px
	 * @param ypos			y-Axis position of WetTurtle in px
	 * @param s				Speed of WetTurtle
	 * @param w				Image width of WetTurtle
	 * @param h				Image height of WetTurtle
	 */
	public WetTurtle(int xpos, int ypos, int s, int w, int h) {
		setTurtleImage(w, h);
		setX(xpos);
		setY(ypos);
		speed = s;
		setImage(turtle2);
	}
	
	/**
	 * Method to detect stage of WetTurtle Animation
	 * 
	 * @return	boolean var if entity is sunk
	 */
	public boolean isSunk() {
		return sunk;
	}
	
	/**
	 * Method to initilaise instance of WetTurtle Entity
	 * 
	 * @param w		Image width of WetTurtle
	 * @param h		Image width of WetTurtle
	 */
	public void setTurtleImage(int w, int h)
	{
		turtle1 = new Image("file:Resources/Entity/TurtleAnimation1.png", w, h, true, true);
		turtle2 = new Image("file:Resources/Entity/TurtleAnimation2Wet.png", w, h, true, true);
		turtle3 = new Image("file:Resources/Entity/TurtleAnimation3Wet.png", w, h, true, true);
		turtle4 = new Image("file:Resources/Entity/TurtleAnimation4Wet.png", w, h, true, true);
	}
}
