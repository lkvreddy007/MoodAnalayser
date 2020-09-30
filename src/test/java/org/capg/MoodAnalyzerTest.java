package org.capg;

import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

	@Test
	public void testMoodAnalysis() throws Exception{
		MoodAnalyzer moodAnalyser=new MoodAnalyzer();
		String mood=moodAnalyser.analyseMood("This is a sad message");
		Assert.assertThat(mood, CoreMatchers.is("SAD"));
	}

}
