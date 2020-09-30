package org.capg;

public class MoodAnalyzer {
	public String analyseMood(String message) throws MoodAnalysisException {
		try {
			if(message.contains("sad")) {
				return "SAD";
			}else {
				return "HAPPY";
			}
		}
		catch (Exception e) {
			System.out.println("Exception");
			throw new MoodAnalysisException("Please enter proper message");
		}
	}
}
