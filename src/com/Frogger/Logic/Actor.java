package com.Frogger.Logic;

import javafx.scene.image.ImageView;
import javafx.scene.input.InputEvent;

import java.util.ArrayList;

/**
 * Abstract Actor Class
 * 
 * @author gabby
 *
 */

public abstract class Actor extends ImageView{

	/**
	 * Set Movement
	 * @param dx	direction x-Axis
	 * @param dy	direction y-Axis
	 */
    public void move(double dx, double dy) {
        setX(getX() + dx);
        setY(getY() + dy);
    }
    
    public World getWorld() {
        return (World) getParent();
    }

    public double getWidth() {
        return this.getBoundsInLocal().getWidth();
    }

    public double getHeight() {
        return this.getBoundsInLocal().getHeight();
    }

    public <A extends Actor> java.util.List<A> getIntersectingObjects(java.lang.Class<A> cls){
        ArrayList<A> someArray = new ArrayList<A>();
        for (A actor: getWorld().getObjects(cls)) {
            if (actor != this && actor.intersects(this.getBoundsInLocal())) {
                someArray.add(actor);
            }
        }
        return someArray;
    }
    
    /**
     * Initialise event upon keypress
     * 
     * @param e	Input key of User
     */
    public void manageInput(InputEvent e) {
        
    }

    /**
     * Initialise event if player collides with object
     * 
     * @param <A>	Object that is intersecting
     * @param cls	Intersecting by how much
     * @return		Some command
     */
    public <A extends Actor> A getOneIntersectingObject(java.lang.Class<A> cls) {
        ArrayList<A> someArray = new ArrayList<A>();
        for (A actor: getWorld().getObjects(cls)) {
            if (actor != this && actor.intersects(this.getBoundsInLocal())) {
                someArray.add(actor);
                break;
            }
        }
        return someArray.get(0);
    }

    /**
     * Define movement speed of object
     * 
     * @param now	Unknown
     */
    public abstract void act(long now);

}
