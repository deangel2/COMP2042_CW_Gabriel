package com.Frogger.Main;

import java.io.File;
import java.util.List;

import com.Frogger.Entity.Log;
import com.Frogger.Entity.Obstacle;
import com.Frogger.Entity.Turtle;
import com.Frogger.Entity.WetTurtle;
import com.Frogger.Logic.Animal;
import com.Frogger.Logic.BackgroundImage;
import com.Frogger.Logic.Digit;
import com.Frogger.Logic.End;
import com.Frogger.Logic.MyStage;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * Main Method used to start game of Frogger.
 * <p>
 * Includes initialisation of background, entities, player, and BGM
 * 
 * @author Gabriel
 *
 */

public class Main extends Application {
	AnimationTimer timer;
	MyStage background;
	Animal animal;
	
	/**
	 * Main Method is unused when creating JavaFX Application
	 * @param args Unused
	 */
	public static void main(String[] args) {
		launch(args);
	}
	
	/**
	 * Method used to start Frogger Application, initialisation of entities
	 */
	@Override
	public void start(Stage primaryStage){
	    background = new MyStage();
	    Scene scene  = new Scene(background,600,800);
	
	    //Game Background
		BackgroundImage froggerback = new BackgroundImage("file:Resources/World/FrogEmpty.jpg");
		background.add(froggerback);
		
		//Create New Items/Entities
		addNewLog();
		addNewEntity();
		animal = new Animal("file:Resources/Player/froggerUp.png");
		background.add(animal);
		addNewObstacle();
		
		//Start Frogger
		background.add(new Digit(0, 30, 360, 25));
		background.start();
		primaryStage.setScene(scene);
		primaryStage.show();
		start();
		
	}
	
	/**
	 * Method have 2 functions:
	 * <p>
	 * 1) To count points whilst playing
	 * <p>
	 * 2) To stop Background Music and show high score when game is over
	 */
	
	public void createTimer() {
        timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
            	if (animal.changeScore()) {
            		setNumber(animal.getPoints());
            	}
            	if (animal.getStop()) {
            		System.out.print("STOPP:");
            		background.stopMusic();
            		stop();
            		background.stop();
            		showNewAlert();
            	}
            }
        };
    }
	
	/**
	 * Method to start BGM and start new timer instance
	 */
	
	public void start() {
		background.playMusic();
    	createTimer();
        timer.start();
    }
	
	/**
	 * Method to stop timer
	 */
    public void stop() {
        timer.stop();
    }
    
    /**
     * Method is to show high score to user once level ends
     */
    public void showNewAlert()
    {
    	Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("You Have Won The Game!");
		alert.setHeaderText("Your High Score: "+animal.getPoints()+"!");
		alert.setContentText("Highest Possible Score: 800");
		alert.show();
    }
    
    /**
     * Method to show high score in game
     * 
     * @param n This is score of user to be shown in game
     */
    
    public void setNumber(int n) {
    	int shift = 0;
    	while (n > 0) {
    		  int d = n / 10;
    		  int k = n - d * 10;
    		  n = d;
    		  background.add(new Digit(k, 30, 360 - shift, 25));
    		  shift+=30;
    		}
    }
    
    /**
     * Method to initialise new Log entity into game
     */
    public void addNewLog()
    {
    	//Add New Log
    	background.add(new Log("file:Resources/Entity/log3.png", 150, 0, 166, 0.75));
    	background.add(new Log("file:Resources/Entity/log3.png", 150, 220, 166, 0.75));
    	background.add(new Log("file:Resources/Entity/log3.png", 150, 440, 166, 0.75));
    	background.add(new Log("file:Resources/Entity/logs.png", 300, 0, 276, -2));
    	background.add(new Log("file:Resources/Entity/logs.png", 300, 400, 276, -2));
    	background.add(new Log("file:Resources/Entity/log3.png", 150, 50, 329, 0.75));
    	background.add(new Log("file:Resources/Entity/log3.png", 150, 270, 329, 0.75));
    	background.add(new Log("file:Resources/Entity/log3.png", 150, 490, 329, 0.75));
    			
    }
    
    
    /**
     * Method to initialise new Turtles and End Goal entities into game
     */
    public void addNewEntity()
    {
    	//Add New Entity
    	background.add(new Turtle(500, 376, -1, 130, 130));
    	background.add(new Turtle(300, 376, -1, 130, 130));
    	background.add(new WetTurtle(700, 376, -1, 130, 130));
    	background.add(new WetTurtle(600, 217, -1, 130, 130));
    	background.add(new WetTurtle(400, 217, -1, 130, 130));
    	background.add(new WetTurtle(200, 217, -1, 130, 130));
    	background.add(new End(13,96));
    	background.add(new End(141,96));
    	background.add(new End(141 + 141-13,96));
    	background.add(new End(141 + 141-13+141-13+1,96));
    	background.add(new End(141 + 141-13+141-13+141-13+3,96));
    }
    
    /**
     * Method to initialise new Car and Truck obstacle into game
     */
    public void addNewObstacle()
    {
    	//Add New Obstacle
    	background.add(new Obstacle("file:Resources/Entity/truck1"+"Right.png", 0, 649, 1, 120, 120));
		background.add(new Obstacle("file:Resources/Entity/truck1"+"Right.png", 300, 649, 1, 120, 120));
		background.add(new Obstacle("file:Resources/Entity/truck1"+"Right.png", 600, 649, 1, 120, 120));
		background.add(new Obstacle("file:Resources/Entity/car1Left.png", 100, 597, -1, 50, 50));
		background.add(new Obstacle("file:Resources/Entity/car1Left.png", 250, 597, -1, 50, 50));
		background.add(new Obstacle("file:Resources/Entity/car1Left.png", 400, 597, -1, 50, 50));
		background.add(new Obstacle("file:Resources/Entity/car1Left.png", 550, 597, -1, 50, 50));
		background.add(new Obstacle("file:Resources/Entity/truck2Right.png", 0, 540, 1, 200, 200));
		background.add(new Obstacle("file:Resources/Entity/truck2Right.png", 500, 540, 1, 200, 200));
		background.add(new Obstacle("file:Resources/Entity/car1Left.png", 500, 490, -5, 50, 50));
    }
}


//--module-path C:\Users\gabby\eclipse\java-2020-09\eclipse\dropins\javafx-sdk-11.0.2\lib --add-modules=ALL-MODULE-PATH