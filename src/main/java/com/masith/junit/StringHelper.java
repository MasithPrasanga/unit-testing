package com.masith.junit;

public class StringHelper {

	public String removeFistTwoAs(String name) {

		if (name.length() <= 2)
			return name.replaceAll("A", "");

		String firstTwoLetters = name.substring(0, 2);
		String nameWithoutFirstTwoLetters = name.substring(2);

		return firstTwoLetters.replaceAll("A", "") + nameWithoutFirstTwoLetters;

	}
	
	public boolean areFirstAndLastTwoCharacterSame(String word) {
		
		if(word.length() < 2) {
			return false;
		}
		if(word.length() == 2) {
			return true;
		}
		
		String firstTwoChars = word.substring(0, 2);
		String lastTwoChars = word.substring(word.length()-2);
		
		return firstTwoChars.equals(lastTwoChars);
		
	}
}
