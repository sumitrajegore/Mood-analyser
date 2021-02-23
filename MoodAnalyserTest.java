import org.junit.Test;
import org.junit.Assert;

public class MoodAnalyserTest {

		    @Test
		    public void givenMessage_whenSad_ShouldReturnSad() {
		    	
		        MoodAnalyser moodAnalyser = new MoodAnalyser("This is a Sad Message");
		        String mood = moodAnalyser.analyseMood();
		        Assert.assertEquals("SAD",  mood);
		        System.out.println(mood);
		    }
		    @Test
		    public void givenMessage_whenNotSad_ShouldReturnHappy() {
		    	
		        MoodAnalyser moodAnalyser = new MoodAnalyser("This is a any Message");
		        String mood = moodAnalyser.analyseMood();
		        Assert.assertEquals("HAPPY", mood);
		        System.out.println(mood);

		    }
		    
		    @Test
		    public void nullMood_ShouldReturnHappy() {
		    	
		        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
		        String mood = moodAnalyser.analyseMood();
		        Assert.assertEquals("Happy", mood);
		        System.out.println(mood);

		    }
}
