package com.moodanalyser;

public class MoodAnalyser {
	
	   public String message;
           
           public MoodAnalyser(String message) {
	    	
		        super();
		        this.message = message;
	   	}
	   public String analyseMood() {
			
		try {

	         if (message.contains("Sad")) {
		        
		        	return "SAD"; 
		            } else {
		                return "HAPPY";
		            }
			    } catch (NullPointerException e) {
				
				return "Happy";
			    }
	    	}
}
	
