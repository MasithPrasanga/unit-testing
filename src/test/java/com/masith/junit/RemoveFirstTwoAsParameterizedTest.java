package com.masith.junit;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.masith.junit.StringHelper;

@RunWith(Parameterized.class)
public class RemoveFirstTwoAsParameterizedTest {

	StringHelper stringHelper;

	@Before
	public void before() {
		stringHelper = new StringHelper();
	}
	
	@After
	public void after() {
		stringHelper = null;
	}
	
	private String input;
	private String expectedOutput;
	
	public RemoveFirstTwoAsParameterizedTest(String input, String expectedOutput) {
		super();
		this.input = input;
		this.expectedOutput = expectedOutput;
	}

	@Parameters
	public static Collection testCondition() {
		String expectedOutput[][] = {
				{"AACD","CD"},
				{"ACD","CD"},
				{"CDEF","CDEF"},
				{"CDAA","CDAA"}
		};
		return Arrays.asList(expectedOutput);
	}
	
	@Test
	public void testRemoveFistTwoAs() {
		assertEquals(expectedOutput,stringHelper.removeFistTwoAs(input));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharacterSame() {
		assertFalse(stringHelper.areFirstAndLastTwoCharacterSame("A"));
		assertTrue(stringHelper.areFirstAndLastTwoCharacterSame("AB"));
		assertFalse(stringHelper.areFirstAndLastTwoCharacterSame("ABC"));
		assertTrue(stringHelper.areFirstAndLastTwoCharacterSame("AAAA"));
		assertTrue(stringHelper.areFirstAndLastTwoCharacterSame("ABCAB"));
		assertTrue(stringHelper.areFirstAndLastTwoCharacterSame("ABCDEAB"));
	}

}











