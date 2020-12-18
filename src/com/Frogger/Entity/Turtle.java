package com.Frogger.Entity;

import com.Frogger.Logic.Actor;

import javafx.scene.image.Image;

/**
 * Turtle Class deals with properties of turtle entity
 * 
 * @author Gabriel
 *
 */
public class Turtle extends Actor{
	Image turtle1;
	Image turtle2;
	Image turtle3;
	private int speed;
	int i = 1;
	boolean bool = true;
	
	/**
	 * Method to initialise speed and image of turtle entity
	 */
	@Override
	public void act(long now) {

				if (now/900000000  % 3 ==0) {
					setImage(turtle2);
					
				}
				else if (now/900000000 % 3 == 1) {
					setImage(turtle1);
					
				}
				else if (now/900000000 %3 == 2) {
					setImage(turtle3);
					
				}
			
		move(speed , 0);
		if (getX() > 600 && speed>0)
			setX(-200);
		if (getX() < -75 && speed<0)
			setX(600);
	}
	
	/**
	 * Method to initialise turtle entity
	 * <p>
	 * 1) Set Turtle Image
	 * <p>
	 * 2) Set Turtle starting position
	 * <p>
	 * 3) Set Turtle movement speed
	 * 
	 * @param xpos	x-Axis position of turtle in px
	 * @param ypos	y-Axis position of turtle in px
	 * @param s		Speed of turtle
	 * @param w		Image width of tutrle
	 * @param h		Image height of turtle
	 */
	public Turtle(int xpos, int ypos, int s, int w, int h) {
		turtleSetImage(w, h);
		setX(xpos);
		setY(ypos);
		speed = s;
		setImage(turtle2);
	}
	
	/**
	 * Method to initialise instance of Turtle entity
	 * 
	 * @param w		Image width of Turtle
	 * @param h		Image width of Turtle
	 */
	public void turtleSetImage(int w, int h)
	{
		turtle1 = new Image("file:Resources/Entity/TurtleAnimation1.png", w, h, true, true);
		turtle2 = new Image("file:Resources/Entity/TurtleAnimation2.png", w, h, true, true);
		turtle3 = new Image("file:Resources/Entity/TurtleAnimation3.png", w, h, true, true);
	}
}
