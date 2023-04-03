package EnglishEducation;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class GraduationSound extends Thread{
	
public void run()  {
				
		
		try {
		AudioInputStream stream 
		= AudioSystem.getAudioInputStream(new BufferedInputStream(new FileInputStream("/Applications/Battle Crowd Celebrate Stutter.wav")));

		Clip clip = AudioSystem.getClip();
		clip.open(stream);
		clip.start();
		Thread.sleep(1000);
		
		}catch(Exception e){
			
		}
		
		
	}

	
	
}
