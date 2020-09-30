package org.capg;

public class MoodAnalyzer {
	public String analyseMood(String message) throws MoodAnalysisException {
		try {
			if(message.length()==0) {
				throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_EMPTY,"Please enter proper mood");
			}
			if(message.contains("sad")) {
				return "SAD";
			}else {
				return "HAPPY";
			}
		}
		catch (Exception e) {
			System.out.println("Exception");
			throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_NULL,"Please enter proper message");
		}
	}
}
