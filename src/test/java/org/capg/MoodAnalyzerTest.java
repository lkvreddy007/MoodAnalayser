package org.capg;

import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.hamcrest.CoreMatchers;

public class MoodAnalyzerTest {

	@Test
	public void testMoodAnalysis(){
		MoodAnalyzer moodAnalyser=new MoodAnalyzer();
		String mood=null;
		try {
			mood=moodAnalyser.analyseMood(null);
		} 
		catch (MoodAnalysisException e) {
			Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_NULL, e.type);
		}
		
	}

}