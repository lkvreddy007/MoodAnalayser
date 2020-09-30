package org.capg;

import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.hamcrest.CoreMatchers;

public class MoodAnalyzerTest {

	@Test
	public void testMoodAnalysis() throws Exception{
		MoodAnalyzer moodAnalyser=new MoodAnalyzer();
		String mood=null;
		try {
			ExpectedException exceptionRule=ExpectedException.none();
			exceptionRule.expect(MoodAnalysisException.class);
			mood=moodAnalyser.analyseMood(null);
			Assert.assertThat(mood, CoreMatchers.is("HAPPY"));
		} 
		catch (MoodAnalysisException e) {
			System.out.println(e);
		}
		
	}

}