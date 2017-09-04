package com.masith.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.masith.junit.StringHelper;

public class StringHelperTest {

	StringHelper stringHelper;

	@Before
	public void before() {
		stringHelper = new StringHelper();
	}
	
	@After
	public void after() {
		stringHelper = null;
	}
	
	@Test
	public void testTemoveFistTwoAs() {
		assertEquals("BC",stringHelper.removeFistTwoAs("AABC"));
		assertEquals("",stringHelper.removeFistTwoAs("AA"));
		assertEquals("BCD",stringHelper.removeFistTwoAs("ABCD"));
		assertEquals("XYZ",stringHelper.removeFistTwoAs("XYZ"));
		
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











