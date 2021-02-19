package com.moodanalyser;
import org.junit.jupiter.api.Test;
import org.junit.Assert;

public class MoodAnalyserTest {

		    @Test
		    public void givenMessage_whenSad_ShouldReturnSad() {
		        MoodAnalyser moodAnalyser = new MoodAnalyser();
		        String mood = moodAnalyser.analyseMood("This is a Sad Message");
		        Assert.assertEquals("SAD",  mood);
		        System.out.println(mood);
		    }
		    @Test
		    public void givenMessage_whenNotSad_ShouldReturnHappy() {
		        MoodAnalyser moodAnalyser = new MoodAnalyser();
		        String mood = moodAnalyser.analyseMood("This is a any Message");
		        Assert.assertEquals("HAPPY", mood);
		        System.out.println(mood);

		    }
		}
	
