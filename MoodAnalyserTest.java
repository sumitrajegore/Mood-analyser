package com.moodanalyser;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.Assert;

public class MoodAnalyserTest {

		    @Test
		    public void givenMessage_whenSad_ShouldReturnSad() {
		    	
		        MoodAnalyser moodAnalyser = new MoodAnalyser("This is a Sad Message");
		        String mood = null;
		        try {
		       
		        mood = moodAnalyser.analyseMood();
		        } catch (MoodAnalyserException e) { 
		        	e.printStackTrace();
		        }
		        Assert.assertEquals("SAD",  mood);
		        System.out.println(mood);
		    }

		    @Test
		    public void givenMessage_whenNotSad_ShouldReturnHappy() {
		    	
		        MoodAnalyser moodAnalyser = new MoodAnalyser("This is a any Message");
		        String mood = null;
		        try { 
		        	
		        mood = moodAnalyser.analyseMood();
		        } catch (MoodAnalyserException e) {
		        	e.printStackTrace();
		        }
		        Assert.assertEquals("HAPPY", mood);
		        System.out.println(mood);

		    }

		    @Test
		    public void nullMood_ShouldReturnexception() {
		    	
		        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
		        try {

		            @SuppressWarnings("deprecation")
			    ExpectedException exceptionRule = ExpectedException.none();
		            exceptionRule.expect(MoodAnalyserException.class);
		            moodAnalyser.analyseMood();
		        } catch (MoodAnalyserException e) {
		            Assert.assertEquals(MoodAnalyserException.ExceptionType.NullType, e.type);
		        }
		    }

		    @Test
		    public void EmptyMood_ShouldReturnexception() {
		    	
		        MoodAnalyser moodAnalyser = new MoodAnalyser("");
		        try {

		            //@SuppressWarnings("deprecation")
			    ExpectedException exceptionRule = ExpectedException.none();
		            exceptionRule.expect(MoodAnalyserException.class);
		            moodAnalyser.analyseMood();
		        } catch (MoodAnalyserException e) {
		            Assert.assertEquals(MoodAnalyserException.ExceptionType.EmptyType, e.type);
		        }
		    }
		    
}
	

