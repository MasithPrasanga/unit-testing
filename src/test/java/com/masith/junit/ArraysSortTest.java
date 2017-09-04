package com.masith.junit;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArraysSortTest {

	
	@Test
	public void testArraysSort() {
		int numbers[] = {6,5,4,3,2,1};
		int expectedOutput[] = {1,2,3,4,5,6};
		Arrays.sort(numbers);
		assertArrayEquals(expectedOutput,numbers);
	}
	
	@Test(expected = NullPointerException.class)
	public void testArraysSortWithNullCondition() {
		int numbers[] = null;
		Arrays.sort(numbers);
	}
	
	@Test(timeout = 150)
	public void testArraysSortPerformance() {
		for(int i=0;i<1000000;i++) {
			int numbers[] = {i,i-1,i+1};
			Arrays.sort(numbers);
		}
	}
	
	

}










