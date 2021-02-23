package com.moodanalyser;

public class MoodAnalyser {
	
	   public String message;
           
           public MoodAnalyser(String message) {
	    	
		        super();
		        this.message = message;
	   	}
	   public String analyseMood() {
			
		try { 
		if (message.isEmpty()) throw new MoodAnalyserException("Entered value is empty", MoodAnalyserException.ExceptionType.EmptyType);

	         	if (message.contains("Sad")) {
		        	
		        	return "SAD"; 
		            	} else {
		                return "HAPPY";
		        }
	         } catch (NullPointerException e) {

                 throw new MoodAnalyserException("Enterd value is null", MoodAnalyserException.ExceptionType.NullType);
                }
	  }
}
	
