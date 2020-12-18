package com.Frogger.Logic;

import java.io.File;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;

/**
 * MyStage class deals with playing of BGM (Background Music) throughout play session
 * 
 * @author Gabriel
 *
 */
public class MyStage extends World{
	MediaPlayer mediaPlayer;
	
	/**
	 * Method is unused
	 */
	@Override
	public void act(long now) {
		
	}
	
	
	public MyStage() {
		
//		mediaPlayer.play();
//		mediaPlayer.setOnEndOfMedia(new Runnable() {
//
//			@Override
//			public void run() {
//				mediaPlayer.seek(Duration.ZERO);
//				
//			}
//			
//		});
//		mediaPlayer.play();
	}

	/**
	 * Method to start playing BGM
	 */
	public void playMusic() {
		String musicFile = "Resources/Music/Frogger Main Song Theme (loop).mp3";   
		Media sound = new Media(new File(musicFile).toURI().toString());
		mediaPlayer = new MediaPlayer(sound);
		mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
	    mediaPlayer.play();
	}
	
	/**
	 * Method to stop playing BGM
	 */
	public void stopMusic() {
		mediaPlayer.stop();
	}

}
