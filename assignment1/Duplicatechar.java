package com.assignment1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Duplicatechar {

	public static void main(String[] args) {
		// Write a program to find number of duplicate(repeated) character in the string.?
		
		String str = "Hello mummy";	
		
		//converting the variable str into Character array and storing it into chars 
		char[] chars = str.toCharArray();
		
		//Creating map and using character for assigning characters & integer for count of the repeated character
		Map<Character, Integer> charMap = new HashMap<>();
		
		//logic :- characters are inserted as keys & count as values , if map already contains the character then increase the value by 2 
		for(Character ch : chars)
		{
			if(charMap.containsKey(ch))
			{
				charMap.put(ch, charMap.get(ch)+1);
			}
			else
			{
				charMap.put(ch, 1);
			}
		}
		
		Set<Character> keys = charMap.keySet();
		for(Character ch : keys)
		{
			if(charMap.get(ch)>1) 
			{
			 System.out.println(ch+" "+charMap.get(ch));	
			}
		}
	}

}
